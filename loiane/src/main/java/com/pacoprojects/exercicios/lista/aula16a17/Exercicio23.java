package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que mostra todos os numeros primos entre 1 e o N, sendo N o numero digitado pelo usuario");
        System.out.println("Informe ate qual numero gostaria de verificar todos os numero primos");
        int limitePrimo = scanner.nextInt();
        int quantidadeDivisoesExecutadas = 0;

        StringBuilder builder = new StringBuilder();
        builder.append("São considerados numeros primos entre 1 e ").append(limitePrimo).append(": ");
        if (limitePrimo > 1) {
            for (int i = 2; i <= limitePrimo; i++) {

                boolean isPrimo = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if ((i % j) == 0) {
                        isPrimo = false;
                    }
                    quantidadeDivisoesExecutadas++;
                }
                if (isPrimo) {
                    builder.append(i).append(" ");
                }
            }
            System.out.println(builder);
            System.out.println("Quantidade de divisões executadas para achar os numeros primos: " + quantidadeDivisoesExecutadas + " divisoes.");
        } else {
            System.out.println("Os numeros primos sao numeros somente maiores que 1. Encerrando o sistema...");
        }
    }
}
