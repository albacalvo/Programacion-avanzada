
package hospital;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DepositoVacunas {
    private Object[] vacunas;
    private int in=0, out=0, numElem=0,maximo=0;
    private Lock control = new ReentrantLock();
    private Condition lleno = control.newCondition();
    private Condition vacio = control.newCondition();
    
    public DepositoVacunas(int max){
        this.maximo = max;
        this.numElem = numElem;
        vacunas = new Object[max];
    }
    
    public void insertar(Object obj) throws InterruptedException {
        control.lock();
        while (numElem == maximo){
            lleno.await();
        }
        try{
            vacunas[in] = obj;
            numElem++;
            in = (in+1) % maximo;
            vacio.signal();
            System.out.println("vacunas: " + numElem);
        } finally { control.unlock();}
    }
    
    public Object extraer() throws InterruptedException {
        control.lock();
        while(numElem == 0){
            vacio.await();
        }
        try{
            Object obj;
            obj = vacunas[out];
            vacunas [out] = null;
            out = (out + 1) % maximo;
            numElem = numElem - 1;
            lleno.signal();
            System.out.println("vacunas: " + numElem);
            return obj;
        }
        finally{
            control.unlock();
        }
    }

    public int getNumElem() {
        return numElem;
    }
    
}
