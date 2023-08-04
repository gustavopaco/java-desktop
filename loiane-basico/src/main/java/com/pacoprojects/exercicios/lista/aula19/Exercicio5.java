package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = i;

            vetorB[i] = vetorA[i] * i;

            System.out.println("O vetor B na posicao " + (i+1) + " é igual a: " + vetorB[i]);
        }
    }
}
