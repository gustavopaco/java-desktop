package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio11 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int contadorElementosPares = 0;

        System.out.printf("O vetor A de elementos: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 100);

            if (vetorA[i] % 2 == 0) {
                contadorElementosPares++;
            }
            System.out.printf("%d " , vetorA[i]);
        }

        System.out.println("\nForam encontrados " + contadorElementosPares + " numeros pares.");
    }
}
