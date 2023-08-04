package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio29 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[vetorA.length + vetorB.length];
        StringBuilder builderA = new StringBuilder();
        StringBuilder builderB = new StringBuilder();
        StringBuilder builderC = new StringBuilder();

        int contadorMaior10 = 0;
        for (int i = 0; i < vetorC.length; i++) {
            if (i < 10) {
                vetorA[i] = (int) (Math.random() * 100);
                vetorB[i] = (int) (Math.random() * 100);
                vetorC[i] = vetorA[i];
                builderA.append(vetorA[i]).append(" ");
                builderB.append(vetorB[i]).append(" ");
            } else {
                vetorC[i] = vetorB[contadorMaior10];
                contadorMaior10++;
            }
            builderC.append(vetorC[i]).append(" ");
        }

        System.out.println("Vetor A: " + builderA);
        System.out.println("Vetor B: " + builderB);
        System.out.println("Vetor C: " + builderC);
    }
}
