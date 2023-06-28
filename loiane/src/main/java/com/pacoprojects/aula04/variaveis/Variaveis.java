package com.pacoprojects.aula04.variaveis;

public class Variaveis {
    public static void main(String[] args) {
        String nome = "Maria";
        String nomeDoMeuCachorro = "Toby";
        int idade = 30;

        // convenção Java
        int _idade;
        int $idade;

        // Não é convenção
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        // má prática
        int a = 10;
        String b = "Gustavo";

        idade = 25;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome do meu cachorro: " + nomeDoMeuCachorro);


    }
}
