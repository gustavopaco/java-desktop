package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("Programa de exponencial");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero de base: ");
        int base = scanner.nextInt();
        System.out.println("Informe o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = (int) Math.pow(base, expoente);
        System.out.printf("%d elevado a %d = %d", base, expoente, resultado);
    }
}
