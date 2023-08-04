package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor recebido por hora: ");
        double salarioHora = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhas no mes: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = salarioHora * horasTrabalhadas;
        int porcentagemIR = 5;
        double valorIR;
        int porcentagemINSS = 10;
        double valorINSS;
        int porcentagemFGTS = 11;
        double valorFGTS;
        double salarioLiquido;
        double totalDescontos;

        valorIR = salarioBruto * ((double)porcentagemIR/100);
        valorINSS = salarioBruto * ((double) porcentagemINSS/100);
        valorFGTS = salarioBruto * ((double) porcentagemFGTS/100);

        totalDescontos = valorIR + valorINSS;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Valor do salario bruto R$ %.2f \n", salarioBruto);
        System.out.printf("Valor do Imposto de Renda R$ %.2f\n", valorIR);
        System.out.printf("Valor do INSS R$ %.2f\n", valorINSS);
        System.out.printf("Valor que a empresa paga ao FGTS R$ %.2f\n", valorFGTS);
        System.out.printf("Valor total de descontos R$ %.2f\n", totalDescontos);
        System.out.printf("Salario Liquido: R$ %.2f\n", salarioLiquido);
    }
}
