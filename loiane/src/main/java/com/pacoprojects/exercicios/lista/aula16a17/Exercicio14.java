package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        int quantidadePares = 0;
        int quantidadeImpares = 0;
        StringBuilder numerosPares = new StringBuilder();
        StringBuilder numerosImpares = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema que recebe 10 numeros e mostra quais sao pares e impares");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d - Informe um numero: ", i);
            int numero = scanner.nextInt();
            if ((numero % 2) == 0) {
                quantidadePares++;
                numerosPares.append(numero).append(" ");
            } else {
                quantidadeImpares++;
                numerosImpares.append(numero).append(" ");
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Resultado: ");
        System.out.printf("Em todos os 10 numeros que voce digitou existem: \n-%d numeros pares \n-%d numeros impares \n", quantidadePares, quantidadeImpares);
        System.out.println("Lista de numeros Pares: " + numerosPares.toString());
        System.out.println("Lista de numeros Impares: " + numerosImpares.toString());

    }
}
