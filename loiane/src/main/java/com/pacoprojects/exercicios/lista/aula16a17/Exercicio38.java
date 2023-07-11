package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {

        double porcentagemSalarioAumentoAnual = 0.015;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o salário do funcionario: ");
        double salarioInicial = scanner.nextDouble();

        for (int i = 1996; i <= 2023; i++) {
            double salarioFinal = 0;
            if (i == 1996) {
                salarioFinal = salarioInicial + (salarioInicial * porcentagemSalarioAumentoAnual);
                System.out.println("Valor do Salário do funcionario em " + i + ": Porcentagem de : " + (porcentagemSalarioAumentoAnual * 100) + String.format("%% ||   R$%.2f", salarioFinal));
                continue;
            }

            porcentagemSalarioAumentoAnual = porcentagemSalarioAumentoAnual * 2;
            salarioFinal = salarioInicial + (salarioInicial * (porcentagemSalarioAumentoAnual));
            System.out.println("Valor do Salário do funcionário em " + i + ": Porcentagem de : " + (porcentagemSalarioAumentoAnual * 100) + String.format("%% ||   R$%.2f", salarioFinal));
        }
    }
}
