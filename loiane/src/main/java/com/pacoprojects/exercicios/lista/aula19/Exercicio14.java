package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio14 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int somaElementosImpares = 0;

        System.out.print("Os elementos do array sao: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", vetorA[i]);

            if (vetorA[i] % 2 != 0) {
                somaElementosImpares += vetorA[i];
            }
        }

        System.out.println("\nA soma dos elementos impares do array foi de: " + somaElementosImpares);
    }
}
