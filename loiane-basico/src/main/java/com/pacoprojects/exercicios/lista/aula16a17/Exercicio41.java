package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da dívida: ");
        double valorDivida = scanner.nextDouble();

        System.out.print("Valor da dívida   Valor do juros   Quantidade de Parcelas   Valor da Parcela\n");
        for (int i = 0; i <= 12; i += 3) {
            double valorJuros = 0;
            int quantidadeParcelas = i;
            double valorParcela = 0;

            switch (i) {
                case 0 -> {
                    valorJuros = 0;
                    quantidadeParcelas = 1;
                }
                case 3 -> valorJuros = valorDivida * 0.10;
                case 6 -> valorJuros = valorDivida * 0.15;
                case 9 -> valorJuros = valorDivida * 0.20;
                case 12 -> valorJuros = valorDivida * 0.25;
            }

            if (quantidadeParcelas == 1) {
                valorParcela = valorDivida;
            } else {
                valorDivida = valorDivida + valorJuros;
                valorParcela = (valorDivida + valorJuros) / quantidadeParcelas;
            }

            System.out.printf("R$%.2f             %.2f%%                 %d                       R$%.2f\n", valorDivida, valorJuros, quantidadeParcelas, valorParcela);
        }
    }
}
