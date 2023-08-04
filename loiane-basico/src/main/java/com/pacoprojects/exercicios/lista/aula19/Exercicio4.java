package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = i;

            vetorB[i] = Math.sqrt(vetorA[i]);

            System.out.println("O vetor B na posicao " + (i+1) + " é igual a: " + vetorB[i]);
        }
    }
}
