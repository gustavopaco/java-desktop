package main.java.com.pacoprojects.com.exercicios.pilha.exercicio01;

import main.java.com.pacoprojects.com.exercicios.pilha.util.FuncoesUteis;

import java.util.Scanner;
import java.util.Stack;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        for (int i = 0; i < 10; i++) {
            int valor = FuncoesUteis.lerValorInt(i + " - Informe um valor numérico: ", scanner);
            if (FuncoesUteis.isPar(valor)) {
                pilha.push(valor);
            } else {
                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia...");
                } else {
                    System.out.println("Desempilhando elemento da pilha pois número informado é ímpar...");
                    System.out.println("Elemento a ser desempilhado: " + pilha.pop());
                }
            }
        }
        if (!pilha.isEmpty()) {
            System.out.println();
            System.out.println("Finalizando Programa...");
            System.out.println("Removendo elementos restantes na pilha...");
            while (!pilha.isEmpty()) {
                System.out.println("Desempilhando: " + pilha.pop() + " ...");
            }
            System.out.println();
            System.out.println("Todos os elementos foram removidos.");
            System.out.println(pilha);
        }
    }
}
