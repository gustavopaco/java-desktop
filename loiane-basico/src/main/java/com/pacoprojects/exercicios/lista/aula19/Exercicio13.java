package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio13 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int quantidadeElementosMultiplosDe5 = 0;

        System.out.print("O vetor de elementos: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", vetorA[i]);

            if (vetorA[i] % 5 == 0) {
                quantidadeElementosMultiplosDe5++;
            }
        }

        System.out.println("\nA quantidade de elementos multiplos de 5 encontados nesse array foi de " + quantidadeElementosMultiplosDe5);
    }
}
