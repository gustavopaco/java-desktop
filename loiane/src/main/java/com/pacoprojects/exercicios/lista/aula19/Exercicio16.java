package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio16 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int somaElementosMenor15 = 0;
        int quantidadeElementosIgualA15 = 0;
        int quantidadeElementosMaiorQue15 = 0;
        double mediaElementosMaiorque15 = 0;

        System.out.print("Os elementos do array: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 100);

            System.out.printf("%d ", vetorA[i]);

            if (vetorA[i] < 15) {
                somaElementosMenor15 += vetorA[i];
            }

            if (vetorA[i] == 15) {
                quantidadeElementosIgualA15++;
            }

            if (vetorA[i] > 15) {
                quantidadeElementosMaiorQue15++;
                mediaElementosMaiorque15 += vetorA[i];
            }
        }

        mediaElementosMaiorque15 = mediaElementosMaiorque15 / quantidadeElementosMaiorQue15;

        System.out.println("\nRESULTADO: ");
        System.out.println("Soma dos elementos menores que 15: " + somaElementosMenor15);
        System.out.println("Quantidade de elementos iguais a 15: " + quantidadeElementosIgualA15);
        System.out.println("Media dos elementos maiores que 15: " + mediaElementosMaiorque15);
    }
}
