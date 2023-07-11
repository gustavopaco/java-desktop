package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        long[] vetorB = new long[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i;
            vetorB[i] = (long)Math.pow(vetorA[i], vetorA[i]);

            System.out.println("Vetor B na posicao " + (i+1) + " é igual a: " + vetorB[i]);
        }
    }
}
