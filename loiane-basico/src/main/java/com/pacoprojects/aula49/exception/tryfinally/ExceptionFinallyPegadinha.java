package com.pacoprojects.aula49.exception.tryfinally;

public class ExceptionFinallyPegadinha {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println("Numeros: " + numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
            } catch (ArithmeticException exception) {
                System.out.println("Exception lançada! Erro ao dividir por 0");
                System.exit(0);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Exception lançada! Erro ao acessar posição inexistente no array");
                System.exit(0);
            } finally {
                System.out.println("Essa linha é impressa SEMPRE, após o Try ou um Catch");
            }
        }
    }
}
