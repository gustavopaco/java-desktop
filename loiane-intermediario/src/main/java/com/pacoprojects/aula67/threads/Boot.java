package main.java.com.pacoprojects.aula67.threads;

import main.java.com.pacoprojects.aula67.threads.model.MinhaThread;

public class Boot {
    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread("Thread #1", 300);

        // Passando o start da thread para dentro do construtor
        //thread.start();

        MinhaThread thread2 = new MinhaThread("Thread #2",900);

        MinhaThread minhaThread = new MinhaThread("Thread #3", 1500);
    }
}
