
package hospital;

import static java.lang.Thread.sleep;
import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SalaDescanso {
    private Object[] cola;
    private int in=0, out=0, numElem=0;
    private Lock control = new ReentrantLock();
    private Condition vacio = control.newCondition();
    
    public SalaDescanso(){
        cola = new Object[2000];
        this.cola = cola;
    }
    
    public void insertar(Object obj) throws InterruptedException {
        control.lock();
        
        try{
            in = 0;
            while(cola[in] != null) {
                in++;
            }
            cola[in] = obj;
            numElem++;   
            vacio.signal();
            
        } finally { control.unlock();}
    }
    
    public void extraer(Object obj) throws InterruptedException {
        control.lock();
        while(numElem == 0){
            vacio.await();
        }
        try{
            int pos;
            pos = java.util.Arrays.asList(cola).indexOf(obj);
            cola [pos] = null;
            
            numElem = numElem - 1;
        }
        finally{
            control.unlock();
        }
    }

    public Object[] getCola() {
        return cola;
    }
    
}
