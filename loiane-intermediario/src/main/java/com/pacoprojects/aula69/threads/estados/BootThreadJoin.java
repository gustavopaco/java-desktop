package main.java.com.pacoprojects.aula69.threads.estados;

import main.java.com.pacoprojects.aula69.threads.estados.model.MinhaThreadRunnable;

public class BootThreadJoin {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 1000);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 300);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 300);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

        t2.start();

        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
