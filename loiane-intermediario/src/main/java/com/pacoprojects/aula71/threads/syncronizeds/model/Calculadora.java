package main.java.com.pacoprojects.aula71.threads.syncronizeds.model;

import java.util.Arrays;

public class Calculadora {
    private int soma;
    public synchronized int somaArray(int[] array) {
        this.soma = 0;
        try {
            for (int i : array) {
                this.soma += i;
                System.out.println("Executando a soma " + Thread.currentThread().getName() + " | somando o valor " + i + " com o total de: " + soma);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.soma;
    }
}
