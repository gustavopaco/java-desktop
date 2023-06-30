package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota.");
        double nota1= scanner.nextDouble();
        System.out.println("Digite o valor da segunda nota.");
        double nota2 = scanner.nextDouble();

        double media = nota1 + nota2 / 2;
        if (media >= 7) {
            if (media == 10) {
                System.out.println("Aprovado com Distinção");
            } else {
                System.out.println("Aprovado.");
            }
        } else {
            System.out.println("Reprovado.");
        }
    }
}
