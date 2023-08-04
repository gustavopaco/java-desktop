package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lojas Tabajara");

        while (true) {
            double totalCompra = 0;
            int contadorProdutos = 1;
            while (true) {
                System.out.println("Informe o valor do produto " + contadorProdutos + " ou 0 para calcular o valor dos produtos:");
                double valorProduto = scanner.nextDouble();
                if (valorProduto == 0) {
                    break;
                } else {
                    System.out.println("Produto " + contadorProdutos + ": R$ " + valorProduto);
                    totalCompra += valorProduto;
                    contadorProdutos++;
                }
            }
            System.out.println("Total: " + String.format("%.2f",totalCompra));
            System.out.println("Informe o valor em dinheiro oferecido pelo cliente: ");
            double valorOferecido = scanner.nextDouble();
            System.out.println("Dinheiro: R$ " + String.format("%.2f",valorOferecido));
            System.out.println("Troco: R$ " + String.format("%.2f", valorOferecido - totalCompra));

            System.out.println("Processar nova compra? 'S' -> Sim, 'N' -> Não");
            char continuar = scanner.next().charAt(0);
            if (continuar == 'N' || continuar == 'n') {
                break;
            }
        }
    }
}
