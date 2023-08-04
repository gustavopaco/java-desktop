package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro numero:");
        double numero1 = scanner.nextDouble();
        System.out.println("Informe o valor do segundo numero:");
        double numero2 = scanner.nextDouble();
        System.out.println("Informe o valor do terceiro numero:");
        double numero3 = scanner.nextDouble();
        double resultado = Math.max(numero1, numero2);
        resultado = Math.max(resultado, numero3);
        System.out.printf("O maior numero entre %.2f, %.2f e %.2f é: %.2f", numero1, numero2, numero3, resultado );
    }
}
