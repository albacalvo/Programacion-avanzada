
package hospital;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.locks.*;

public class EvolucionHospital {
    private FileWriter fichero;
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock w = lock.writeLock();

    public EvolucionHospital (FileWriter fichero) {
        this.fichero = fichero;
    }
    
    public void escribir(String frase) throws IOException {
        w.lock();
        try
        {
            fichero = new FileWriter("evolucionHospital.txt", true);
            fichero.write("\n" + frase);
            
        } finally {
           try {
                
                if (null != fichero) {
                    fichero.close();
                }
           } catch (Exception e2) {
              e2.printStackTrace();
           }
           w.unlock();
        }
        
    }
        
}
