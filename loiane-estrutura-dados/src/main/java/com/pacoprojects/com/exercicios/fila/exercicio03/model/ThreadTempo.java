package main.java.com.pacoprojects.com.exercicios.fila.exercicio03.model;

public class ThreadTempo implements Runnable {

    private int horas;
    private int minutos;
    private int segundos;
    private boolean desligar;
    private Thread thread;

    public ThreadTempo() {
        thread = new Thread(this);
    }

    @Override
    public void run() {
        try {
            while (!desligar) {
                Thread.sleep(1000);
                segundos++;
                calcularTempo();
                imprimirTempo();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ligarThread() {
        if (!thread.isAlive()) {
            thread.start();
        }
    }

    public synchronized void desligar() {
        this.desligar = true;
    }

    private synchronized void calcularTempo() {
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos >= 60) {
            minutos = 0;
            horas++;
        }
    }

    private synchronized void imprimirTempo() {
        System.out.printf("Tempo %02d:%02d:%02d %n", horas, minutos, segundos);
    }

    public synchronized int getSegundos() {
        return segundos;
    }
}
