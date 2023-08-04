package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero de litros vendidos");
        int litrosVendidos = scanner.nextInt();
        System.out.println("Informe o tipo do combustivel, 'G' -> Gasolina e 'A' -> Alcool");
        char tipoCombustivel = scanner.next().charAt(0);

        // Alcool ate 20 litros -> desconto de 3% por litro
        // Alcool acima 20 litros -> desconto de 5% por litro
        double precoPorLitroAlcool = 1.90;

        // Gasolina ate 20 litros -> desconto de 4% por litro
        // Gasolina acima 20 litros -> desconto de 6% por litro
        double precoPorLitroGasolina = 2.50;

        double valorAPagar;
        double valorDesconto;

        switch (tipoCombustivel) {
            case 'A' -> {
                if (litrosVendidos <= 20) {
                    // TODO calcular com desconto de 3%
                    valorAPagar = precoPorLitroAlcool * litrosVendidos;
                    System.out.println("Valor Total: " + valorAPagar);
                    valorDesconto = (valorAPagar * 0.03);
                    valorAPagar = valorAPagar - valorDesconto;
                } else {
                    // TODO calcular com desconto de 5%
                    valorAPagar = precoPorLitroAlcool * litrosVendidos;
                    System.out.println("Valor Total: " + valorAPagar);
                    valorDesconto = (valorAPagar * 0.05);
                    valorAPagar = valorAPagar - valorDesconto;
                }
                System.out.printf("O Valor a pagar em %d litros de Alcool. Será de R$ %.2f, devido a um desconto de R$ %.2f", litrosVendidos, valorAPagar, valorDesconto);
            }
            case 'G' -> {
                if (litrosVendidos <= 20) {
                    // TODO calcular com desconto de 4%
                    valorAPagar = precoPorLitroGasolina * litrosVendidos;
                    System.out.println("Valor Total: " + valorAPagar);
                    valorDesconto = (valorAPagar * 0.04);
                    valorAPagar = valorAPagar - valorDesconto;
                } else {
                    // TODO calcular com desconto de 6%
                    valorAPagar = precoPorLitroGasolina * litrosVendidos;
                    System.out.println("Valor Total: " + valorAPagar);
                    valorDesconto = (valorAPagar * 0.06);
                    valorAPagar = valorAPagar - valorDesconto;
                }
                System.out.printf("O Valor a pagar em %d litros de Gasolina. Será de R$ %.2f, devido a um desconto de R$ %.2f", litrosVendidos, valorAPagar, valorDesconto);
            }
            default -> System.out.println("Informe corretamente o nome do combustivel. Encerrando a consulta...");
        }
    }
}
