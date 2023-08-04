package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio22 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int quantidadeONoVetor = 0;
        double percentual0NoVetor = 0;
        double percentual1NoVetor = 0;

        System.out.println("Os elementos do vetor sao: ");
        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = (int) Math.round(Math.random() * 1);
            System.out.printf("%d ", vetorA[i]);

            if (vetorA[i] == 0) {
                quantidadeONoVetor++;
            }
        }

        percentual0NoVetor = (double) (quantidadeONoVetor * 100) / 10;
        percentual1NoVetor = 100 - percentual0NoVetor;

        System.out.println("\nO percental de 0 no vetor foi de " + percentual0NoVetor + "%");
        System.out.println("O percental de 1 no vetor foi de " + percentual1NoVetor + "%");
    }
}
