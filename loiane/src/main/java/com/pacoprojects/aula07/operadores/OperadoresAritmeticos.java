package com.pacoprojects.aula07.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.printf("Resultado de 1 + 2 é: %d", resultado);
        resultado = resultado - 1;
        System.out.printf("\nResultado de 3 - 1 é: %d", resultado);
        resultado = resultado * 2;
        System.out.printf("\nResultado de 2 * 2 é: %d", resultado);
        resultado = resultado / 2;
        System.out.printf("\nResultado de 4 / 2 é: %d", resultado);
        resultado = resultado + 8;
        System.out.printf("\nResultado de 2 + 8 é: %d", resultado);
        resultado = resultado % 7;
        System.out.printf("\nResultado de 10 mod 7 é: %d", resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println("\n" + terceiroNome);
        resultado = resultado + 1;
        System.out.printf("\nResultado de 3 + 1 é: %d", resultado);
        resultado++;
        System.out.printf("\nResultado de 4 + 1 é: %d", resultado);

        // mesma coisa que resultado = resultado + 1 ou resultado += 1;
        System.out.printf("\nResultado de resultado++ é: %d", resultado++);
        System.out.printf("\nResultado de ++resultado é: %d", ++resultado);

        resultado--;
        System.out.printf("\nResultado de 7 - 1 é: %d", resultado);
        System.out.printf("\nResultado de resultado-- é: %d", resultado--);
        System.out.printf("\nResultado de --resultado é: %d", --resultado);
    }
}
