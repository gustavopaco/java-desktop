package main.java.com.pacoprojects.aula71.threads.syncronizeds;

import main.java.com.pacoprojects.aula71.threads.syncronizeds.model.MinhaThreadSoma;

public class Boot {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        MinhaThreadSoma thread1 = new MinhaThreadSoma("#1", array);
        MinhaThreadSoma thread2 = new MinhaThreadSoma("#2", array);
    }
}
