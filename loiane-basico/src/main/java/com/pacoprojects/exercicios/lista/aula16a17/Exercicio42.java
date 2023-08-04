package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        System.out.println("Sistema que le uma quantidade indeterminada de numeros positivos e conte quantos deles estao entre os intervalos [0-25]  [26-50]  [51-75]  [76-100]");
        Scanner scanner = new Scanner(System.in);
        int quantidadePrimeiroCaso = 0;
        int quantidadeSegundoCaso = 0;
        int quantidadeTerceiroCaso = 0;
        int quantidadeQuartoCaso = 0;

        while (true) {
            System.out.println("Informe um numero positivo para calcular os intervalos ou um NEGATIVO para encerrar no sistema: ");
            int numeroEscolhido = scanner.nextInt();

            if (numeroEscolhido < 0) {
                break;
            } else if (numeroEscolhido <= 25) {
                quantidadePrimeiroCaso++;
            } else if (numeroEscolhido <= 50) {
                quantidadeSegundoCaso++;
            } else if (numeroEscolhido <= 75) {
                quantidadeTerceiroCaso++;
            } else if (numeroEscolhido <= 100) {
                quantidadeQuartoCaso++;
            } else {
                System.out.println("Número informado fora da range");
            }
        }

        System.out.println("RESULTADO: ");
        System.out.printf("\nQuantidade de números entre [0-25]:  %d", quantidadePrimeiroCaso);
        System.out.printf("\nQuantidade de números entre [26-50]:  %d", quantidadeSegundoCaso);
        System.out.printf("\nQuantidade de números entre [51-75]:  %d", quantidadeTerceiroCaso);
        System.out.printf("\nQuantidade de números entre [76-100]:  %d", quantidadeQuartoCaso);
    }
}
