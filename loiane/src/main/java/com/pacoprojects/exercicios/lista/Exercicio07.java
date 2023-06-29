package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nesse programa vamos calcular a area de um quadrado e retornar o dobro da area");
        System.out.println("Informe o valor da base: ");
        double base = scanner.nextDouble();
        System.out.println("Informe o valor da altura");
        double altura = scanner.nextDouble();
        double area = base * altura;
        double areaDobrada = area * 2;
        System.out.printf("O valor da área de um quadrado com base de %.2f e altura de %.2f é %.2f. Já o dobro da área seria: %.2f", base, altura, area, areaDobrada);
    }
}
