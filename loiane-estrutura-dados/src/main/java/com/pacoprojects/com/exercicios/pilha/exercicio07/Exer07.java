package main.java.com.pacoprojects.com.exercicios.pilha.exercicio07;

import main.java.com.pacoprojects.com.exercicios.pilha.util.FuncoesUteis;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        int numero = FuncoesUteis.lerValorInt("Informe um número: ", scanner);
        calcularBinario(numero, pilha);
        imprimirNumeroBinario(numero, pilha);
        imprimirNumeroQualquerBase(25,16);
        imprimirNumeroQualquerBase(10035,8);
        imprimirNumeroQualquerBase(10035,16);
    }

    private static void calcularBinario(int numero, Stack<Integer> pilha) {
        int resultado = -1;
        while (resultado != 0) {
            resultado = numero / 2;
            pilha.push(numero % 2);
            numero = resultado;
        }
    }

    private static String calcularDecimalQualquerBase(int numero, int base) {

        if (base > 16) {
            throw new IllegalArgumentException("Base inválida");
        }

        Stack<Integer> pilha = new Stack<>();
        StringBuilder builder = new StringBuilder();
        int resultado = -1;
        String bases = "0123456789ABCDEF";
        while (resultado != 0) {
            resultado = numero / base;
            pilha.push(numero % base);
            numero = resultado;
        }

        while (!pilha.isEmpty()) {
            builder.append(bases.charAt(pilha.pop()));
        }
        return builder.toString();
    }

    private static void imprimirNumeroQualquerBase(int numero, int base) {
        System.out.println("Número " + numero + " em base " + base + " => " + calcularDecimalQualquerBase(numero, base));
    }

    private static void imprimirNumeroBinario(int numero, Stack<Integer> pilha) {
        StringBuilder builder = new StringBuilder();
        while (!pilha.isEmpty()) {
            builder.append(pilha.pop());
        }
        System.out.println("Número " + numero + " em binário => " + builder.toString());
    }
}
