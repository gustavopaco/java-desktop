package main.java.com.pacoprojects.com.aula15.pilha.verificar.vazia;

import main.java.com.pacoprojects.com.aula15.pilha.verificar.vazia.model.Pilha;

public class Boot {
    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>();

        System.out.println("Pilha está vazia? Elementos => " + pilha);
        imprimirEstadoPilha(pilha);

        System.out.println("Adicionando elementos...");
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");

        System.out.println("Pilha está vazia? Elementos => " + pilha);
        imprimirEstadoPilha(pilha);
    }


    private static void imprimirEstadoPilha(Pilha pilha) {
        if (pilha.estaVazio()) {
            System.out.println("A pilha está vazia");
        } else {
            System.out.println("A pilha não está vazia.");
        }
    }
}
