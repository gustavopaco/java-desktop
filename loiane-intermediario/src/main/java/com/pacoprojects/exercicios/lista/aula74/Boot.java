package main.java.com.pacoprojects.exercicios.lista.aula74;

import main.java.com.pacoprojects.exercicios.lista.aula74.model.MinhaThread;
import main.java.com.pacoprojects.exercicios.lista.aula74.model.Semaforo;

public class Boot {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        MinhaThread t1 = new MinhaThread("#1", semaforo);
        MinhaThread t2 = new MinhaThread("#2", semaforo);
        MinhaThread t3 = new MinhaThread("#3", semaforo);

        try {
            t1.getThread().join();
            t2.getThread().join();
            t3.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        MinhaThread t3 = new MinhaThread("#3", semaforo);


    }
}
