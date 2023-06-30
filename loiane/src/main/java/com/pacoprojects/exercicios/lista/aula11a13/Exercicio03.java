package com.pacoprojects.exercicios.lista.aula11a13;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int segundoNumero = scanner.nextInt();
        int resultado = primeiroNumero + segundoNumero;
        System.out.printf("A soma dos números %d e %d é: %d", primeiroNumero, segundoNumero, resultado);
    }
}
