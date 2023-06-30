package com.pacoprojects.exercicios.lista.aula14a15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/mm/aaaa que vamos checar se ela é uma data válida: ");
        String dataEscolhida = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(dataEscolhida, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("É uma data válida.");
        } catch (Exception e) {
            System.out.println("Não é uma data válida.");
        }
    }
}
