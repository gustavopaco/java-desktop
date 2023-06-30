package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.println("Telefonou para a vitima?");
        boolean isTelefonou = scanner.nextBoolean();
        System.out.println("Esteve no local do crime?");
        boolean isEsteveNoLocal = scanner.nextBoolean();
        System.out.println("Mora perto da vitima?");
        boolean isMoraPerto = scanner.nextBoolean();
        System.out.println("Devia para a vitima?");
        boolean isDevia = scanner.nextBoolean();
        System.out.println("Ja trabalhou com a vitima?");
        boolean isTrabalhou = scanner.nextBoolean();

        if (isTelefonou) {
            contador++;
        }

        if (isEsteveNoLocal) {
            contador++;
        }

        if (isMoraPerto) {
            contador++;
        }

        if (isDevia) {
            contador++;
        }

        if (isTrabalhou) {
            contador++;
        }

        if (contador == 2) {
            System.out.println("Voce eh uma pessoa considerada Suspeita");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Voce eh uma pessoa considerada Cumplice");
        } else if (contador == 5) {
            System.out.println("Voce eh tratada como Assassino");
        } else {
            System.out.println("Voce eh inocente");
        }

    }
}
