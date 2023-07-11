package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio18 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int posicaoMenorIdade = 0;
        int posicaoMaiorIdade = 0;
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;

        System.out.print("Os valores do array sao: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 100);

            System.out.printf("%d ", vetorA[i]);

            if (vetorA[i] > maiorIdade) {
                maiorIdade = vetorA[i];
                posicaoMaiorIdade = i;
            }

            if (vetorA[i] < menorIdade) {
                menorIdade = vetorA[i];
                posicaoMenorIdade = i;
            }
        }

        System.out.println("\nA MAIOR idade encontrada no array foi de: " + maiorIdade + " ela esta no indice " + posicaoMaiorIdade + " do array");
        System.out.println("A MENOR idade encontrada no array foi de: " + menorIdade + " ela esta no indice " + posicaoMenorIdade + " do array");
    }
}
