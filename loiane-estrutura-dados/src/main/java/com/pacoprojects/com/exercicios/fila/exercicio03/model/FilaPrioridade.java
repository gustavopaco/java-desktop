package main.java.com.pacoprojects.com.exercicios.fila.exercicio03.model;

import main.java.com.pacoprojects.com.aula24.fila.prioridade.model.Fila;

public class FilaPrioridade<T> extends Fila<T> {

    @Override
    @SuppressWarnings("unchecked")
    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i = 0; i < super.tamanho; i++) {
            if (chave.compareTo(super.elementos[i]) < 0) {
                break;
            }
        }
        super.adiciona(elemento, i);
    }
}
