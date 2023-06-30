package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro produto:");
        double numero1 = scanner.nextDouble();
        System.out.println("Informe o valor do segundo produto:");
        double numero2 = scanner.nextDouble();
        System.out.println("Informe o valor do terceiro produto:");
        double numero3 = scanner.nextDouble();
        double menorValor = Math.min(numero1, numero2);
        menorValor = Math.min(menorValor, numero3);
        System.out.printf("Entre os valores de produtos R$ %.2f, R$ %.2f, e R$ %.2f o produto de menor valor custa R$ %.2f.", numero1, numero2, numero3, menorValor);
    }
}
