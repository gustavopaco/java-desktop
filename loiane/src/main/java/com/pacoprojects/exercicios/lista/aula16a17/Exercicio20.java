package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que permite calcular fatorial N vezes porem somente numeros inteiros positivos e menor que 16.");
        int numeroFatorial = 0;

        while (true) {
            System.out.println("Informe o numero para realizar Fatorial: ");
            numeroFatorial = scanner.nextInt();

            if (numeroFatorial < 0 || numeroFatorial > 16) {
                break;
            }

            int resultado = 1;

            System.out.println("Fatorial de " + numeroFatorial + ":");
            for (int i = numeroFatorial; i > 0; i--) {

                resultado *= i;
                if (i > 1) {
                    System.out.printf("%d x ", i);
                } else {
                    System.out.printf("%d = %d\n", i, resultado);
                }
            }
            System.out.println("Deseja Continuar? 'S' ou 'N'");
            char continuar = scanner.next().charAt(0);
            System.out.println("---------------------------------");
            if (continuar == 'N') {
                System.out.println("Sistema Encerrado.");
                break;
            }
        }
    }
}
