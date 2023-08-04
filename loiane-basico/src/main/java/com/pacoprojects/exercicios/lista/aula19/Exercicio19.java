package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio19 {
    public static void main(String[] args) {
        double[] vetorNota1 = new double[10];
        double[] vetorNota2 = new double[10];
        double[] result = new double[10];

        System.out.println("A notas informadas foram: ");

        for (int i = 0; i < 10; i++) {
            vetorNota1[i] = Math.random() * 10;
            vetorNota2[i] = Math.random() * 10;

            double mediaNotas = (vetorNota1[i] + vetorNota2[i]) / 2;
            result[i] = mediaNotas;
        }

        System.out.print("Vetor 1: ");
        for (int i = 0; i < vetorNota1.length; i++) {
            System.out.printf("%.2f ", vetorNota1[i]);
        }

        System.out.print("\nVetor 2: ");
        for (int i = 0; i < vetorNota2.length; i++) {
            System.out.printf("%.2f ", vetorNota2[i]);
        }

        System.out.println("\nA media das notas foram: ");
        for (int i = 0; i < result.length; i++) {

            System.out.print("Aluno " + (i + 1));
            if (result[i] > 7) {
                System.out.printf(", Nota: %.2f   Situação: REPROVADO.\n", result[i]);
            } else {
                System.out.printf(", Nota: %.2f   Situação: APROVADO.\n", result[i]);
            }
        }
    }
}
