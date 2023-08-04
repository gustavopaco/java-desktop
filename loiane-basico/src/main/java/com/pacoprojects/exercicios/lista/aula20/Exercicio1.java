package com.pacoprojects.exercicios.lista.aula20;

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] matrizAleatoria = new int[4][4];
        Random random = new Random();
        int maiorNumeroMatriz = Integer.MIN_VALUE;
        int posicaoLinha = 0;
        int posicaoColuna = 0;

        System.out.println("A seguir seguem os numeros da matriz 4x4:");
        for (int i = 0; i < matrizAleatoria.length; i++) {

            for (int j = 0; j < matrizAleatoria[i].length; j++) {

                matrizAleatoria[i][j] = random.nextInt(10);
                System.out.println("Linha " + i + "- Coluna " + j + ". Valor: " + matrizAleatoria[i][j]);
                if (matrizAleatoria[i][j] > maiorNumeroMatriz) {
                    maiorNumeroMatriz = matrizAleatoria[i][j];
                    posicaoLinha = i;
                    posicaoColuna = j;
                }
            }
        }
        System.out.printf("\nO maior numero da matriz é o: %d  -  Ele se encontra na linha %d, e na coluna %d.", maiorNumeroMatriz, posicaoLinha, posicaoColuna);
    }
}
