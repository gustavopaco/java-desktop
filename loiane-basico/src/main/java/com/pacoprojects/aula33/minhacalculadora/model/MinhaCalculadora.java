package com.pacoprojects.aula33.minhacalculadora.model;

public class MinhaCalculadora {
    public int soma (int num1, int num2) {
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int soma(int[] vetInteiros) {
        int soma = 0;
        for (int i = 0; i < vetInteiros.length; i++) {
            soma += vetInteiros[i];
        }
        return soma;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }
}
