
package hospital;

import interfaz.InterfazGestor;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gestor extends UnicastRemoteObject implements InterfazGestor {
    
    public Gestor() throws RemoteException{ }
    
    private Recepcion r;
    private SalaVacunacion sv;
    private SalaObservacion so;
    private SalaDescanso sd;
    private DepositoVacunas dv;
    private Auxiliar a1;
    private Auxiliar a2;
    private Sanitario sanitario;
    private boolean sanitarioAcude;
    private Paciente paciente;
    
    
    public Gestor(Recepcion r, SalaVacunacion sv, SalaObservacion so, SalaDescanso sd, DepositoVacunas dv, Auxiliar a1, Auxiliar a2) throws RemoteException{
        this.r = r;
        this.sv = sv;
        this.so = so;
        this.sd = sd;
        this.dv = dv;
        this.a1 = a1;
        this.a2 = a2;
    }
    
    
    public String getAuxiliarV() {
        String id = "";
        if (!a2.isDescanso()) {
            id = a2.getIdAux();}
        return id;
    }
    
    public String getPacienteO(int pos) {
        sanitarioAcude = false;
        String paciente = "";
        if(so.getColaPacientes()[pos] != null) {
            paciente = so.getColaPacientes()[pos].toString();
            if(so.getColaPacientes()[pos].tieneReaccion()) {
                sanitarioAcude = true;
                if (so.getSanitarios()[pos] != null) {
                    paciente += ", " + so.getSanitarios()[pos].getIdSanitario();
                }
            }
        }
        return paciente;
    }

    public boolean isSanitarioAcude() {
        return sanitarioAcude;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
    public void cerrarPuestoVacunacion(int puesto) {
        try {
            
            sanitario = sv.extraerSanitario(sv.getColaSanitarios()[puesto]);
            sanitario.setDisponible(false);
            sd.insertar(sanitario);
            
        } catch (InterruptedException ie) {} catch (IOException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertarSanitario() {
        try {
            sv.insertarSanitario(sanitario);
        } catch(InterruptedException ie) {} catch (IOException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getColaRecepcion() {
        String colaRecepcion = "";
        Paciente[] colaPacientes = r.getColaPacientes();
        for (int i=0; i < colaPacientes.length ; i++) {
            if (colaPacientes[i] != null) {
                colaRecepcion += colaPacientes[i].getIdPaciente() + ", ";
            }  
        }
        return colaRecepcion;
    }
    public String getColaDescanso() {
        String colaDescanso = "";
        Object[] cola = sd.getCola();
        for (int i=0; i < cola.length ; i++) {
            if (cola[i] != null) {
                colaDescanso += cola[i].toString() + ", ";
            }  
        }
        return colaDescanso;
    }
    public String getSanitarioVacunacion(int pos){
        String sanitario = "";
        if(sv.getColaSanitarios()[pos] != null) {
            sanitario = sv.getColaSanitarios()[pos].toString();
        }
        return sanitario;
    }
    
    public String getPacienteVacunacion(int pos){
        String paciente = "";
        if(sv.getColaPacientes()[pos] != null) {
            paciente = sv.getColaPacientes()[pos].toString();
        }
        return paciente;
    }
    
    public String getPacienteRecepcion() {
        String id = "";
        if(a1.getPaciente() != null) {
            id = a1.getPaciente().getIdPaciente();
        }
        return id;
    }
    
    
    public String getAuxiliarR() {
        String id = "";
        if (!a1.isDescanso()) {
            id = a1.getIdAux();}
        return id;
    }
    
    public int numVacunas() {
        return dv.getNumElem();
    }
    
    public SalaVacunacion getSv() {
        return sv;
    }

    public SalaObservacion getSo() {
        return so;
    }

    public SalaDescanso getSd() {
        return sd;
    }

    public DepositoVacunas getDv() {
        return dv;
    }
   
}
