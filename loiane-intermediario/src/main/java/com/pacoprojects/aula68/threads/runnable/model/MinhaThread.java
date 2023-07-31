package main.java.com.pacoprojects.aula68.threads.runnable.model;

public class MinhaThread extends Thread {

    private String nome;
    private int tempoMillis;

    public MinhaThread(String nome, int tempoMillis) {
        this.nome = nome;
        this.tempoMillis = tempoMillis;
        super.start();
    }

    @Override
    public void run() {
        System.out.println("Executando a thread");
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(this.nome + " contador: " + i);
                Thread.sleep(this.tempoMillis);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Terminou a execucao da thread: " + this.nome);
    }
}
