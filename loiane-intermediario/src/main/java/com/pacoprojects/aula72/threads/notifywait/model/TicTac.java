package main.java.com.pacoprojects.aula72.threads.notifywait.model;

public class TicTac {
    private boolean tique;

    public synchronized void tique(boolean estaExecutando) {
        if (!estaExecutando) {
            this.tique = true;
            notify();
            return;
        }
        System.out.print("Tique ");
        this.tique = true;

        notify();

        try {
            while (this.tique) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void taque(boolean estaExecutando) {
        if (!estaExecutando) {
            this.tique = false;
            notify();
            return;
        }
        System.out.println("Taque ");
        this.tique = false;

        notify();

        try {
            while (!this.tique) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
