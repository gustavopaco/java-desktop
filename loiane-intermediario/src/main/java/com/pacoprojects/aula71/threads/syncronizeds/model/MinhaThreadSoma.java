package main.java.com.pacoprojects.aula71.threads.syncronizeds.model;

public class MinhaThreadSoma implements Runnable {
    private String nome;
    private int[] nums;
    private static Calculadora calculadora = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        Thread thread = new Thread(this, this.nome);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada.");
        int soma = calculadora.somaArray(this.nums);
        System.out.println("O resultado da soma da thread " + this.nome + " é: " + soma);
        System.out.println(this.nome + " terminada");
    }
}
