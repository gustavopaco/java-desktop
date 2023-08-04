package com.pacoprojects.exercicios.lista.aula19;

import java.util.Random;

public class Exercicio37 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        Random random = new Random();
        StringBuilder builderA = new StringBuilder();
        StringBuilder builderB = new StringBuilder();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(11);

            if (vetorA[i] == 0) {
                i--;
                continue;
            }

            System.out.println("##########################");
            System.out.println("Fatorial de " + vetorA[i] + ": ");
            System.out.println("##########################");
            int resultadoFatorial = 1;
            for (int j = vetorA[i]; j > 0; j--) {
                resultadoFatorial *= j;
                if (j > 1) {
                    System.out.printf("%d x ", j);
                } else {
                    System.out.printf("%d = %d", j, resultadoFatorial);
                }
            }
            vetorB[i] = resultadoFatorial;
            System.out.println();
            builderA.append(vetorA[i]).append(" ");
            builderB.append(vetorB[i]).append(" ");
        }

        System.out.println("------------------------------------");
        System.out.println("Vetor A: " + builderA);
        System.out.println("Vetor B: " + builderB);
    }
}
