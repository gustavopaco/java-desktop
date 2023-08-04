package com.pacoprojects.exercicios.lista.aula16a17;

public class Exercicio29 {
    public static void main(String[] args) {
        System.out.println("Loja Quase Dois - Tabela de preços:");
        for (int i = 1; i <= 50; i++) {
            System.out.println((i) + " - R$" + String.format("%.2f", (i * 1.99)));
        }
    }
}
