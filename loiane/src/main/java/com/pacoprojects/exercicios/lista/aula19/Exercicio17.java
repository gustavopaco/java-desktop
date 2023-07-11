package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio17 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int quantidadeIdadesMaiorQue35 = 0;

        System.out.print("Os elementos do array sao: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 100);

            System.out.printf("%d ", vetorA[i]);

            if (vetorA[i] > 35) {
                quantidadeIdadesMaiorQue35++;
            }
        }

        System.out.println("\nA quantidade de pessoas com idade maior que 35 anos no vetor sao: " + quantidadeIdadesMaiorQue35);
    }
}
