package main.java.com.pacoprojects.com.aula15.pilha.verificar.vazia.model;

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

    public boolean empilhar(T elemento) {
        return super.adiciona(elemento);
    }
}
