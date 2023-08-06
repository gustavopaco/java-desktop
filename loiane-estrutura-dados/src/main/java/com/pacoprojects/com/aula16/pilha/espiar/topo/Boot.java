package main.java.com.pacoprojects.com.aula16.pilha.espiar.topo;

import main.java.com.pacoprojects.com.aula16.pilha.espiar.topo.model.Pilha;

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

        System.out.println("Topo: " + pilha.topo());
        System.out.println("toString => " + pilha);
    }
}
