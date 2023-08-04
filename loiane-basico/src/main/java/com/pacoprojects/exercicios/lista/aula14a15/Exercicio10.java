package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Em que turno voce estuda? M-matutino, V-vespertino, N-noturno");
        char horario = scanner.next().charAt(0);
        switch (horario) {
            case 'M' -> System.out.println("Bom dia! Você estuda no horario matutino");
            case 'V' -> System.out.println("Boa Tarde! Você estuda no horario vespertino");
            case 'N' -> System.out.println("Boa Noite! Você estuda no horario noturno");
            default -> System.out.println("Horario invalido");
        }
    }
}
