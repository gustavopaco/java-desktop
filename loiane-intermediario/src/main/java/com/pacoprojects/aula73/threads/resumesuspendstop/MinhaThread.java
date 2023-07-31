package main.java.com.pacoprojects.aula73.threads.resumesuspendstop;

public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        Thread thread = new Thread(this, this.nome);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + this.nome);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + this.nome + ", " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (this.foiTerminada) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + this.nome + " finalizada.");
    }

    public void suspend() {
        this.estaSuspensa = true;
    }

    public synchronized void resume() {
        this.estaSuspensa = false;
        notify();
    }

    public synchronized void stop() {
        this.foiTerminada = true;
        notify();
    }
}
