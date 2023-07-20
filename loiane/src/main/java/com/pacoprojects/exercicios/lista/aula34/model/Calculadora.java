package com.pacoprojects.exercicios.lista.aula34.model;

public class Calculadora {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static double dividir(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static int elevar(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }

    public static int fatorial(int numero) {
        int resultado = 1;
        imprimirIntroFatorial(numero);
        for (int i = numero; i >= 1 ; i--) {
            if (i > 1) {
                imprimirFatorial(i, false);
            } else {
                imprimirFatorial(i, true);
            }
            resultado *= i;
        }
        return resultado;
    }

    private static void imprimirIntroFatorial(int numero) {
        System.out.println("Fatorial de " + numero + ":");
        System.out.print(numero + "! = ");
    }

    private static void imprimirFatorial(int valor, boolean ultimoValor) {
        if (ultimoValor) {
            System.out.print(valor + " = ");
        } else {
            System.out.print(valor + " x ");
        }
    }

    public static double converterMetroQuadradoParaPeQuadrado(double valor) {
        return valor * 10.76;
    }

    public static double converterPeQuadradoParaCentimetroQuadrado(double valor) {
        return valor * 929;
    }

    public static double converterMilhaQuadradaParaAcres(double valor) {
        return valor * 640;
    }

    public static double converterAcreParaPeQuadrado(double valor) {
        return valor * 43560;
    }

    public static double converterLitroParaCentimetrosCubicos(double valor) {
        return valor * 1000;
    }

    public static double converterMetroCubicoParaLitros(double valor) {
        return valor * 1000;
    }

    public static double converterMetroCubicoParaPesCubicos(double valor) {
        return valor * 35.32;
    }

    public static double converterGalaoAmericanoParaPolegadasCubicas(double valor) {
        return valor * 231;
    }

    public static double converterGalaoAmericanaParaLitros(double valor) {
        return valor * 3.785;
    }

    public static int converterMinutosParaSegundos(double valor) {
        return (int) valor * 60;
    }

    public static int converterHoraParaMinutos(double valor) {
        return (int) valor * 60;
    }

    public static int converterDiaParaHoras(double valor) {
        return (int) valor * 24;
    }

    public static int converterSemanaParaDias(double valor) {
        return (int) valor * 7;
    }

    public static int converterMesParaDias(double valor) {
        return (int) valor * 30;
    }

    public static int converterAnoParaDias(double valor) {
        return (int) (valor * 365.25);
    }
}
