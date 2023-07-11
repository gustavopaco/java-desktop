package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio10 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 150);
            vetorB[i] = vetorA[i] % 2;

            System.out.println("O vetor B na posicao " + (i+1) + " é igual a: " + vetorB[i]);
        }
    }
}
