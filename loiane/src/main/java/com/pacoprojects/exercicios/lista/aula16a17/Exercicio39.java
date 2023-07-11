package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que encontra o aluno mais alto e mais baixo dentre um conjunto de 10 alunos.");
        double alturaAlunoMaisAlto = 0;
        int numeroAlunoMaisAlto = Integer.MIN_VALUE;
        double alturaAlunoMaisBaixo = 0;
        int numeroAlunoMaisBaixo = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {

            System.out.println("Informe o numero do Aluno: ");
            int numeroAluno = scanner.nextInt();

            System.out.println("Informe a altura do Aluno: ");
            double alturaAluno = scanner.nextDouble();

            if (alturaAluno > alturaAlunoMaisAlto) {
                alturaAlunoMaisAlto = alturaAluno;
                numeroAlunoMaisAlto = numeroAluno;
            }

            if (alturaAluno < alturaAlunoMaisBaixo) {
                alturaAlunoMaisBaixo = alturaAluno;
                numeroAlunoMaisBaixo = numeroAluno;
            }
        }

        System.out.printf("O número do aluno mais ALTO foi %d e sua altura foi de %.2fm\n", numeroAlunoMaisAlto, alturaAlunoMaisAlto);
        System.out.printf("O número do aluno mais BAIXO foi %d e sua altura foi de %.2fm\n", numeroAlunoMaisBaixo, alturaAlunoMaisBaixo);
    }
}
