package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio34 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100);

            if (vetorA[i] == 0) {
                i--;
                continue;
            }

            System.out.println("###################################");
            System.out.println("Elementos Pares 0 ate " + vetorA[i] + ": ");
            System.out.println("###################################");
            for (int j = 0; j < vetorA[i]; j += 2) {
                System.out.printf("%d ", j);
            }

            System.out.println();
        }
    }
}
