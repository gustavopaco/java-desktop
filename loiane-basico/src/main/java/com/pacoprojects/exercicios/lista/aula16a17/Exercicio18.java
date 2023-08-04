package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que recebe N numero e verifica qual Menor numero, Maior numero e a Soma de total numeros digitados.");
        int maiorNumero = 0;
        int menorNumero = Integer.MAX_VALUE;
        System.out.println("Menor numero: " + menorNumero);
        int somaTotal = 0;
        int numero = 0;
        while (true) {
            System.out.println("Informe um numero: ");
            numero = scanner.nextInt();

            maiorNumero = Math.max(maiorNumero, numero);
            menorNumero = Math.min(menorNumero, numero);
            somaTotal += numero;

            System.out.println("Deseja continuar informando numeros? 'S' ou 'N'");
            char continarWhile = scanner.next().charAt(0);
            if (continarWhile == 'N') {
                break;
            }
        }
        System.out.println("O maior numero digitado foi: " + maiorNumero);
        System.out.println("O menor numero digitado foi: " + menorNumero);
        System.out.println("A soma dos numeros foi: " + somaTotal);
    }
}
