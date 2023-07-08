package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        System.out.println("Sistema que verifica se um numero é primo ou não");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero inteiro maior que 1:");
        int numeroEscolhido = scanner.nextInt();
        boolean isPrimo = true;

        for (int i = 2; i <= Math.sqrt(numeroEscolhido) ; i++) {
            if ((numeroEscolhido % i) == 0) {
                isPrimo = false;
            }
        }

        if (isPrimo) {
            System.out.println("O numero " +  numeroEscolhido + " é primo.");
        } else {
            System.out.println("O numero " +  numeroEscolhido + " não é primo.");
        }
    }
}
