package com.pacoprojects.exercicios.lista.aula19;

import java.util.Random;

public class Exercicio27 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        String[] vetorB = new String[10];
        StringBuilder builderA = new StringBuilder();
        StringBuilder builderB = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(16);
            
            if (vetorA[i] < 7) {
                vetorB[i] = "a";
            } else if (vetorA[i] == 7) {
                vetorB[i] = "b";
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = "c";
            } else if (vetorA[i] == 10) {
                vetorB[i] = "d";
            } else {
                vetorB[i] = "e";
            }
            builderA.append(vetorA[i]).append(" ");
            builderB.append(vetorB[i]).append(" ");
        }

        System.out.println("Array A: " + builderA);
        System.out.println("Array B: " + builderB);
    }
}
