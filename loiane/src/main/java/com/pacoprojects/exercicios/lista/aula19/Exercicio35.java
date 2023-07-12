package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio35 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 100);

            if (vetorA[i] < 1) {
                i--;
                continue;
            }

            System.out.println("##########################");
            System.out.println("Numeros divisores do " + vetorA[i] + ": ");
            System.out.println("##########################");
            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.printf("%d ", j);
                }
            }
            System.out.println();
        }
    }
}
