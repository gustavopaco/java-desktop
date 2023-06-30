package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu sexo F para Feminino e M para masculino");
        String sexo = scanner.next();
        switch (sexo) {
            case "F" -> System.out.println("Seu sexo é Feminino.");
            case "M" -> System.out.println("Seu sexo é Masculino.");
            default -> System.out.println("Sexo inválido.");
        }
    }
}
