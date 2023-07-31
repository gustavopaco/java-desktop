package main.java.com.pacoprojects.aula70.threads.prioridade;

import main.java.com.pacoprojects.aula69.threads.estados.model.MinhaThreadRunnable;

public class Boot {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 300);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 300);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 300);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(5);
        t2.setPriority(3);
        t3.setPriority(1);

        //t1.setPriority(Thread.MAX_PRIORITY);  // Pode ser utilizado constantes tambem.

        t1.start();
        t2.start();
        t3.start();
    }
}
