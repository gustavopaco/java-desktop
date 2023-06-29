package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero inteiro: ");
        int primeiroNumeroInteiro = scanner.nextInt();
        System.out.println("Informe o segundo numero inteiro: ");
        int segundoNumeroInteiro = scanner.nextInt();
        System.out.println("Informe o terceiro numero real: ");
        double numeroReal = scanner.nextDouble();
        // O produto do dobro do primeiro numero com a metade do segundo numero
        int resultadoA = (primeiroNumeroInteiro * 2) * (segundoNumeroInteiro / 2);
        // A Soma do triplo do primeiro numero com o terceiro numero
        double resultadoB = (primeiroNumeroInteiro * 3) + numeroReal;
        // O terceiro numero elevado ao cubo
        double resultadoC = Math.pow(numeroReal, 3);
        System.out.println("O produto do dobro do primeiro numero com a metade do segundo numero, é: " + resultadoA);
        System.out.println("A Soma do triplo do primeiro numero com o terceiro é: " + resultadoB);
        System.out.println("O terceiro numero elevado ao cubo" + resultadoC);
    }
}
