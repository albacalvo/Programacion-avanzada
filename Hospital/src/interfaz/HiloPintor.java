
package interfaz;

import hospital.*;
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloPintor extends Thread {
    
    private InterfazGestor gestor;
    private Ventana ventana;
    Paciente [] colaPacientes;
    private boolean[] puestosPorCerrar = new boolean[10];
    private boolean remoto = false;
    
    public HiloPintor(Ventana ventana) {
        this.ventana = ventana;
    }
    public HiloPintor(Gestor gestor, Ventana ventana) {
        this.gestor = gestor;
        this.ventana = ventana;
    }
    
    public void run() {
        if (gestor == null) {
            remoto = true;
        }
        while (true) {
            
            try {
                if (remoto) {
                    gestor = (InterfazGestor) Naming.lookup("//localhost/ObjetoGestor");
                    puestosPorCerrar = ventana.getPuestosPorCerrar();
                    for (int i=0; i < puestosPorCerrar.length; i++) {
                        //Si se ha pedido que se cierre el puesto de vacunacion
                        if(puestosPorCerrar[i]) {
                            gestor.cerrarPuestoVacunacion(i);
                            ventana.setPuestosCerrados();
                        }
                    }
                }
                
                
                //Recepcion
                ventana.mostrarRecepcion(gestor.getColaRecepcion(),
                        gestor.getPacienteRecepcion(), gestor.getAuxiliarR());
                
                //Sala de vacunacion
                ventana.mostrarVacunas(gestor.numVacunas(), gestor.getAuxiliarV() );
                ventana.mostrarPV1(gestor.getSanitarioVacunacion(0), gestor.getPacienteVacunacion(0));
                ventana.mostrarPV2(gestor.getSanitarioVacunacion(1), gestor.getPacienteVacunacion(1));
                ventana.mostrarPV3(gestor.getSanitarioVacunacion(2), gestor.getPacienteVacunacion(2));
                ventana.mostrarPV4(gestor.getSanitarioVacunacion(3), gestor.getPacienteVacunacion(3));
                ventana.mostrarPV5(gestor.getSanitarioVacunacion(4), gestor.getPacienteVacunacion(4));
                ventana.mostrarPV6(gestor.getSanitarioVacunacion(5), gestor.getPacienteVacunacion(5));
                ventana.mostrarPV7(gestor.getSanitarioVacunacion(6), gestor.getPacienteVacunacion(6));
                ventana.mostrarPV8(gestor.getSanitarioVacunacion(7), gestor.getPacienteVacunacion(7));
                ventana.mostrarPV9(gestor.getSanitarioVacunacion(8), gestor.getPacienteVacunacion(8));
                ventana.mostrarPV10(gestor.getSanitarioVacunacion(9), gestor.getPacienteVacunacion(9));
                
                //Sala descanso
                ventana.mostrarDescanso(gestor.getColaDescanso());
                
                //Sala observacion
                ventana.mostrarPO1(gestor.getPacienteO(0));
                ventana.mostrarPO2(gestor.getPacienteO(1));
                ventana.mostrarPO3(gestor.getPacienteO(2));
                ventana.mostrarPO4(gestor.getPacienteO(3));
                ventana.mostrarPO5(gestor.getPacienteO(4));
                ventana.mostrarPO6(gestor.getPacienteO(5));
                ventana.mostrarPO7(gestor.getPacienteO(6));
                ventana.mostrarPO8(gestor.getPacienteO(7));
                ventana.mostrarPO9(gestor.getPacienteO(8));
                ventana.mostrarPO10(gestor.getPacienteO(9));
                ventana.mostrarPO11(gestor.getPacienteO(10));
                ventana.mostrarPO12(gestor.getPacienteO(11));
                ventana.mostrarPO13(gestor.getPacienteO(12));
                ventana.mostrarPO14(gestor.getPacienteO(13));
                ventana.mostrarPO15(gestor.getPacienteO(14));
                ventana.mostrarPO16(gestor.getPacienteO(15));
                ventana.mostrarPO17(gestor.getPacienteO(16));
                ventana.mostrarPO18(gestor.getPacienteO(17));
                ventana.mostrarPO19(gestor.getPacienteO(18));
                ventana.mostrarPO20(gestor.getPacienteO(19));
                
                //Si es remoto puede cerrar puestos de vacunacion
                
                
                sleep(1000);
            } catch (InterruptedException ex) { } catch (NotBoundException ex) {
                Logger.getLogger(HiloPintor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(HiloPintor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(HiloPintor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   
}