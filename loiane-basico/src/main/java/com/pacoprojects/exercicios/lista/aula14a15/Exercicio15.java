package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de um dos lados do triangulo: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Digite o valor de outro lado do triangulo: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Digite o valor do ultimo lado do triangulo: ");
        double lado3 = scanner.nextDouble();

        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {
            int contadorLadosIguais = 0;
            int contadorLadosDiferentes = 0;
            if (lado1 == lado2) {
                contadorLadosIguais++;
            } else {
                contadorLadosDiferentes++;
            }

            if (lado2 == lado3) {
                contadorLadosIguais++;
            } else {
                contadorLadosDiferentes++;
            }

            if (lado1 == lado3) {
                contadorLadosIguais++;
            } else {
                contadorLadosDiferentes++;
            }

            if (contadorLadosIguais == 3) {
                System.out.println("Esses valores formam um triangulo, Equilátero");
            } else if (contadorLadosIguais == 2) {
                System.out.println("Esses valores formam um triangulo, Isosceles");
            } else if (contadorLadosDiferentes == 3) {
                System.out.println("Esses valores formam um triangulo, Escaleno");
            }
        } else {
            System.out.println("Esses valores nao formam um triangulo");
        }
    }
}
