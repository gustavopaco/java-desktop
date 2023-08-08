package main.java.com.pacoprojects.com.exercicios.fila.exercicio04.model;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila() {
      super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila(Class<T> classType, int capacidade) {
        super(classType, capacidade);
    }

    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }

    public T espiar() {
        if (!super.estaVazio()) {
            return super.elementos[0];
        }
        return null;
    }

    // 0 1 2
    // A B C
    // vet[0] = vet[1]
    // vet[1] = vet[2]
    // vet[2] = false
    public T desenfileira() {
        T elemento = null;
        if (!super.estaVazio()) {
            elemento = super.elementos[0];
            for (int i = 0; i < super.tamanho - 1; i++) {
                super.elementos[i] = super.elementos[i + 1];
            }
            super.elementos[super.tamanho - 1] = null;
            super.tamanho--;
        }
        return elemento;
    }
}
