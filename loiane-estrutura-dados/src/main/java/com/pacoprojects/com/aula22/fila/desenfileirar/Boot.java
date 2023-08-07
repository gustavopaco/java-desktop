package main.java.com.pacoprojects.com.aula22.fila.desenfileirar;

import main.java.com.pacoprojects.com.aula22.fila.desenfileirar.model.Fila;

public class Boot {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println("toString => " + fila);
        System.out.println("Está vazia: " + fila.estaVazio());

        System.out.println();
        System.out.println("Adicionando elementos...");

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);

        System.out.println("toString => " + fila);
        System.out.println("Está vazia: " + fila.estaVazio());
        System.out.println("Tamanho: " + fila.tamanho());
        System.out.println("Espiar elemento do inicio da fila: " + fila.espiar());

        System.out.println("Desenfileirando elemento do inicio da fila... " + fila.espiar());
        fila.desenfileira();
        System.out.println("toString => " + fila);
        System.out.println("Desenfileirando outro elemento do inicio da fila... " + fila.espiar());
        fila.desenfileira();
        System.out.println("toString => " + fila);
    }
}
