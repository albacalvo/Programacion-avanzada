
package hospital;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Recepcion {
    
    private Paciente[] colaPacientes;
    private int in=0, out=0, numElem=0,maximo=0;
    private Lock control = new ReentrantLock();
    private Condition vacio = control.newCondition();
    private Condition lleno = control.newCondition();
    private EvolucionHospital eh;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public Recepcion(int max, EvolucionHospital eh){
        this.maximo = max;
        this.eh = eh;
        this.colaPacientes = new Paciente[max];
    }
    
    public void insertar(Paciente p) throws InterruptedException, IOException {
        control.lock();
        try{
            in = 0;
            while(colaPacientes[in] != null) {
                in++;
            }
            colaPacientes[in] = p;
            numElem++;
            in = (in+1) % maximo;
            vacio.signal();
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " +"El paciente "
                    + p.getIdPaciente() + " ha entrado en la recepcion.");
        } finally { control.unlock();}
    }
    
    public Paciente extraer() throws InterruptedException, IOException {
        control.lock();
        while(numElem == 0){
            vacio.await();
        }
        try{
            Paciente p;
            p = colaPacientes[out];
            colaPacientes [out] = null;
            out = (out + 1) % maximo;
            numElem = numElem - 1;
            lleno.signal();
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " +"El paciente " + p.getIdPaciente() + " ha salido de la recepcion.");
            return p;
        
        } finally{
            control.unlock();
        }
    }

    public Paciente[] getColaPacientes() {
        return this.colaPacientes;
    }
    
}