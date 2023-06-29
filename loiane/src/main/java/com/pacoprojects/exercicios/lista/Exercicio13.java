package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Informe seu sexo, F para Feminino e M para masculino: ");
        String sexo = scanner.next();
        System.out.println("Informe seu peso atual: ");
        double pesoAtual = scanner.nextDouble();
        double pesoIdeal = 0.0;
        boolean isPesoIdeal = false;
        switch (sexo) {
            case "M" -> {
                pesoIdeal = (72.7 * altura) - 58;
                isPesoIdeal = pesoAtual <= pesoIdeal;
            }
            case "F" -> {
                pesoIdeal = (62.1 * altura) - 44.7;
                isPesoIdeal = pesoAtual <= pesoIdeal;
            }
        }

        if (isPesoIdeal) {
            System.out.printf("Com seu peso de %.2f, você está dentro ou abaixo do peso ideal que seria, %.2f", pesoAtual, pesoIdeal);
        } else {
            System.out.printf("Com seu peso de %.2f, você está acima do peso ideal que seria, %.2f", pesoAtual, pesoIdeal);
        }
    }
}
