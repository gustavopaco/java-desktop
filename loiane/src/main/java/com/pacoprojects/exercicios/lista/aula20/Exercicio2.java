package com.pacoprojects.exercicios.lista.aula20;

import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] matriziAleatoria = new int[10][10];
        Random random = new Random();
        int menorValorLinha5 = Integer.MAX_VALUE;
        int menorValorLinha7 = Integer.MAX_VALUE;
        int maiorValorLinha5 = Integer.MIN_VALUE;
        int maiorValorLinha7 = Integer.MIN_VALUE;

        System.out.println("Valores da MATRIZ 10x10: ");
        for (int i = 0; i < matriziAleatoria.length; i++) {
            for (int j = 0; j < matriziAleatoria[i].length; j++) {
                matriziAleatoria[i][j] = random.nextInt(100);
                System.out.printf("\nLinha %d, Coluna %d = Valor %d", i, j, matriziAleatoria[i][j]);
                if (i == 5) {
                    menorValorLinha5 = Math.min(menorValorLinha5, matriziAleatoria[i][j]);
                    maiorValorLinha5 = Math.max(maiorValorLinha5, matriziAleatoria[i][j]);
                } else if (i == 7) {
                    menorValorLinha7 = Math.min(menorValorLinha7, matriziAleatoria[i][j]);
                    maiorValorLinha7 = Math.max(maiorValorLinha7, matriziAleatoria[i][j]);
                }
            }
            System.out.print("\n#####################");
        }
        System.out.println("\nO maior valor da linha 5 foi: " + maiorValorLinha5 + " e o menor valor da mesma linha foi: " + menorValorLinha5);
        System.out.print("O maior valor da linha 7 foi: " + maiorValorLinha7 + " e o menor valor da mesma linha foi: " + menorValorLinha7);
    }
}
