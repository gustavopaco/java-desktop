package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Algoritmo de Fatorial");
        System.out.println("Informe um numero para ser calculado o fatorial: ");
        int numeroFatorial = scanner.nextInt();

        int resultado  = 1;

        System.out.println("Fatorial de " + numeroFatorial + "!");
        for (int i = numeroFatorial; i > 0; i--) {
            if (i > 1) {
                System.out.printf("%d x ", i);
            } else {
                System.out.printf("%d ", i);
            }
            resultado *= i;
        }
        System.out.printf("= %d", resultado);
    }
}
