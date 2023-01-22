
package hospital;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Auxiliar extends Thread {
    
    private String id;
    private Recepcion r;
    private SalaVacunacion sv;
    private SalaDescanso sd;
    private Paciente p;
    private EvolucionHospital eh;
    private DepositoVacunas dv;
    private boolean descanso;
    int pos;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public Auxiliar(String id, Recepcion r, DepositoVacunas dv, SalaVacunacion sv, SalaDescanso sd, EvolucionHospital eh) {
        this.id = id;
        this.r = r;
        this.dv = dv;
        this.sv = sv;
        this.sd = sd;
        this.eh = eh;
        this.p = p;
        this.descanso = descanso;
    }
    
    public void run(){
        try {
            while (true) {
                descanso = false;
                if (id == "A1") {
                    
                    //Descansa cada 10 pacientes que lleva o no a la sala de vacunación
                    for (int numPacientes = 0; numPacientes < 10; numPacientes++) {
                        sleep(500 + (int) (500 * Math.random())); //tarda entre 0.5 - 1 segundos
                        p = r.extraer();
                        this.setPaciente(p);
                        
                        //Si está citado, entra en la sala de vacunación
                        if (p.isCitado()) {
                            sv.insertarPaciente(p);
                            
                        } else {
                            String frase = "Paciente " + p.getIdPaciente() + " ha acudido sin cita.";
                            System.out.println(frase);
                            eh.escribir(dtf.format(LocalDateTime.now()) + "  " + frase);
                        }
                        
                    }
                    //Descansa tras 10 pacientes
                    descanso = true;
                    sd.insertar(this); //Entra en la sala de descanso
                    eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Auxiliar " + id + " entra la sala de descanso.");
                    sleep(3000 + (int) (2000 * Math.random()));  //Descansa entre 3 y 5 segundos
                    sd.extraer(this); //Sale de la sala de descanso
                    eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Auxiliar " + id + " sale de la sala de descanso.");
                    
                }
                else { //A2
                    
                    //Descansa cada 20 vacunas
                    for (int i=0; i<20; i++){
                        //Crea una vacuna y la inserta en el deposito
                        Object vacuna = new Object();
                        sleep(500 + (int) (500 * Math.random()));
                        dv.insertar(vacuna);
                    }
                    
                    descanso = true;
                    sd.insertar(this);
                    eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Auxiliar " + id + " entra la sala de descanso.");
                    sleep(1000 + (int) (3000 * Math.random())); // Descansa entre 1 y 4 segundos
                    sd.extraer(this);
                    eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Auxiliar " + id + " sale de la sala de descanso.");
                }
            }
        } catch (InterruptedException e) {} catch (IOException ex) {
            Logger.getLogger(Auxiliar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void registroVacunacion(Sanitario s, Paciente p) throws IOException{
        // Lleva el registro de vacunación, lo muestra por pantalla y lo escribe en el log
        String frase = "Paciente " + p.getIdPaciente() + " vacunado en el puesto " +
            (s.getPuestoVacunacion()+1) + " por " + s.getIdSanitario();
        System.out.println(frase);
        eh.escribir(dtf.format(LocalDateTime.now()) + "  " + frase);
    }
    
    public String getIdAux() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return p;
    }

    public void setPaciente(Paciente p) {
        this.p = p;
    }

    public boolean isDescanso() {
        return descanso;
    }

    public void setDescanso(boolean descanso) {
        this.descanso = descanso;
    }
    
    
    @Override
    public String toString() {
        return id;
    }
}