package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para definir se um numero é par ou impar");
        System.out.println("Informe o numero");
        int numero = scanner.nextInt();

        int resto = numero % 2;

        if (resto == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
