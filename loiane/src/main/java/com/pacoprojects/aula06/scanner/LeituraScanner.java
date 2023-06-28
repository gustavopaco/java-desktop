package com.pacoprojects.aula06.scanner;

import java.util.Scanner;

public class LeituraScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.printf("Seu nome completo é: %s\n", nomeCompleto);
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é: " + idade);
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Sua altura é: " + altura);
        System.out.println("Digite seu sobrenome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
        String sobrenome = scanner.next();
        int idadePessoa = scanner.nextInt();
        int quantidadeFilhos = scanner.nextInt();
        double alturaPessoa = scanner.nextDouble();
        boolean temBichinho = scanner.nextBoolean();
//        System.out.printf("Você digitou os seguintes valores: %s %d %d %.2f %b\n", sobrenome, idadePessoa, quantidadeFilhos, alturaPessoa, temBichinho);
        System.out.printf("Seu sobrenome é %s, já sua idade é %d, você disse que tem %d filhos, você disse que tem %.2f de altura e por fim perguntei se tinha pet, e voce que: %b", sobrenome, idadePessoa, quantidadeFilhos, alturaPessoa, temBichinho);
    }
}
