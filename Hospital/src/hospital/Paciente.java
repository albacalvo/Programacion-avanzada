
package hospital;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.monitor.Monitor;

public class Paciente extends Thread {
    
    private String id ;
    private boolean citado;
    private Recepcion r;
    private SalaObservacion so;
    private SalaVacunacion sv;
    private int pos;
    private boolean reaccion;
    private boolean vacunado = false;

    
    public Paciente(String id, boolean citado, Recepcion r, SalaObservacion so, SalaVacunacion sv) throws InterruptedException {
        this.id = "P" + id;
        this.citado = citado;
        this.r = r;
        this.so = so;
        this.sv = sv;
        this.vacunado = false;
        this.reaccion = false;
    }
    
    public void run(){
        
        try {
            sleep(1000 + (int) (2000 * Math.random())); // Entra al hospital entre 1 y 3 segundos
            r.insertar(this);
            
            if (isVacunado()) {
                //Entran a la sala de observacion y esperan 10 s
                reaccion = Math.random() < 0.05; // A un 5% le da reaccion
                pos = so.insertarPaciente(this);
                sleep(10000);
                //Si le da reaccion solicitará a un sanitario disponible
                if (reaccion) {
                    so.solicitarSanitario(this);  
                }
                //Espera a que no haya reacción o ya ha sido tratada y sale del hospital
                if(!hasReaccion()) {
                    so.extraerPaciente(pos); 
                }               
            }
           
        } catch (InterruptedException e) {} catch (IOException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //Uso de monitores
    
    public synchronized boolean hasReaccion() {
        try {
            if (reaccion) {
                wait();
            }
        } catch (InterruptedException ie) {}
        return reaccion;
    }
    
    public synchronized void setReaccion(boolean reac) {
        reaccion = reac;
        notify();
    }
    
    public synchronized boolean isVacunado(){
        try{
            wait();
        } catch (InterruptedException ie) {}
        return vacunado;
    }
     
    public synchronized void setVacunado(boolean vac) {
        vacunado = vac;
        notify();
    }
    
    // Getters y setters
    public boolean tieneReaccion() {
        return reaccion;
    }
    
    public String getIdPaciente() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public boolean isCitado() {
        return citado;
    }

    public void setCitado(boolean citado) {
        this.citado = citado;
    }

    @Override
    public String toString() {
        return id;
    }
    
}