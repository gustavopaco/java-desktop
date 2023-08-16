package main.java.com.pacoprojects.com.aula34.lista.encadeada.busca.model;

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
        No<T> celula = this.inicio;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (celula != null) {
            builder.append(celula.getElemento()).append(", ");
            celula = celula.getProximo();
        }
        if (builder.toString().contains(",")) {
            builder.delete(builder.length() - 2, builder.length());
        }
        builder.append("]");
        return builder.toString();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void limpar() {
        if (this.tamanho > 0) {
            No<T> proximo;
            while (this.inicio != null) {
                proximo = this.inicio.getProximo();
                this.inicio.setElemento(null);
                this.inicio.setProximo(null);
                this.inicio = proximo;
            }
            this.tamanho = 0;
            this.ultimo = null;
        }
    }

    public void remover(T elemento) {
        if (this.tamanho > 0) {
            No<T> temp = this.inicio;
            boolean removido = false;
            No<T> novoInicio = new No<>();
            for (int i = 0; i < this.tamanho; i++) {
                if (novoInicio.getElemento() == null && !temp.getElemento().equals(elemento)) {
                    addOnFirst(novoInicio, temp);
                    temp = temp.getProximo();
                    continue;
                }

                if (removido && temp.getElemento().equals(elemento)) {
                    if (novoInicio.getElemento() == null) {
                        addOnFirst(novoInicio, temp);
                        temp = temp.getProximo();
                        continue;
                    } else {
                        addNext(temp.getElemento());
                    }
                }

                if (!temp.getElemento().equals(elemento)) {
                    addNext(temp.getElemento());
                } else {
                    removido = true;
                }

                temp = temp.getProximo();
            }
            this.inicio = novoInicio;
            this.tamanho--;
        }
    }

    private void addNext(T elemento) {
        No<T> celula = new No<>(elemento);
        this.ultimo.setProximo(celula);
        this.ultimo = celula;
    }

    private void addOnFirst(No<T> novoInicio, No<T> temp) {
        novoInicio.setElemento(temp.getElemento());
        this.ultimo = novoInicio;
    }

    public void removerTodos(T elemento) {
        if (this.tamanho > 0) {
            No<T> temp = this.inicio;
            No<T> novoInicio = new No<>();
            for (int i = 0; i < this.tamanho; i++) {
                if (novoInicio.getElemento() == null && !temp.getElemento().equals(elemento)) {
                    addOnFirst(novoInicio, temp);
                    temp = temp.getProximo();
                    continue;
                } else if (!temp.getElemento().equals(elemento)) {
                    addNext(temp.getElemento());
                }
                temp = temp.getProximo();
            }
            this.inicio = novoInicio;
            this.tamanho--;
        }
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public int existe(T elemento) {
        No<T> temp = this.inicio;
        int cont = 0;
        while (temp != null) {
            if (temp.getElemento().equals(elemento)) {
                return cont;
            }
            temp = temp.getProximo();
            cont++;
        }
        return -1;
    }

    public T busca(int posicao) throws IllegalArgumentException {
        if (!estaVazio()) {
            if (posicao < 0 || posicao >= this.tamanho) {
                throw new IllegalArgumentException("Posição inválida.");
            }

            No<T> temp = this.inicio;
            for (int i = 0; i <= posicao; i++) {
                if (i == posicao) {
                    return temp.getElemento();
                }
                temp = temp.getProximo();
            }
        }
        return null;
    }
}
