package main.java.com.pacoprojects.com.aula13.pilha.criacao.model;

import java.lang.reflect.Array;

public abstract class EstruturaEstatica<T> {

    protected T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public EstruturaEstatica() {
        this.elementos = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
    }

    @SuppressWarnings("unchecked")
    public EstruturaEstatica(Class<T> classType, int capacidade) {
        this.elementos = (T[]) Array.newInstance(classType, capacidade);
    }

    @SuppressWarnings("unchecked")
    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovo = (T[]) new Object[this.elementos.length * 2];
            // Note: arraycopy(ArrayAntigo, IndexInicial, ArrayNovo, DestinoIndexInicial, TamanhoACopiar)
            System.arraycopy(this.elementos, 0, elementosNovo, 0, this.elementos.length);
            this.elementos = elementosNovo;
        }
    }

    protected boolean adiciona(T elemento) {
        aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // 0 1 2 3 4 5 6
    // A B C D E F      tamanho = 6     i = tamanho -1
    // vet[6] F = vet[5]
    // vet[5] E = vet[4]
    // vet[4] D = vet[3]
    // vet[3] C = vet[2]
    // vet[2] B = vet[1]
    // vet[0] A = novoValor
    protected boolean adiciona(T elemento, int posicao) throws IllegalArgumentException {
        validarPosicao(posicao);
        aumentarCapacidade();
        if (this.elementos[posicao] != null) {
            for (int i = (this.tamanho - 1); i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    protected void validarPosicao(int posicao) throws IllegalArgumentException {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
    }

    protected void validarVetorVazioAoRemover() throws ArrayIndexOutOfBoundsException {
        if (this.tamanho == 0) {
            throw new ArrayIndexOutOfBoundsException("Vetor está vazio.");
        }
    }

    public int tamanho() {
        return tamanho;
    }

    protected void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (T elemento : this.elementos) {
            if (elemento != null) {
                builder.append(elemento).append(", ");
            } else {
                break;
            }
        }
        if (builder.toString().contains(",")) {
            builder.delete(builder.length() - 2, builder.length());
        }
        builder.append("]");
        return builder.toString();
    }
}
