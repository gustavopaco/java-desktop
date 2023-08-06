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
    }

    private static void calcularBinario(int numero, Stack<Integer> pilha) {
        int resultado = -1;
        while (resultado != 0) {
            resultado = numero / 2;
            pilha.push(numero % 2);
            numero = resultado;
        }
    }

    private static void imprimirNumeroBinario(int numero, Stack<Integer> pilha) {
        StringBuilder builder = new StringBuilder();
        while (!pilha.isEmpty()) {
            builder.append(pilha.pop());
        }
        System.out.println("Número " + numero + " em binário => " + builder.toString());
    }
}
