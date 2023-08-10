package main.java.com.pacoprojects.com.aula27.lista.encadeada.tamanho;

import main.java.com.pacoprojects.com.aula27.lista.encadeada.tamanho.model.ListaEncadeada;

public class Boot {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona(1);

        System.out.println("toString => " + listaEncadeada);
        System.out.println("Tamanho: " + listaEncadeada.getTamanho());
    }
}
