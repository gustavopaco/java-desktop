package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.pow(2,2));
        System.out.println("Vamos calcular a área de um círculo a partir de seu raio.");
        System.out.println("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();
        double resultado = Math.PI * (Math.pow(raio, 2));
        System.out.printf("O valor da área desse circulo com raio de %.2f é: %.2f", raio, resultado);
    }
}
