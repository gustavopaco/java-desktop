package com.pacoprojects.aula14.matrizes;

public class MatrizesTridimensionais {
    public static void main(String[] args) {
        int[][][] matrizTridimensional = new int[3][3][3];
        int somaTotalPar = 0;
        int somaTotalImpar = 0;

        for (int i = 0; i < matrizTridimensional.length; i++) {

            System.out.println("Linha " + i + ": ");
            for (int j = 0; j < matrizTridimensional[i].length; j++) {

                System.out.println("Coluna " + j + ": ");
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    System.out.println("Profundidade " + k + ": ");

                    matrizTridimensional[i][j][k] = i + j + k;
                    if (matrizTridimensional[i][j][k] % 2 == 0) {
                        somaTotalPar += matrizTridimensional[i][j][k];
                    } else {
                        somaTotalImpar += matrizTridimensional[i][j][k];
                    }

                    System.out.println(matrizTridimensional[i][j][k]);
                }
            }
        }

        System.out.println("Total soma valores PARES: " + somaTotalPar);
        System.out.println("Total soma valores IMPARES: " + somaTotalImpar);
    }
}
