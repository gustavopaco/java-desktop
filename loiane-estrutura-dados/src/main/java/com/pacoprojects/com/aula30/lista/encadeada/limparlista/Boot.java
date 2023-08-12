package main.java.com.pacoprojects.com.aula30.lista.encadeada.limparlista;

import main.java.com.pacoprojects.com.aula30.lista.encadeada.limparlista.model.ListaEncadeada;

public class Boot {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona(1);
        listaEncadeada.adiciona(2);
        listaEncadeada.adiciona(3);
        listaEncadeada.adiciona(4);

        System.out.println("toString => " + listaEncadeada);
        System.out.println("Tamanho: " + listaEncadeada.getTamanho());
        System.out.println("toString => " + listaEncadeada);
        System.out.println();

        listaEncadeada.limpar();
        System.out.println("toString => " + listaEncadeada);
        System.out.println("Tamanho: " + listaEncadeada.getTamanho());
    }
}
