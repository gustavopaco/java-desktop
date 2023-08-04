package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Sistema que recebe dois numeros e mostra os numeros que estao no intervalo entre eles");
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Informe o valor do primeiro numero");
        numero1 = scanner.nextInt();
        System.out.println("Informe o valor do primeiro numero");
        numero2 = scanner.nextInt();

        for (int i = numero1; i < numero2; i++) {
            if (i == numero1) {
                System.out.printf("Valores do intervalo entre %d e %d:\n", numero1, numero2);
                continue;
            }
            System.out.printf("%d ", i);
        }

    }
}
