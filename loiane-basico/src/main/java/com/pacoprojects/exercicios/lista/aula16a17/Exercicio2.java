package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String nome;
            String senha;
        do {
            System.out.println("Informe o nome de usuario");
            nome = scanner.nextLine();
            System.out.println("Informe a sua senha");
            senha = scanner.nextLine();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Nome de usuario e senha nao podem ser iguais...");
            }
        } while (nome.equalsIgnoreCase(senha));
    }
}
