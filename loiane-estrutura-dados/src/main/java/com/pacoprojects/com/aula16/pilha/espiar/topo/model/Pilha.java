package main.java.com.pacoprojects.com.aula16.pilha.espiar.topo.model;

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

    public T topo() {
        if (super.estaVazio()) {
            return null;
        }
        return this.elementos[this.tamanho - 1];
    }
}
