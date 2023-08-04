package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.println("Informe um nome que tenha ate 3 caracteres: ");
            nome = scanner.next();
            System.out.println("Informe sua idade: ");
            idade = scanner.nextInt();
            System.out.println("Informe seu salario: ");
            salario = scanner.nextDouble();
            System.out.println("Informe o seu sexo: F -> Feminino ou M -> Masculino: ");
            sexo = scanner.next().charAt(0);
            System.out.println("Informe seu estado civil: S -> Solteiro, C -> Casado, V -> Viúvo, D -> Divorciado: ");
            estadoCivil = scanner.next().charAt(0);

            if (nome.length() < 3) {
                System.out.println("* Nome deve ter pelo menos 3 caracteres");
            }
            if (idade < 0 || idade > 150) {
                System.out.println("* Idade deve ser entre 0 e 150 anos");
            }
            if (salario < 0) {
                System.out.println("* Salario deve ser maior que 0");
            }
            if (sexo != 'M' && sexo != 'F') {
                System.out.println("* Somente 'F' ou 'M' sao valores aceitos para o sexo.");
            }
            if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
                System.out.println("Sao aceitos como Estado Civil somente: 'S', 'C', 'V' ou 'D'");
            }
        } while ((nome.length() < 3) || (idade < 0 || idade > 150) || (salario < 0) || (sexo != 'M' && sexo != 'F') || (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D'));

        System.out.printf("Seu nome é: %s, sua idade é: %d, seu salario é: %.2f, seu sexo é: %c, seu estado civil é: %c", nome, idade, salario, sexo, estadoCivil);
    }
}
