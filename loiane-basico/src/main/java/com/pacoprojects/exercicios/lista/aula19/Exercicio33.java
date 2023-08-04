package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio33 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        StringBuilder builderArray = new StringBuilder();
        StringBuilder builderPrimos = new StringBuilder();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100);
            if (vetorA[i] < 2) {
                i--;
                continue;
            }
            builderArray.append(vetorA[i]).append(" ");

            boolean isPrimo = true;
            for (int j = 2; j <= Math.sqrt(vetorA[i]); j++) {
                if (vetorA[i] % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                builderPrimos.append("Elemento ").append(vetorA[i]).append(" do array É Primo.\n");
            } else {
                builderPrimos.append("Elemento ").append(vetorA[i]).append(" do array NÃO é Primo.\n");
            }
        }

        System.out.println("ELEMENTOS DO ARRAY: \n" + builderArray);
        System.out.println(builderPrimos);
    }
}
