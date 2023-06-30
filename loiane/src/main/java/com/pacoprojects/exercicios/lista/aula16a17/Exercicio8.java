package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int media = 0;
        int valor;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor de um numero");
            valor = scanner.nextInt();
            soma += valor;
        }

        media = soma / 5;
        System.out.println("O valor da soma desses 5 numeros é: " + soma + " ja a media deles foi: " + media);
    }
}
