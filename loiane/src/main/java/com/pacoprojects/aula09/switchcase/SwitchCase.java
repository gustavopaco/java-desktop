package com.pacoprojects.aula09.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um dia da semana, de 1 a 7: ");
        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-Feira");
            case 3 -> System.out.println("Terça-Feira");
            case 4 -> System.out.println("Quarta-Feira");
            case 5 -> System.out.println("Quinta-Feira");
            case 6 -> System.out.println("Sexta-Feira");
            case 7 -> System.out.println("Sábado");
            default -> throw new IllegalArgumentException("Nenhum dia da semana válido foi informado");
        }

        switch (diaDaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Não é dia útil");
                break;
        }
    }
}
