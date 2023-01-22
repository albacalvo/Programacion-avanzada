
package interfaz;

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface InterfazGestor extends Remote {
    
    public String getAuxiliarV() throws RemoteException;
    public String getPacienteO(int pos) throws RemoteException;
    public String getColaRecepcion() throws RemoteException;
    public String getColaDescanso() throws RemoteException;
    public String getSanitarioVacunacion(int pos) throws RemoteException;
    public String getPacienteVacunacion(int pos) throws RemoteException;
    public String getPacienteRecepcion() throws RemoteException;
    public String getAuxiliarR() throws RemoteException;
    public int numVacunas() throws RemoteException;
    public void cerrarPuestoVacunacion(int puesto) throws RemoteException;
    public void insertarSanitario() throws RemoteException;
}
