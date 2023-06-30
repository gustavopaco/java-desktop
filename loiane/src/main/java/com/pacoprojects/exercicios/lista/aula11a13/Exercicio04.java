package com.pacoprojects.exercicios.lista.aula11a13;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da primeira nota: ");
        double primeiraNota = scanner.nextDouble();
        System.out.println("Informe o valor da segunda nota: ");
        double segundaNota = scanner.nextDouble();
        System.out.println("Informe o valor da terceira nota: ");
        double terceiraNota = scanner.nextDouble();
        System.out.println("Informe o valor da quarta nota: ");
        double quartaNota = scanner.nextDouble();
        double resultadoMedia = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.printf("O resultado da média das notas: %.1f , %.1f, %.1f, %.1f, é: %.1f", primeiraNota, segundaNota, terceiraNota, quartaNota, resultadoMedia);
    }
}
