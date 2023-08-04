package com.pacoprojects.exercicios.lista.aula16a17;

public class Exercicio30 {
    public static void main(String[] args) {
        System.out.println("Preço do Pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de preços.");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + String.format("%.2f", (i * 0.18)));
        }
    }
}
