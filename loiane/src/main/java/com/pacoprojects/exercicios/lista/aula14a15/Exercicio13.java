package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero correspondente ao dia da semana 1-Domingo, 2-Segunda, 3-Terça, 4-Quarta, 5-Quinta, 6-Sexta, 7-Sábado");
        int numeroDaSemana = scanner.nextInt();

        switch (numeroDaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-Feira");
            case 3 -> System.out.println("Terça-Feira");
            case 4 -> System.out.println("Quarta-Feira");
            case 5 -> System.out.println("Quinta-Feira");
            case 6 -> System.out.println("Sexta-Feira");
            case 7 -> System.out.println("Sábado");
            default  -> System.out.println("Valor inválido");
        }
    }
}
