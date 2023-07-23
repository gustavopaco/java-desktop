package com.pacoprojects.aula47.exception.trycatch;

public class Excecao {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];
            System.out.println("Antes da exception");
            vetor[4] = 4;
            System.out.println("Esse texto não será impresso.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception lançada! Posição de array não existe");
        }
        System.out.println("Esse texto será impresso após a exception.");
    }
}
