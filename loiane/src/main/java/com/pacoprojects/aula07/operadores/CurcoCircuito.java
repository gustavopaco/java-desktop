package com.pacoprojects.aula07.operadores;

public class CurcoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;

        // Quando o primeiro valor é falso, o segundo valor não é avaliado
        boolean resultado1 = (verdadeiro && falso);
        // Quando o primeiro valor é falso, o segundo valor é avaliado. Por isso não é recomendado usar o &.
        boolean resultado2 = (verdadeiro & falso);
        System.out.println("Verdadeiro && Falso: " + resultado1);
        System.out.println("Verdadeiro && Falso: " + resultado2);
    }
}
