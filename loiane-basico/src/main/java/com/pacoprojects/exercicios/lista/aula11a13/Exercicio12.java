package com.pacoprojects.exercicios.lista.aula11a13;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nesse algoritmo vamos a partir da altura da pessoa definir qual seria seu peso ideal.");
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("De acordo com a altra de %.2f, seu peso ideal seria: %.2f", altura, pesoIdeal);
    }
}
