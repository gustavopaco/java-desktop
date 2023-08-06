package main.java.com.pacoprojects.com.exercicios.pilha.exercicio02;

import main.java.com.pacoprojects.com.exercicios.pilha.util.FuncoesUteis;

import java.util.Scanner;
import java.util.Stack;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> par = new Stack<>();
        Stack<Integer> impar = new Stack<>();

        for (int i = 0; i < 10; i++) {
            int valor = FuncoesUteis.lerValorInt((i + 1) + " - Informe um valor numérico:", scanner);
            if (valor == 0) {
                System.out.println();
                System.out.println("Valor 0 detectado! Removendo um elemento de cada pilha...");
                if (par.isEmpty()) {
                    System.out.println("ERRO: Pilha de elementos PARES está vazia");
                } else {
                    System.out.println("Elemento " + par.pop() + " desempilhado da pilha PAR");
                }
                if (impar.isEmpty()) {
                    System.out.println("ERRO: Pilha de elementos IMPARES está vazia");
                } else {
                    System.out.println("Elemento " + impar.pop() + " desempilhado da pilha IMPAR");
                }
            } else {
                if (FuncoesUteis.isPar(valor)) {
                    System.out.println();
                    System.out.println("Empilhando valor: " + valor + " ...");
                    par.push(valor);
                    System.out.println("Valor " + par.peek() + " empilhado.");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Empilhando valor: " + valor + " ...");
                    impar.push(valor);
                    System.out.println("Valor " + impar.peek() + " empilhado.");
                    System.out.println();
                }
            }
        }

        System.out.println("Finalizando o programa...");
        desempilhar("PAR", par);
        desempilhar("IMPAR", impar);
        System.out.println("Programa Finalizado.");
    }

    private static void desempilhar(String nomePilha, Stack<Integer> pilha) {
        System.out.println("Desempilhando elementos da pilha " + nomePilha + "...");
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando " + pilha.peek() + " ...");
            pilha.pop();
        }
        System.out.println("Todos os elementos da Pilha " + nomePilha + " foram desempilhados.");
        System.out.println();
    }
}
