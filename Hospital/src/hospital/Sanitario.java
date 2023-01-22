
package hospital;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sanitario extends Thread {
    
    private String id;
    private SalaVacunacion sv;
    private SalaObservacion so;
    private SalaDescanso sd;
    private Paciente p;
    private DepositoVacunas dv;
    private int puestoVacunacion;
    private Auxiliar a1;
    private boolean disponible;
    private boolean necesitaSanitario;
    private Paciente paciente;
    private EvolucionHospital eh;
    private int puesto;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public Sanitario(String id, DepositoVacunas dv, SalaVacunacion sv, SalaDescanso sd, SalaObservacion so, Auxiliar a1, EvolucionHospital eh) throws InterruptedException {
        this.id = "S" + id;
        this.dv = dv;
        this.sv = sv;
        this.sd = sd;
        this.so = so;
        this.puestoVacunacion = puestoVacunacion;
        this.a1 = a1;
        this.p = p;
        this.disponible = disponible;
        this.necesitaSanitario = false;
        this.paciente = paciente;
        this.eh = eh;
    }
    
    public void run() {
        try {
            //Entran a la sala de decanso a cambiarse
            sd.insertar(this);
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Sanitario " + id + " entra al hospital y se cambia en la sala de descanso.");
            sleep(5000 + (int) (3000 * Math.random()));
            sd.extraer(this);
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Sanitario " + id + " sale de la sala de descanso despues de cambiarse.");
            
            while (true) {
                
                //Comprueba que hay pacientes con reaccion
                paciente = so.tratarPaciente();
                
                //Si hay un paciente, lo trata
                if(paciente != null) {
                    puesto = so.insertarSanitario(this, paciente);
                    
                    //Sanitario trata al paciente con reaccion (2-5 s)
                    eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Paciente " 
                            + paciente.getIdPaciente()+ " sufre una reaccion y es atendido por" + id);
                    sleep(5000 + (int) Math.random() * 3000);
                    so.extraerSanitario(puesto);
                    paciente.setReaccion(false); 
                    paciente = null;
                }
                //Entra en la sala de vacunación
                puestoVacunacion = sv.insertarSanitario(this);
                
                //Va a la sala de descanso cada 15 pacientes vacunados
                for (int vacunados = 0; vacunados < 15; vacunados++) {

                    if (sv.puestoListo(puestoVacunacion)) {

                        //Coge una vacuna si hay disponibles
                        dv.extraer();

                        //Vacuna al paciente (3-5 s) y lo lleva a la sala de observacion
                        sleep(3000 + (int) (2000 * Math.random()));
                        p = sv.extraerPaciente(puestoVacunacion);
                        p.setVacunado(true);
                        a1.registroVacunacion(this, p);
                    }
                }
                    //Cierra su puesto y sale de la sala de vacunación
                    sv.extraerSanitario(this);

                    //Descansa de 5 a 8 segundos
                    sd.insertar(this);
                    eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Sanitario " + id + " entra en la sala de descanso.");
                    sleep(5000 + (int) (3000 * Math.random()));
                    sd.extraer(this);
                    setDisponible(true);

                    eh.escribir(dtf.format(LocalDateTime.now()) + "  " + "Sanitario " + id + " sale de la sala de descanso.");
                
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Sanitario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sanitario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getIdSanitario() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean necesitaSanitario() {
        return necesitaSanitario;
    }

    public void setNecesitaSanitario(boolean necesitaSanitario) {
        this.necesitaSanitario = necesitaSanitario;
    }
    
    public int getPuestoVacunacion() {
        return puestoVacunacion;
    }

    public void setPuestoVacunacion(int puestoVacunacion) {
        this.puestoVacunacion = puestoVacunacion;
    }
    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
 
    @Override
    public String toString() {
        return id;
    }

}