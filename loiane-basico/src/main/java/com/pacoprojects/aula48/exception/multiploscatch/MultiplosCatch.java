package com.pacoprojects.aula48.exception.multiploscatch;

public class MultiplosCatch {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
                try {
                    System.out.println("Numeros: " + numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
                } catch (ArithmeticException exception) {
                    System.out.println("Exception lançada! Erro ao dividir por 0");
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("Exception lançada! Erro ao acessar posição inexistente no array");
                }
        }
    }
}
