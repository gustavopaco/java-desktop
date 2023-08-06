package main.java.com.pacoprojects.com.aula13.pilha.criacao.model;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha(Class<T> classType, int capacidade) {
        super(classType, capacidade);
    }
}
