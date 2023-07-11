package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio12 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int somaTotalElementos = 0;

        System.out.print("O vetor de elementos: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 100);

            somaTotalElementos += vetorA[i];
            System.out.printf("%d ", vetorA[i]);
        }
        System.out.println("\nA soma total dos elementos do array foi: " + somaTotalElementos);
    }
}
