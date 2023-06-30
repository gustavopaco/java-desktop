package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que le dois numeros e retorna se o numero é par ou impar, positivo ou negativo e inteiro ou decimal");
        System.out.println("Informe o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Informe o segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Informe qual tipo de operacao deseja fazer com esses numeros, '+' -> Soma , '-' -> Subtração, '*' -> Multiplicação, '/' -> Divisão :");
        char operador = scanner.next().charAt(0);
        double resultado = 0;

        switch (operador) {
            case '+' -> {
                resultado = numero1 + numero2;
                System.out.print("A soma entre ");
            }
            case '-' -> {
                resultado = numero1 - numero2;
                System.out.print("A subtração entre ");
            }
            case '*' -> {
                resultado = numero1 * numero2;
                System.out.print("A multiplicação entre ");
            }
            case '/' -> {
                resultado = numero1 / numero2;
                System.out.print("A divisão entre ");
            }
        }

        boolean isPar = (resultado % 2) == 0;
        boolean isPositivo = (resultado > 0);
        boolean isNumero1Inteiro = (Math.round(numero1) == numero1);
        boolean isNumero2Inteiro = (Math.round(numero2) == numero2);
        boolean isInteiro = (Math.round(resultado) == resultado);

        if (isNumero1Inteiro) {
            System.out.printf("%d ", (int)numero1);
        } else {
            System.out.printf("%.2f ", numero1);
        }

        System.out.printf("%s ", operador);

        if (isNumero2Inteiro) {
            System.out.printf("%d ", (int) numero2);
        } else {
            System.out.printf("%.2f ", numero2);
        }

        System.out.print("é igual a ");

        if (isInteiro) {
            System.out.printf("%d . Esse numero é considerado um numero inteiro", (int)resultado);
            if (isPar) {
                System.out.print(". Ele tambem é considerado par. ");
            } else {
                System.out.print(". Ele tambem é considerado impar. ");
            }
        } else {
            System.out.printf("%.2f . Esse numero é considerado um numero decimal", resultado);
        }

        if (isPositivo) {
            System.out.print(". Esse também é um número positivo.");
        } else {
            System.out.print(". Esse também é um número negativo.");
        }
    }
}
