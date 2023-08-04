package com.pacoprojects.aula11.loopfor;

public class LoopFor {
    public static void main(String[] args) {
        System.out.println("Contando ate 10 com For...");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println("Contando ate 0...");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Valor Novo de i: " + i);
        }

        for (int i = 0, j = 10; i < 10 && j > 0; i++, j--) {
            System.out.println("For Duplo Valor de i: " + i);
            System.out.println("For Duplo Valor de j: " + j);
        }

        int count = 0;
        for (; count < 10; ) {
            System.out.println("For Parte Ausente valor de i: " + count);
            count += 2;
        }

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += i;
        }
        System.out.println("Valor da soma: " + soma);

    }
}
