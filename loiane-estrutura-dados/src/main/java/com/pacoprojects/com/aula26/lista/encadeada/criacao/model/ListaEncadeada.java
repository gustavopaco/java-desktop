package main.java.com.pacoprojects.com.aula26.lista.encadeada.criacao.model;

public class ListaEncadeada<T> {

    private No<T> inicio;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if (this.inicio == null) {
            this.inicio = celula;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaEncadeada{");
        sb.append("inicio=").append(inicio);
        sb.append('}');
        return sb.toString();
    }
}
