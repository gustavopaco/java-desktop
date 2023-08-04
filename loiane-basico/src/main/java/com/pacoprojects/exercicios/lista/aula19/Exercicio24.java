package com.pacoprojects.exercicios.lista.aula19;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        Scanner scanner = new Scanner(System.in);
        boolean isPalindromo = true;
        StringBuilder builder = new StringBuilder();
        StringBuilder builderComparator = new StringBuilder();


        builder.append("O valores do vetor sao: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o valor do vetor na posicao " + i + ": ");
            vetorA[i] = scanner.nextInt();

            builder.append(vetorA[i]);
            if (i != vetorA.length - 1) {
                builder.append(" ");
            }
        }

        int posicaoReversa = vetorA.length - 1;
        for (int i = 0; i < (vetorA.length / 2); i++) {

            System.out.println("Comparando posicao " + i + " com posicao " + posicaoReversa + ".");
            System.out.println("Valores: " + vetorA[i] + " = " + vetorA[posicaoReversa] + "?");
            if (vetorA[i] != vetorA[posicaoReversa]) {
                isPalindromo = false;
                break;
            }
            posicaoReversa--;
            builderComparator.append(vetorA[i]);
        }

        if (isPalindromo) {
            System.out.println("O vetor é um palindromo");
        } else {
            System.out.println("O vetor não é um palindromo");
        }

        if (builder.toString().contentEquals(builder.reverse())) {
            System.out.println("Array é igual.");
        } else {
            System.out.println("Array não é igual.");
        }
    }
}
