package main.java.com.pacoprojects.com.aula20.fila.enfileirar;

import main.java.com.pacoprojects.com.aula20.fila.enfileirar.model.Fila;

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
    }
}
