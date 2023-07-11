package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i;
            vetorB[i] = vetorA[i] * 2;

            System.out.println("Vetor B na posicao " + (i+1) + " tem valor igual a: " + vetorB[i]);
        }
    }
}
