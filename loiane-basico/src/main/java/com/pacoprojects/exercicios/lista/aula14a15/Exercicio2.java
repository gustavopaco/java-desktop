package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor");
        int valor = scanner.nextInt();
        if (valor >= 0) {
            System.out.printf("O valor %d é positivo", valor);
        } else {
            System.out.printf("O valor %d é negativo", valor);
        }
    }
}
