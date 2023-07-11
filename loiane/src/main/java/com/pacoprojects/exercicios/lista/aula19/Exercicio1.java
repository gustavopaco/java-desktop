package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        vetorA[0] = 30;
        vetorA[1] = 20;
        vetorA[2] = 14;
        vetorA[3] = 28;
        vetorA[4] = 39;

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
            System.out.println("Posicao " + (i+1) + " do vetor B tem valor de: " + vetorB[i]);
        }
    }
}
