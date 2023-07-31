package main.java.com.pacoprojects.aula74.threads.deadlock;

import main.java.com.pacoprojects.aula74.threads.deadlock.model.MinhaThread;

public class Boot {
    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("#1", true);
        MinhaThread thread2 = new MinhaThread("#2", false);
    }
}
