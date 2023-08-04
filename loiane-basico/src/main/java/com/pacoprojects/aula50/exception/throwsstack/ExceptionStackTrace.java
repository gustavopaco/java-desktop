package com.pacoprojects.aula50.exception.throwsstack;

public class ExceptionStackTrace {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println("Numeros: " + numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        }
    }
}
