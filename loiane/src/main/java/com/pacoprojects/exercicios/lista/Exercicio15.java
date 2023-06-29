package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor que voce ganha por hora: ");
        double salarioHora = scanner.nextDouble();
        System.out.println("Informe o numero de horas trabalhadas no mes: ");
        int horasTrabalhadas = scanner.nextInt();
        double salarioBruto = salarioHora * horasTrabalhadas;
        double descontoImpostoRenda = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.08;
        double descontoSindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - (descontoImpostoRenda + descontoSindicato + descontoINSS);
        System.out.printf("Valor do salário bruto: %.2f", salarioBruto);
        System.out.printf("\nValor pago ao Imposto de Renda: %.2f", descontoImpostoRenda);
        System.out.printf("\nValor pago ao Sindicato: %.2f", descontoSindicato);
        System.out.printf("\nValor pago ao INSS: %.2f", descontoINSS);
        System.out.printf("\nValor do salário líquido: %.2f", salarioLiquido);
    }
}
