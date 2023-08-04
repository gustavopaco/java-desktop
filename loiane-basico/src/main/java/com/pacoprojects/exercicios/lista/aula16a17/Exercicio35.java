package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        System.out.println("Sistema que gera numeros primos entre 1 e numero informado pelo usuario");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero inteiro positivo para achar todos os numeros primos entre 1 e ele: ");
        int numeroEscolhido = scanner.nextInt();

        if (numeroEscolhido > 1) {
            System.out.println("Numero escolhido foi: " + numeroEscolhido);
            System.out.print("Números primos: ");
            for (int i = 2; i <= numeroEscolhido ; i++) {
                boolean isPrimo = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {

                    if ((i % j) == 0) {
                        isPrimo = false;
                        break;
                    }
                }

                if (isPrimo) {
                    System.out.printf("%d ", i);
                }
            }
        } else {
            System.out.println("Numero deve ser maior que 1. Encerrando o sistema...");
        }
    }
}
