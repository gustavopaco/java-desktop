package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio25 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        StringBuilder builder = new StringBuilder();

        System.out.println("Valores do vetor sao: ");
        builder.append("Os valores do vetor B sao: \n");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", vetorA[i]);
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
            builder.append(vetorB[i]).append(" ");
        }
        System.out.println("\n" + builder);
    }
}
