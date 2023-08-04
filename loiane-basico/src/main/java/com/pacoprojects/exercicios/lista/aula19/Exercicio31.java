package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio31 {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        StringBuilder builderA = new StringBuilder();
        StringBuilder builderB = new StringBuilder();

        int posicaoReverse = vetorA.length - 1;
        int posicaoDefault = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100);
            builderA.append(vetorA[i]).append(" ");

            if (vetorA[i] % 2 == 0) {
                vetorB[posicaoDefault] = vetorA[i];
                posicaoDefault++;
            } else {
                vetorB[posicaoReverse] = vetorA[i];
                posicaoReverse--;
            }
        }

        for (int i = 0; i < vetorB.length; i++) {
            builderB.append(vetorB[i]).append(" ");
        }

        System.out.println("Vetor A: " + builderA);
        System.out.println("Vetor B: " + builderB);
    }
}
