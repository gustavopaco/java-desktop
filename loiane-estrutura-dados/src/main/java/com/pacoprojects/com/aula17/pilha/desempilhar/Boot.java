package main.java.com.pacoprojects.com.aula17.pilha.desempilhar;

import main.java.com.pacoprojects.com.aula17.pilha.desempilhar.model.Pilha;

public class Boot {
    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>();

        System.out.println("Topo: " + pilha.topo());
        System.out.println("toString => " + pilha);

        System.out.println("Adicionando elementos...");
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        System.out.println("toString => " + pilha);

        System.out.println("Desempilhar elemento do topo");
        pilha.desempilhar();
        System.out.println("toString => " + pilha);
    }
}
