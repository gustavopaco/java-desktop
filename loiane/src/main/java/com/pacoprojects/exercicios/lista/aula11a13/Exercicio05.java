package com.pacoprojects.exercicios.lista.aula11a13;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento em metros: ");
        double metros = scanner.nextDouble();
        double resultado = 100 * metros;
        System.out.printf("A quantidade de %.1f metros em centimetros é: %.1f", metros, resultado);
    }
}
