package com.pacoprojects.entrada.dados.scanner;

import java.util.Scanner;

public class EntradaDadosScanner {

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                System.out.println("Digite seu nome completo: ");
                String nomeCompleto = scan.nextLine();

                System.out.println("Digite seu primeiro nome: ");
                String primeiroNome = scan.next();

                System.out.println("Digite sua idade: ");
                int idade = scan.nextInt();

                System.out.println("Digite sua altura: ");
                double altura = scan.nextDouble();

                System.out.println("Seu nome completo eh: " + nomeCompleto);
                System.out.println("Seu primeiro nome eh: " + primeiroNome);
                System.out.println("Sua idade eh: " + idade);
                System.out.println("Sua altura eh: " + altura);
        }
}
