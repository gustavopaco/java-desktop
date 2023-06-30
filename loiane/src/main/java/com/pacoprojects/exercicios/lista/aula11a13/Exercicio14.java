package com.pacoprojects.exercicios.lista.aula11a13;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá João, informe o peso dos peixes.");
        double pesoPeixes = scanner.nextDouble();
        double pesoLimite = 50.00;
        double excesso = pesoPeixes - pesoLimite;
        int multa;
        if (excesso > 0) {
            multa = (int)excesso * 4;
            System.out.printf("Olá João dessa vez voce escedeu o limite de peso em %.2f, portanto sua multa sera de R$ %d", excesso, multa);
        } else {
            excesso = 0;
            multa = 0;
            System.out.printf("Olá João dessa vez voce esteve abaixo do limite de peso, valor de excesso: %.2f, valor da multa: %d", excesso, multa);
        }
    }
}
