package main.java.com.pacoprojects.aula68.threads.runnable;

import main.java.com.pacoprojects.aula68.threads.runnable.model.MinhaThreadRunnable;

public class Boot {
    public static void main(String[] args) {
        MinhaThreadRunnable threadRunnable = new MinhaThreadRunnable("MinhaThread #1", 500);
    }
}
