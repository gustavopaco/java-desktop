package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio9 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        double[] vetorB = new double[10];
        double[] vetorC = new double[10];

        for (int i = 1; i <= vetorA.length; i++) {
            vetorA[i-1] = (int)(Math.random() * 200);
            vetorB[i-1] = i;

            vetorC[i-1] = vetorA[i-1] / vetorB[i-1];

            System.out.println("O vetor C na posicao " + i + " é igual a: " + vetorC[i-1]);
        }
    }
}
