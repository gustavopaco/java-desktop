package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio26 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        StringBuilder builderA = new StringBuilder();
        StringBuilder builderB = new StringBuilder();
        StringBuilder builderC = new StringBuilder();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100);
            vetorB[i] = (int) (Math.random() * 100);

            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }

            builderA.append(vetorA[i]).append(" ");
            builderB.append(vetorB[i]).append(" ");
            builderC.append(vetorC[i]).append(" ");
        }

        System.out.println("Vetor A: " + builderA);
        System.out.println("Vetor B: " + builderB);
        System.out.println("Vetor C: " + builderC);
    }
}
