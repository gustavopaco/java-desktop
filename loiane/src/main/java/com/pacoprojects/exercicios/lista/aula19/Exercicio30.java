package com.pacoprojects.exercicios.lista.aula19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercicio30 {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        StringBuilder builderA = new StringBuilder();
        StringBuilder builderB = new StringBuilder();
        StringBuilder builderC = new StringBuilder();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100);
            builderA.append(vetorA[i]).append(" ");
        }

        int[] vetorB = Arrays.stream(vetorA).filter(value -> {
            if (value % 2 == 0) {
                builderB.append(value).append(" ");
                return true;
            }
            return false;
        }).toArray();

        int[] vetorC = Arrays.stream(vetorA).filter(value -> {
            if (value % 2 != 0) {
                builderC.append(value).append(" ");
                return true;
            }
            return false;
        }).toArray();

        System.out.println("Vetor A: " + builderA);
        System.out.println("Vetor B pares: " + builderB);
        System.out.println("Vetor C impares: " + builderC);
    }
}
