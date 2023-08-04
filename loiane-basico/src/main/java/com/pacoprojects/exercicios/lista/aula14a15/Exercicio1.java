package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int numero = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.printf("O maior número entre %d e %d é: %d\n", numero, numero2, Math.max(numero, numero2));
    }
}
