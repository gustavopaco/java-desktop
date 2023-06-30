package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro numero:");
        double numero1 = scanner.nextDouble();
        System.out.println("Informe o valor do segundo numero:");
        double numero2 = scanner.nextDouble();
        System.out.println("Informe o valor do terceiro numero:");
        double numero3 = scanner.nextDouble();
        double menorValor = Math.min(numero1, numero2);
        double valorIntermediario;
        double maiorValor;
        if (menorValor == numero1) {
            valorIntermediario = numero2;
            menorValor = Math.min(menorValor, numero3);
            if (valorIntermediario > numero3) {
                maiorValor = valorIntermediario;
                valorIntermediario = numero3;
                if (menorValor == numero3) {
                    valorIntermediario = numero1;
                }
            } else {
                maiorValor = numero3;
                if (menorValor == numero3) {
                    valorIntermediario = numero1;
                }
            }
        } else {
            valorIntermediario = numero1;
            menorValor = Math.min(menorValor, numero3);
            if (valorIntermediario > numero3) {
                maiorValor = valorIntermediario;
                valorIntermediario = numero3;
                if (menorValor == numero3) {
                    valorIntermediario = numero2;
                }
            } else {
                maiorValor = numero3;
                if (menorValor == numero3) {
                    valorIntermediario = numero2;
                }
            }
        }
        System.out.printf("Dado os numeros %.2f, %.2f e %.2f. Os valores em ordem decrescente seria %.2f, %.2f e %.2f", numero1, numero2, numero3, maiorValor, valorIntermediario, menorValor);

    }
}
