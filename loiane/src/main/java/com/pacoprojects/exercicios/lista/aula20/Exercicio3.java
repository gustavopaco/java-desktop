package com.pacoprojects.exercicios.lista.aula20;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[][] matrizEntrada = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        for (int i = 0; i < matrizEntrada.length; i++) {
            for (int j = 0; j < matrizEntrada[i].length; j++) {
                System.out.println("Informe o valor da Linha " + i + " Coluna " + j + ": ");
                int valorEscolhido = scanner.nextInt();
                matrizEntrada[i][j] = valorEscolhido;
                if (valorEscolhido % 2 == 0) {
                    quantidadePares++;
                } else {
                    quantidadeImpares++;
                }
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < matrizEntrada.length; i++) {
            for (int j = 0; j < matrizEntrada[i].length; j++) {
                System.out.println("L " + i + " C " + j + " = " + matrizEntrada[i][j]);
            }
        }

        System.out.println("Quantidade de numeros pares da matriz: " + quantidadePares);
        System.out.println("Quantidade de numeros impares da matriz: " + quantidadeImpares);
    }
}
