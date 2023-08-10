package main.java.com.pacoprojects.com.aula27.lista.encadeada.tamanho.model;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private int tamanho;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if (this.inicio == null) {
            this.inicio = celula;
        }
        this.tamanho++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaEncadeada{");
        sb.append("inicio=").append(inicio);
        sb.append('}');
        return sb.toString();
    }

    public int getTamanho() {
        return tamanho;
    }
}
