package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gerador de tabuada");
        System.out.println("Informe qual numero voce deseja ver a tabuada: ");
        int numero = scanner.nextInt();


        System.out.printf("Tabuada de %d:\n", numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
    }
}
