
package hospital;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SalaObservacion {
    
    private Paciente[] colaPacientes;
    private Paciente[] reacciones;
    private Sanitario[] sanitarios;
    private Sanitario sanitario;
    private Paciente paciente;
    private int i=0, puesto=0, numPacientes=0,maximo=0, numreacciones= 0, numSanitarios=0;
    private Lock control = new ReentrantLock();
    private Condition lleno = control.newCondition();
    private Condition vacio = control.newCondition();
    private Condition llenoS = control.newCondition();
    private Condition vacioS = control.newCondition();
    private Condition llenor = control.newCondition();
    private SalaVacunacion sv;
    private EvolucionHospital eh;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    
    public SalaObservacion(int max, SalaVacunacion sv, EvolucionHospital eh){
        this.maximo = max;
        colaPacientes = new Paciente[max];
        sanitarios = new Sanitario[max];
        reacciones = new Paciente[max];
        this.sv = sv;
        this.sanitario = sanitario;
        this.eh = eh;
        this.colaPacientes = colaPacientes;
        
    }
    
    public int insertarPaciente(Paciente obj) throws InterruptedException, IOException {
        control.lock();
        while (numPacientes == maximo){
            lleno.await();
        }
        try{
            i = 0;
            while(colaPacientes[i] != null) {
                i++;
            }
            colaPacientes[i] = obj;
            numPacientes++;
            vacio.signal();
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Paciente " + obj.getIdPaciente() +
                    " entra en la sala de observacion en el puesto " + (i+1));
            return i;
        } finally { control.unlock();}
    }
    
    public Paciente extraerPaciente(int pos) throws InterruptedException, IOException {
        control.lock();
        while(numPacientes == 0){
            vacio.await();
        }
        try{
            Paciente obj;
            obj = colaPacientes[pos];
            colaPacientes[pos] = null;
            numPacientes = numPacientes - 1;
            lleno.signal();
            
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Paciente " + obj.getIdPaciente() +
                    " sale de la sala de observacion en el puesto " + (pos+1));
            return obj;
        }
        finally{
            control.unlock();
        }
    }
    
    public int insertarSanitario(Sanitario obj, Paciente p) throws InterruptedException, IOException {
        control.lock();
        while (numSanitarios == maximo){
            llenoS.await();
        }
        try{
            i = 0;
            while(colaPacientes[i]== null && !colaPacientes[i].equals(p)) {
                i++;
            }
            sanitarios[i] = obj;
            numSanitarios++;
            vacioS.signal();
            return i;
        } finally { control.unlock();}
    }
    
    public Sanitario extraerSanitario(int pos) throws InterruptedException, IOException {
        control.lock();
        while(numSanitarios == 0){
            vacioS.await();
        }
        try{
            Sanitario obj;
            obj = sanitarios[pos];
            sanitarios[pos] = null;
            numSanitarios = numSanitarios - 1;
            llenoS.signal();
            return obj;
        }
        finally{
            control.unlock();
        }
    }
    
    public void solicitarSanitario(Paciente p) throws InterruptedException {
        control.lock();
        while(numreacciones == maximo) {
            llenor.await();
        }
        try {
            i = 0;
            while(reacciones[i] != null) {
                i++;
            }
            reacciones[i] = p;
            numreacciones++;    
        }
        finally {
            control.unlock();
        }  
    }
    
    public Paciente tratarPaciente() throws InterruptedException  {
        control.lock();

        try {
            i = 0;
            while(i<reacciones.length && reacciones[i] == null) {
                i++;
            }
            if(i!= reacciones.length) {
                paciente = reacciones[i];
                reacciones[i] = null;
                numreacciones--;
                llenor.signal();     
            } else {
                paciente = null;
            }
            return paciente;
        }
        finally {
            control.unlock();
        }
    }

    public int getNumSanitarios() {
        return numSanitarios;
    }

    public Paciente[] getColaPacientes() {
        return colaPacientes;
    }

    public Sanitario[] getSanitarios() {
        return sanitarios;
    }
    
    
}