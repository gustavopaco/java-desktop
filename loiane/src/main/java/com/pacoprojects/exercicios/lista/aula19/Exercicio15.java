package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio15 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int quantidadeElementosPares = 0;
        double porcentagemElementosPares = 0;
        double porcentagemElementosImpares = 0;

        System.out.print("Os elementos desse array sao: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", vetorA[i]);

            if (vetorA[i] % 2 == 0) {
                quantidadeElementosPares++;
            }
        }

        porcentagemElementosPares = (double)(quantidadeElementosPares * 100) / 10;
        porcentagemElementosImpares = 100 - porcentagemElementosPares;

        System.out.println("\nA quantidade de elementos pares encontrados no sistema foi de: " + porcentagemElementosPares + "%, Já a porcentagem de elementos impares foi de: " + porcentagemElementosImpares + "%");
    }
}
