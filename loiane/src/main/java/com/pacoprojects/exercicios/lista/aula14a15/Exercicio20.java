package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da nota 1");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe o valor da nota 2");
        double nota2 = scanner.nextDouble();
        System.out.println("Informe o valor da nota 2");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            if (media == 10) {
                System.out.printf("Aluno aprovado com distinção com média de %.2f", media);
            } else {
                System.out.printf("Aluno aprovado com média de %.2f", media);
            }
        } else {
                System.out.printf("Aluno reprovado com média de %.2f", media);
        }
    }
}
