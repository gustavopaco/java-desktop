package com.pacoprojects.exercicios.lista.aula11a13;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho em metros quadrados da area a ser pintada?");
        double metrosQuadrados = scanner.nextDouble();
        double metrosPinturaLata = 108;
        double valorLata = 80;
        int litrosLata = 18;
        double metrosPinturaGalao = 21.6;
        double valorGalao = 25;
        double litrosGalao = 3.6;
        int latasAComprar = (int) Math.ceil(metrosQuadrados / metrosPinturaLata);
        int galoesAComprar = (int) Math.ceil((metrosQuadrados) / metrosPinturaGalao);
        double valorTotalLata = latasAComprar * valorLata;
        double valorTotalGaloes = galoesAComprar * valorGalao;
        System.out.printf("A quantidade de latas de 18 Litros a serem compradas é: %d, e o valor total será de R$ %.2f", latasAComprar, valorTotalLata);
        System.out.printf("\nA quantidade de latas de 3.6 Litros a serem compradas é: %d, e o valor total será de R$ %.2f", galoesAComprar, valorTotalGaloes);

        double quantidadeLitrosNecessarios = metrosQuadrados / 6;
        double quantidadeLatas = quantidadeLitrosNecessarios / litrosLata;
        double resultadoTintaRestante = quantidadeLitrosNecessarios % litrosLata;
        double quantidadeGaloes = resultadoTintaRestante / litrosGalao;

        if (quantidadeGaloes > 3) {
            quantidadeLatas++;
            double valorTotal = (int) Math.floor(quantidadeLatas) * valorLata;
            System.out.println("\nSerao necessario " + (int) quantidadeLatas + " latas de tinta de 18 litros. Com um valor total de R$ " + String.format("%.2f",valorTotal));
        } else {
            double valorTotal = ((int) Math.floor(quantidadeLatas) * valorLata) + ((int)Math.ceil(quantidadeGaloes) * valorGalao);
            System.out.println("\nSerao necessario " + (int) Math.floor(quantidadeLatas)
                    + " latas de tinta de 18 Litros e " + (int)Math.ceil(quantidadeGaloes)
                    + " galões de tinta de 3,6 Litros. Somando um valor total de R$ "
                    + String.format("%.2f",valorTotal));
        }
    }
}
