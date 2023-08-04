package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade em KG de morangos");
        int pesoKgMorangos = scanner.nextInt();
        System.out.println("Informe a quantidade em KG de maças");
        int pesoKgMacas = scanner.nextInt();

        // Morangos ate 5kg -> R$ 2.50 o KG,     acima de 5Kg -> R$2.20 o KG
        // Macas ate 5kg -> R$1.80 o KG,         acima de 5Kg -> R$1.50 o KG

        int quantidadeKgFrutas = pesoKgMorangos + pesoKgMacas;

        double valorDesconto;
        double valorAPagarFrutas;
        double valorAPagarComDesconto;

        if (pesoKgMorangos <= 5) {
            valorAPagarFrutas = pesoKgMorangos * 2.50;
        } else {
            valorAPagarFrutas = pesoKgMorangos * 2.20;
        }

        if (pesoKgMacas <= 5) {
            valorAPagarFrutas += pesoKgMacas * 1.80;
        } else {
            valorAPagarFrutas += pesoKgMacas * 1.50;
        }

        if (quantidadeKgFrutas > 8 || valorAPagarFrutas > 25) {
            valorDesconto = valorAPagarFrutas * 0.10;
            valorAPagarComDesconto = valorAPagarFrutas - valorDesconto;
            System.out.printf("O cliente esta comprando %d kg de Morangos e %d kg de Maças.\nO valor total a pagar será de R$ %.2f \nO cliente ganhou um desconto de 10%% em cima do valor total de %.2f, pois ele esta comprando mais de 8kg de frutas ou o valor atingiu acima de R$25.00", pesoKgMorangos, pesoKgMacas, valorAPagarComDesconto, valorAPagarFrutas);
        } else {
            System.out.printf("O cliente esta comprando %d kg de Morangos e %d kg de Maças.\nO valor total a pagar será de R$ %.2f", pesoKgMorangos, pesoKgMacas, valorAPagarFrutas);
        }
    }
}
