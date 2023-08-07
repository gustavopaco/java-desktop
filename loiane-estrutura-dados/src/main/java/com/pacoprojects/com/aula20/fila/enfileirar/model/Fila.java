package main.java.com.pacoprojects.com.aula20.fila.enfileirar.model;

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
}
