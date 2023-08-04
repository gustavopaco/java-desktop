package com.pacoprojects.aula07.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1  && valor2 == 2);
        System.out.println("Valor 1 é 1 AND valor 2 é 2: " + resultado1);

        boolean resultado2 = (valor1 == 1  || valor2 == 2);
        System.out.println("Valor 1 é 1 OR valor 2 é 2: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("Verdadeiro AND Falso: " + (verdadeiro && falso));
        System.out.println("Verdadeiro OR Falso: " + (verdadeiro || falso));
        System.out.println("Verdadeiro XOR Falso: " + (verdadeiro ^ falso));
        System.out.println("NOT Verdadeiro: " + (!verdadeiro));
        System.out.println("NOT Falso: " + (!falso));
    }
}
