package main.java.com.pacoprojects.com.aula26.lista.encadeada.criacao;

import main.java.com.pacoprojects.com.aula26.lista.encadeada.criacao.model.ListaEncadeada;

public class Boot {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona(1);

        System.out.println(listaEncadeada);
    }
}
