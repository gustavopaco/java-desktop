package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Formula C = (F - 32) * 5/9
        // Formula F = 9/5C +32

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que receba temperatura em graus Celsius e transforme para Farenheit.");
        System.out.println("Informe quantos de graus em Celsius:");
        double celsius = scanner.nextDouble();
        double farenheit = ((double) 9 / 5 ) * celsius + 32;
        System.out.printf("%.1f graus em Celsius é o mesmo que: %.1f graus Farenheit.", celsius, farenheit);
    }
}
