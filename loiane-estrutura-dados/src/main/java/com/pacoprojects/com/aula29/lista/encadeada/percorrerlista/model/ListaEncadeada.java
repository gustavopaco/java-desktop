package main.java.com.pacoprojects.com.aula29.lista.encadeada.percorrerlista.model;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if (this.inicio == null) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
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

    public void imprimirElementos() {
        No<T> celula = this.inicio;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (celula != null) {
            builder.append(celula.getElemento()).append(", ");
            celula = celula.getProximo();
        }
        if (builder.toString().contains(",")) {
            builder.delete(builder.length() -2, builder.length());
        }
        builder.append("]");
        System.out.println(builder);
    }
}
