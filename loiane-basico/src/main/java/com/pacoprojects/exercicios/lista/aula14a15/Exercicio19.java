package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero >= 1000) {
            System.out.println("Numero inválido, digite um numero menor ou igual a 1000. Programa encerrado.");
        } else {

            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;

            if (centenas == 0) {
                if (dezenas == 0) {
                    System.out.printf("No numero %d, existem %d unidades", numero, unidades);
                } else {
                    System.out.printf("No numero %d, existem %d dezenas, %d unidades", numero, dezenas, unidades);
                }
            } else {
                System.out.printf("No numero %d, existem %d centenas, %d dezenas, %d unidades", numero, centenas, dezenas, unidades);
            }
        }
    }
}
