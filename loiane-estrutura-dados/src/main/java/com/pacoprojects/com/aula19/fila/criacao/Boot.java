package main.java.com.pacoprojects.com.aula19.fila.criacao;

import main.java.com.pacoprojects.com.aula19.fila.criacao.model.Fila;

public class Boot {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println("toString => " + fila);
        System.out.println("Está vazia: " + fila.estaVazio());
        System.out.println("Tamanho: " + fila.tamanho());
    }
}
