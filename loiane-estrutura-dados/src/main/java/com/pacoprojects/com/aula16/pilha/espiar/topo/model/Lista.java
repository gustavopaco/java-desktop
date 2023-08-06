package main.java.com.pacoprojects.com.aula16.pilha.espiar.topo.model;

public class Lista<T> extends EstruturaEstatica<T> {
    public Lista(int capacidade) {
        super(capacidade);
    }

    public Lista() {
        super();
    }

    public Lista(Class<T> tipoClasse, int capacidade) {
        super(tipoClasse, capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(T elemento, int posicao) throws IllegalArgumentException {
        return super.adiciona(elemento, posicao);
    }

    public T buscar(int posicao) throws IllegalArgumentException {
        super.validarPosicao(posicao);
        return super.elementos[posicao];
    }

    public int existe(T elemento) {
        for (int i = 0; i < super.tamanho; i++) {
            if (super.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remover(int posicao) throws IllegalArgumentException {
        super.validarVetorVazioAoRemover();
        super.validarPosicao(posicao);

        for (int i = posicao; i < (super.tamanho - 1); i++) {
            super.elementos[i] = super.elementos[i + 1];
        }
        super.elementos[super.tamanho - 1] = null;
        super.tamanho--;
    }
}
