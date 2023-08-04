package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da Nota 1");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite o valor da Nota 2");
        double nota2 = scanner.nextDouble();
        double media = nota1 + nota2 / 2;
        if (media >= 6) {
            if (media >= 9) {
                System.out.printf("De acordo com suas notas %.2f %.2f Sua media foi de %.2f, com isso sua nota foi A - APROVADO", nota1, nota2, media);
            } else if (media >= 7.5) {
                System.out.printf("De acordo com suas notas %.2f %.2f Sua media foi de %.2f, com isso sua nota foi B - APROVADO", nota1, nota2, media);
            } else {
                System.out.printf("De acordo com suas notas %.2f %.2f Sua media foi de %.2f, com isso sua nota foi C - APROVADO", nota1, nota2, media);
            }
        } else {
            if (media >= 4) {
                System.out.printf("De acordo com suas notas %.2f %.2f Sua media foi de %.2f, com isso sua nota foi D - REPROVADO", nota1, nota2, media);
            } else {
                System.out.printf("De acordo com suas notas %.2f %.2f Sua media foi de %.2f, com isso sua nota foi E - REPROVADO", nota1, nota2, media);
            }
        }
    }
}
