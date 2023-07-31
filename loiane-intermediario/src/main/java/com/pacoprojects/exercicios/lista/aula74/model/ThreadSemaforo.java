package main.java.com.pacoprojects.exercicios.lista.aula74.model;

public class ThreadSemaforo implements Runnable {

    private String nome;
    private Semaforo semaforo;
    private boolean parar;
    private boolean corMudou;
    private Thread thread;

    public ThreadSemaforo(String nome, Semaforo semaforo) {
        this.nome = nome;
        this.parar = false;
        this.corMudou = false;
        this.semaforo = semaforo;
        this.semaforo.setCorSemaforo(CorSemaforo.VERMELHO);
        thread = new Thread(this, nome);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        while (!this.parar) {
            try {
                switch (semaforo.getCorSemaforo()) {
                    case VERMELHO, AMARELO -> Thread.sleep(this.semaforo.getCorSemaforo().getTempoEspera());
                    case VERDE -> Thread.sleep(this.getSemaforo().getCorSemaforo().getTempoEspera());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mudarCor();
        }
    }

    private synchronized void mudarCor() {
        switch (semaforo.getCorSemaforo()) {
            case VERMELHO -> semaforo.setCorSemaforo(CorSemaforo.VERDE);
            case VERDE -> semaforo.setCorSemaforo(CorSemaforo.AMARELO);
            case AMARELO -> semaforo.setCorSemaforo(CorSemaforo.VERMELHO);
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperaCorMudar() {
        while (!this.corMudou) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }

    public synchronized void desligarSemaforo() {
        this.parar = true;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }
}
