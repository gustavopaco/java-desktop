package com.pacoprojects.exercicios.lista.aula11a13;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que receba temperatura em graus Farenheit e transforme para Celsius.");
        System.out.println("Informe quantos de graus em Farenheit:");
        double farenheit = scanner.nextDouble();
        double celsius = 5 * (farenheit - 32) / 9;
        System.out.printf("O valor de %.2f Farenheit para Celsius seria? %.2f", farenheit, celsius);
    }
}
