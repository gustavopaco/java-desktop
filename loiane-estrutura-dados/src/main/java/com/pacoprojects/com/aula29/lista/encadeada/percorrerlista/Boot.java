package main.java.com.pacoprojects.com.aula29.lista.encadeada.percorrerlista;

import main.java.com.pacoprojects.com.aula29.lista.encadeada.percorrerlista.model.ListaEncadeada;

public class Boot {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona(1);
        listaEncadeada.adiciona(2);
        listaEncadeada.adiciona(3);

        System.out.println("toString => " + listaEncadeada);
        System.out.println("Tamanho: " + listaEncadeada.getTamanho());
        listaEncadeada.imprimirElementos();
    }
}
