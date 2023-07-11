package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio20E21 {
    public static void main(String[] args) {
        double[] vetorA = new double[20];
        double valorCotacaoDolar = Math.random() * 10;

        System.out.println("COTACAO DO DOLAR: " + valorCotacaoDolar);
        System.out.println("Valores do Array de Cotacao do Dolar: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = valorCotacaoDolar * (i + 1);

            System.out.printf("R$%.2f ", vetorA[i]);
        }
    }
}
