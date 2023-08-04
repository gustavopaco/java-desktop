package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorValor = 0;
        int valor = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor " + i +":");
            valor = scanner.nextInt();
            maiorValor = Math.max(maiorValor, valor);
        }

        System.out.println("Maior valor informado foi: " + maiorValor);
    }
}
