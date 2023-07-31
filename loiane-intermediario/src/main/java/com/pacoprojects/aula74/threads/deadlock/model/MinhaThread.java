package main.java.com.pacoprojects.aula74.threads.deadlock.model;

public class MinhaThread implements Runnable {

    private String nome;
    private final String RECURSO1 = "Recurso #1";
    private final String RECURSO2 = "Recurso #2";
    private boolean executarRecurso1;


    public MinhaThread(String nome, boolean executarRecurso1) {
        this.nome = nome;
        this.executarRecurso1 = executarRecurso1;
        new Thread(this, this.nome).start();
    }

    @Override
    public void run() {
        if (executarRecurso1) {
            synchronized (RECURSO1) {
                System.out.println("A Thread " + this.nome + " bloqueou o recurso 1.");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("A Thread " + this.nome + " esta tentando o acesso ao recurso 2");
                synchronized (RECURSO2) {
                    System.out.println("A Thread " + this.nome + " bloqueou o recurso 2.");
                }
            }
        } else {
            synchronized (RECURSO2) {
                System.out.println("A Thread " + this.nome + " bloqueou o recurso 2.");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("A Thread " + this.nome + " esta tentando o acesso ao recurso 1");
                synchronized (RECURSO1) {
                    System.out.println("A Thread " + this.nome + " bloqueou o recurso 1.");
                }
            }
        }
    }
}
