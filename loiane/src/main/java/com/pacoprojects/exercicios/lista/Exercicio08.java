package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que recebe valor ganho por hora e o numero de horas trabalhadas no mes. E por fim mostra o valor do salario que deveria receber");
        System.out.println("Quanto você ganha por hora?");
        double salario = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mes: ");
        int quantidadeHorasTrabalhadas = scanner.nextInt();
        double valorAReceber = salario * quantidadeHorasTrabalhadas;
        System.out.printf("Olá, ganhando R$ %.2f por hora, e trabalhando %d horas por mes voce ganha em um mes o valor de R$ %.2f ", salario, quantidadeHorasTrabalhadas, valorAReceber);
    }
}
