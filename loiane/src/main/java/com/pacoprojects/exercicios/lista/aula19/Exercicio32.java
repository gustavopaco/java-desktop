package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio32 {
    public static void main(String[] args) {
        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10) + 1;

            System.out.println("#############################");
            System.out.println("TABUADA DE " + vetorA[i]);
            System.out.println("#############################");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", vetorA[i], j, (vetorA[i] * j));
            }
        }
    }
}
