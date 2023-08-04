package com.pacoprojects.aula51.exception.custom;

public class UsandoMinhaException {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 5, 32, 21, 128};
        int[] denominador = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denominador[i]);
                }
                System.out.println("Numeros: " + numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata exception ) {
                System.out.println("Aconteceu um erro.");
                if (exception instanceof DivisaoNaoExata) {
                    System.out.println(exception.getMessage());
                }
                exception.printStackTrace();
            }
        }
    }
}
