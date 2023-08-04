package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um ano para verificar se é ano bissexto ou não:");
        int anoEscolhido = scanner.nextInt();

        if ((anoEscolhido % 4)  == 0) {
            if ((anoEscolhido % 100) == 0) {
                if ((anoEscolhido % 400) == 0) {
                    // Eh ano bissexto
                    System.out.printf("O ano de %d é considerado um ano bissexto", anoEscolhido);
                } else {
                    // Nao eh Ano bissexto
                    System.out.printf("O ano de %d NÃO é considerado um ano bissexto", anoEscolhido);
                }
            } else {
                // Eh ano bissexto
                System.out.printf("O ano de %d é considerado um ano bissexto", anoEscolhido);
            }
        } else {
            // Nao eh Ano bissexto
            System.out.printf("O ano de %d NÃO é considerado um ano bissexto", anoEscolhido);
        }
    }
}
