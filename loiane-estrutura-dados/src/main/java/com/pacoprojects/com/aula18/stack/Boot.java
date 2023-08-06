package main.java.com.pacoprojects.com.aula18.stack;

import java.util.Stack;

public class Boot {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        System.out.println("Está vazia: " + pilha.isEmpty());
        System.out.println("toString => " + pilha);
        System.out.println();

        System.out.println("Adicionar elementos...");
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        System.out.println("toString => " + pilha);
        System.out.println("Tamanho: " + pilha.size());
        System.out.println("Está vazia: " + pilha.isEmpty());
        System.out.println();
        System.out.println("Ver elemento do Topo: " + pilha.peek());
        System.out.println("Remover elemento do topo: " + pilha.pop());
        System.out.println("toString => " + pilha);
        System.out.println("Tamanho: " + pilha.size());

    }
}
