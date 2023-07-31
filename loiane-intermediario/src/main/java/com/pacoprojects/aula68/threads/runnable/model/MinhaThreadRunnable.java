package main.java.com.pacoprojects.aula68.threads.runnable.model;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempoMillis;

    public MinhaThreadRunnable(String nome, int tempoMillis) {
        this.nome = nome;
        this.tempoMillis = tempoMillis;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciou a execucao");
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(this.nome + " contador: " + i);
                Thread.sleep(this.tempoMillis);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.nome + " terminou a execucao");
    }
}
