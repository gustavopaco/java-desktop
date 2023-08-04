package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula fatorial de um numero inteiro informado pelo usuario.");
        System.out.println("Informe um numero para calcular o fatorial: ");
        Scanner scanner = new Scanner(System.in);
        int numeroInformado = scanner.nextInt();
        int fatorialTotal = 1;

        System.out.println("Fatorial de: " + numeroInformado);
        System.out.printf("%d! = ", numeroInformado);
        for (int i = numeroInformado; i > 0; i--) {
            fatorialTotal *= i;
            if (i == 1) {
                System.out.printf("%d = ", i);
            } else {
                System.out.printf("%d . ", i);
            }
        }
        System.out.printf("%d", fatorialTotal);
    }
}
