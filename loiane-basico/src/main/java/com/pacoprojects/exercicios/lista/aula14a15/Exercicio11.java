package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o salario do colaborador");
        double salario = scanner.nextDouble();
        double salarioComReajuste;
        int percentualReajuste;
        double valorDoAumento;
        if (salario <= 280) {
            percentualReajuste = 20;
            valorDoAumento = (salario * ((double)percentualReajuste/100));
            salarioComReajuste = salario + valorDoAumento;
        } else if (salario > 280 && salario < 700) {
            percentualReajuste = 15;
            valorDoAumento = (salario * ((double)percentualReajuste/100));
            salarioComReajuste = salario + valorDoAumento;
        } else if (salario >= 700 && salario < 1500) {
            percentualReajuste = 10;
            valorDoAumento = (salario * ((double)percentualReajuste/100));
            salarioComReajuste = salario + valorDoAumento;
        } else {
            percentualReajuste = 5;
            valorDoAumento = (salario * ((double)percentualReajuste/100));
            salarioComReajuste = salario + salario * valorDoAumento;
        }
        System.out.printf("O valor do salario antes do rejuste é de R$ %.2f reais\n", salario);
        System.out.printf("O valor do percentual aplicado é de %d %%\n", percentualReajuste);
        System.out.printf("O valor do aumento foi de R$ %.2f reais\n", valorDoAumento);
        System.out.printf("O valor do salario com o aumento foi de R$ %.2f reais\n", salarioComReajuste);
    }
}
