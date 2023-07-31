package main.java.com.pacoprojects.exercicios.lista.aula74.model;

public class MinhaThread implements Runnable {

    private String nome;
    private Semaforo semaforo;
    private Thread thread;

    public MinhaThread(String nome, Semaforo semaforo) {
        this.nome = nome;
        this.semaforo = semaforo;
        thread = new Thread(this, nome);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        synchronized (this.semaforo) {
            System.out.println("Executando Thread" + this.nome);
            semaforo.sinalAberto(CorSemaforo.VERDE);
//            if (semaforo.getCorSemaforo() == CorSemaforo.VERDE) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            }
            semaforo.sinalAtencao(CorSemaforo.AMARELO);
//            if (semaforo.getCorSemaforo() == CorSemaforo.AMARELO) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            }
            semaforo.sinalPare(CorSemaforo.VERMELHO);
//            if (semaforo.getCorSemaforo() == CorSemaforo.VERMELHO) {
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            }
            System.out.println("Finalizando Thread " + this.nome);
        }
    }
}
