package com.pacoprojects.aula10.loop;

public class WhileDoWhile {
    public static void main(String[] args) {
        int i = 0;

            System.out.println("Contando ate 10...");
        while (i <= 10) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        System.out.println("Finalizou loop...");
        System.out.println("Valor de i apos sair do Loop While" + i);
        System.out.println("Iniciando Loop...");
        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i < 15);
        System.out.println("Finalizou loop");
    }
}
