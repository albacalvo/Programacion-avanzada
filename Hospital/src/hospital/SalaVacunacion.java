
package hospital;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SalaVacunacion {
    
    private Paciente[] colaPacientes;
    private Sanitario[] colaSanitarios;
    private int in=0, i = 0, numPacientes=0, numSanitarios=0, maximo=0;
    private Lock control = new ReentrantLock();
    
    private Condition lleno = control.newCondition();
    private Condition vacio = control.newCondition();
    private Condition llenoP = control.newCondition();
    private Condition vacioP = control.newCondition();
    private Condition listo = control.newCondition();
    private Condition abierto = control.newCondition();
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private EvolucionHospital eh;
    
    public SalaVacunacion(int max, EvolucionHospital eh){
        this.maximo = max;
        this.eh = eh;
        colaPacientes = new Paciente[max];
        colaSanitarios = new Sanitario[max];
    }
    
    public int insertarSanitario(Sanitario obj) throws InterruptedException, IOException {
        control.lock();
        while (numSanitarios == maximo) {
            lleno.await();
        }
        try {
            i = 0;
            while(colaSanitarios[i] != null) {
                i++;
            }
            colaSanitarios[i] = obj;
            int pos = i;
            numSanitarios++;
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " +"El paciente "
                    + obj.getIdSanitario() + " ha entrado en la sala de vacunacion.");
            vacio.signal();
            abierto.signal(); 
            return pos;
        } finally { control.unlock();}
    }
    
    public void insertarPaciente(Paciente obj) throws InterruptedException, IOException {
        control.lock();
        while (numPacientes == maximo){
            llenoP.await();
        }
        while (numSanitarios == 0) {
            abierto.await();
        }
        try{
            in = 0;
            while(colaPacientes[in] != null) {
                in++;
            }
            while (colaSanitarios[in] == null) {
                abierto.await();
            }
            colaPacientes[in] = obj;
            //El sanitario tiene un paciente en su puesto por tanto no está disponible
            colaSanitarios[in].setDisponible(false);
            numPacientes++;
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " +"El paciente "
                    + obj.getIdPaciente() + " ha entrado en la sala de vacunacion.");
            vacioP.signal();
            listo.signal();
            
        } finally { control.unlock();}
    }
    
    public Paciente extraerPaciente(int pos) throws InterruptedException, IOException {
        control.lock();
        while(numPacientes == 0){
            vacioP.await();
        }
        try{
            Paciente obj;
            obj = colaPacientes[pos];
            colaPacientes[pos] = null;
            numPacientes = numPacientes - 1;
            llenoP.signal();
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " +"El paciente "
                    + obj.getIdPaciente() + " ha salido de la sala de vacunacion.");
            return obj;
        }
        finally{
            control.unlock();
        }
    }
    
    public Sanitario extraerSanitario(Sanitario obj) throws InterruptedException, IOException {
        control.lock();
        while(numSanitarios == 0){
            vacio.await();
        }
        try{
            
            int i;
            i = java.util.Arrays.asList(colaSanitarios).indexOf(obj);
            colaSanitarios[i] = null;
            numSanitarios = numSanitarios - 1;
            obj.setDisponible(true);
            eh.escribir(dtf.format(LocalDateTime.now()) + "  " +"El paciente "
                    + obj.getIdSanitario() + " ha salido de la sala de vacunacion.");
            lleno.signal();
            return obj;
        }
        finally{
            control.unlock();
        }
    }
     
    public boolean puestoListo(int pos) throws InterruptedException {
        control.lock();
        boolean l = false;
        while(colaPacientes[pos] == null){
            listo.await();
        }
        try {
            if (colaPacientes[pos] != null) {
                l = true;
            }
            return l;
        } finally { control.unlock(); }
    }

    public void buscarSanitario(Paciente paciente) throws InterruptedException {
        control.lock();
        int puesto = 0;
        while(numSanitarios == 0) {
            vacio.await();
        }
        try{
            
            while(colaSanitarios[puesto] == null && puestoListo(puesto)) {
                puesto++;
            }
            
            colaSanitarios[puesto].setNecesitaSanitario(true);
            colaSanitarios[puesto].setPaciente(paciente);
  
        } finally { control.unlock();}
    }

    public Paciente[] getColaPacientes() {
        return colaPacientes;
    }

    public Sanitario[] getColaSanitarios() {
        return colaSanitarios;
    }

}