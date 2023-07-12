package com.pacoprojects.exercicios.lista.aula19;

public class Exercicio28 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        StringBuilder builderA = new StringBuilder();
        StringBuilder builderB = new StringBuilder();

        int posicaoReversa = vetorB.length - 1;
        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = (int)(Math.random() * 100);
            vetorB[posicaoReversa] = vetorA[i];
            builderA.append(vetorA[i]).append(" ");

            if (posicaoReversa == vetorB.length - 1) {
                builderB.append(vetorB[posicaoReversa]);
            } else {
                String imprime = builderB.toString();
                builderB.setLength(0);
                builderB.append(vetorB[posicaoReversa]).append(" ").append(imprime);
            }

            posicaoReversa--;
        }

//        for (int i = 0; i < vetorB.length; i++) {
//            builderB.append(vetorB[i]).append(" ");
//        }

        System.out.println("Valores do Array A: " + builderA);
        System.out.println("Valores do Array B: " + builderB);
    }
}
