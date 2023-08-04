package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio23 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        boolean isFullPar = true;

        System.out.println("Os elementos do vetor sao: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", vetorA[i]);
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                isFullPar = false;
                System.out.println("\nFoi encontrado um elemento impar na posicao " + i + " encerrando sistema.");
                break;
            }
        }

        if (isFullPar) {
            System.out.println("Todos os elementos do vetor são pares.");
        }
    }
}
