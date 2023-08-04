package com.pacoprojects.exercicios.lista.aula11a13;

import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho em metros quadrados da area a ser pintada?");
        double metrosQuadrados = scanner.nextDouble();
        // 1litro pinta 3 metros, 1 Lata de 18litros pinta 54metros quadrados, custa 80 reais
        double metrosPintura1Lata = 54;
        double valorLata = 80;
        int latasAComprar = (int)Math.ceil(metrosQuadrados / metrosPintura1Lata);
        double valorTotal = valorLata * latasAComprar;
        System.out.printf("A quantidade de latas a serem compradas é: %d, e o valor total será de R$ %.2f", latasAComprar, valorTotal );
    }
}
