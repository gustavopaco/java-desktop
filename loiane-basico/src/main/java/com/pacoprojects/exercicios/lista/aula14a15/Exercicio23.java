package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema para saber se o numero eh inteiro ou decimal");
        System.out.println("Informe o numero:");
        double numero = scanner.nextDouble();

        if (Math.round(numero) != numero) {
            System.out.println("Numero decimal");
        } else {
            System.out.println("Numero inteiro");
        }

    }
}
