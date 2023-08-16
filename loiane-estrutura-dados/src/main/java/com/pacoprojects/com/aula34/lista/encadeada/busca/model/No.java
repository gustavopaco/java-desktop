package main.java.com.pacoprojects.com.aula34.lista.encadeada.busca.model;

import java.util.Objects;

public class No<T> {
    private T elemento;
    private No<T> proximo;

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No() {
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("No{");
        sb.append("elemento=").append(elemento);
        sb.append(", proximo=").append(proximo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof No<?> no)) return false;
        return Objects.equals(getElemento(), no.getElemento()) && Objects.equals(getProximo(), no.getProximo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getElemento(), getProximo());
    }
}
