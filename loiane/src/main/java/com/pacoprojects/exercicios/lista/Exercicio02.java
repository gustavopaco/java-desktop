package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numeroDigitado = scanner.nextInt();
        System.out.printf("O número informado foi %d", numeroDigitado);
    }
}
