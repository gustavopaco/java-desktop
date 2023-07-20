package com.pacoprojects.exercicios.lista.aula34;

import com.pacoprojects.exercicios.lista.aula34.model.Calculadora;

public class BootCalculadora {
    public static void main(String[] args) {
        System.out.println("A soma de 1 + 2 = " + Calculadora.somar(1,2));
        System.out.println("A subtração de 2 - 2 = " + Calculadora.subtrair(2,2));
        System.out.println("A divisão de 10 por 5 = " + Calculadora.dividir(10,5));
        System.out.println("A potencia de 3 elevado a 3 = " + Calculadora.elevar(3,3));
        System.out.print(Calculadora.fatorial(0));
        System.out.println();

        System.out.println("A conversão de 5 metros quadrados para pés quadrados é: " + Calculadora.converterMetroQuadradoParaPeQuadrado(5) + " pés quadrados");
        System.out.println("A conversão de 10 pés quadrados para centímetros quadrados é: " + Calculadora.converterPeQuadradoParaCentimetroQuadrado(10) + " centímetros quadrados");
        System.out.println("A conversão de 8 milhas quadradas para acres é: " + Calculadora.converterMilhaQuadradaParaAcres(8) + " acres");
        System.out.println("A conversão de 20 acres para pés quadrados é: " + Calculadora.converterAcreParaPeQuadrado(20) + " pés quadrados");

        System.out.println("A conversão de 2 Litros para centímetros cúbicos é: " + Calculadora.converterLitroParaCentimetrosCubicos(2) + " centímetros cúbicos");
        System.out.println("A conversão de 5 Metros cúbicos para Litros é: " + Calculadora.converterMetroCubicoParaLitros(5) + " litros");
        System.out.println("A conversão de 5 Metros cúbicos para pés cúbicos é: " + Calculadora.converterMetroCubicoParaPesCubicos(5) + " pés cúbicos");
        System.out.println("A conversão de 10 Galões americanos para polegadas cúbicas é: " + Calculadora.converterGalaoAmericanoParaPolegadasCubicas(10) + " polegadas cúbicas");
        System.out.println("A conversão de 10 Galões americanos para litros é: " + Calculadora.converterGalaoAmericanaParaLitros(10) + " litros");

        System.out.println("A conversão de 5 minutos para segundos é: " + Calculadora.converterMinutosParaSegundos(5) + " segundos");
        System.out.println("A conversão de 2 horas para minutos é: " + Calculadora.converterHoraParaMinutos(2) + " minutos");
        System.out.println("A conversão de 7 dias para horas é: " + Calculadora.converterDiaParaHoras(7) + " horas");
        System.out.println("A conversão de 8 semanas para dias é: " + Calculadora.converterSemanaParaDias(8) + " dias");
        System.out.println("A conversão de 8 meses para dias é: " + Calculadora.converterMesParaDias(8) + " dias");
        System.out.println("A conversão de 5 ano para dias é: " + Calculadora.converterAnoParaDias(5) + " dias");
    }
}
