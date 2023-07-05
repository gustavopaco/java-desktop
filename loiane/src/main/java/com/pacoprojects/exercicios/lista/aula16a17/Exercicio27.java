package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que calcula o numero medio de alunos por turmo de acordo com a quantidade de turmas informadas pelo usuario e a quantidade de alunos tambem informado pelo mesmo. Sendo que cada turma nao pode ter mais que 40 alunos.");
        System.out.println("Informe a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();
        double mediaAlunos = 0;
        for (int i = 0; i < quantidadeTurmas; i++) {
            System.out.println("Para a turma " + (quantidadeTurmas + 1) + " informe a quantidade de alunos.");
            int numeroAlunos = scanner.nextInt();

            if (numeroAlunos > 40) {
                System.out.println("Quantidade de Alunos da turma " + (quantidadeTurmas + 1) + " não deve ser maior que 40.");
                i--;
            } else {
                mediaAlunos += numeroAlunos;
            }
        }

        mediaAlunos = mediaAlunos / quantidadeTurmas;
        System.out.println("De acordo com a quantidade de " + quantidadeTurmas + " turmas informadas, a média de alunos é: " + mediaAlunos);
    }
}
