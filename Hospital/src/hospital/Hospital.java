
package hospital;

import interfaz.Ventana;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Hospital {

    public static void main(String[] args) throws InterruptedException, IOException {
        
        // Fichero log
        FileWriter fichero = null;
        fichero = new FileWriter("evolucionHospital.txt");
        EvolucionHospital eh = new EvolucionHospital(fichero);
        
        // Creación sala vacunación, sala observación  y recepción
        Recepcion r = new Recepcion(2000, eh);
        SalaVacunacion sv = new SalaVacunacion(10, eh);
        SalaObservacion so = new SalaObservacion(20, sv, eh);
        SalaDescanso sd = new SalaDescanso();
        DepositoVacunas dv = new DepositoVacunas(2000);
        
        
        // Creación de los dos auxiliares
        Auxiliar a1 = new Auxiliar("A1", r, dv, sv, sd, eh);
        Auxiliar a2 = new Auxiliar("A2", r, dv, sv, sd, eh);
        a1.start();
        a2.start();
        
        // Creación de los 10 sanitarios
        for (int j=1; j<11; j++) {
            String id = String.format("%02d", j);
            Sanitario s = new Sanitario(id, dv, sv, sd, so, a1, eh);
            s.start();
        }
          
        // Creación de 2000 pacientes
        boolean citado = true;
        int noCitados = 0; 
        for (int i=1; i<2001; i++) {

            if (noCitados < 20) { //1% de 2000 pacientes, son 20 pacientes no citados
                citado = Math.random() < 0.5;
                if (!citado) noCitados++;
            }
            else {
                citado = true;
            }
            String id = String.format("%04d", i);
            Paciente p = new Paciente(id, citado, r, so, sv);
            p.start();
        }
        
        // Creación del gestor y de las interfaces
        try {
            Gestor gestor = new Gestor(r, sv, so, sd, dv, a1, a2);
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/ObjetoGestor", gestor);
            Ventana v = new Ventana(gestor); // Ventana local
            Ventana v2 = new Ventana();      // Ventana remota
        } catch (Exception e) {
            System.out.println(" Error: " +  e.getMessage());
            e.printStackTrace();
        }
    }
}