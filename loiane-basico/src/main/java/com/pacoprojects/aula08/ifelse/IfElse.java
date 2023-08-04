package com.pacoprojects.aula08.ifelse;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        System.out.println("Informe o preço do produto");
        double valor = scanner.nextDouble();

        // Se valor <= 10 = barato
        // Se valor > 10 e valor < 15 = pedir desconto
        // Se valor >= 15 e valor < 17 = pesquisar mais
        // Se valor >= 17 - muito caro

        if (valor > 10) {
            if (valor >= 15) {
                if (valor >= 17) {
                    System.out.println("Produto está caro.");
                } else {
                    System.out.println("Pesquisar mais.");
                }
            } else {
                System.out.println("Pedir desconto do produto.");
            }
        } else {
            System.out.println("Produto está barato.");
        }
    }
}
