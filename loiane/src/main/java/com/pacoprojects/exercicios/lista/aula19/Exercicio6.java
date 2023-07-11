package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i;
            vetorB[i] = i*2;

            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("O valor do vetor C na posicao "+ (i+1) + " é igual a: " + vetorC[i]);
        }
    }
}
