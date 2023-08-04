package main.java.com.pacoprojects.com.aula11.vetor.generalizar.configurar.tipo.generics.model;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanhoReal;

    public VetorObjetos(int capacidade) {
        elementos = new Object[capacidade];
    }

    public void adicionarElemento(Object elemento) throws ArrayIndexOutOfBoundsException {
        aumentarCapacidade();
        if (this.tamanhoReal < elementos.length) {
            this.elementos[tamanhoReal] = elemento;
            this.tamanhoReal++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }

    public boolean adicionar(Object elemento) {
        aumentarCapacidade();
        if (this.tamanhoReal < elementos.length) {
            this.elementos[tamanhoReal] = elemento;
            this.tamanhoReal++;
            return true;
        } else {
            return false;
        }
    }

    public int tamanho() {
        return this.tamanhoReal;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Object elemento : this.elementos) {
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

    public Object buscarElementoPosicao(int posicao) throws IllegalArgumentException {
        if (!(posicao >= 0 && posicao < this.tamanhoReal)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public int existe(Object elemento) {
        for (int i = 0; i < this.tamanhoReal; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void inserirElementoPosicao(Object elemento, int posicao) throws IllegalArgumentException {

        if (posicao < 0 || posicao >= this.tamanhoReal) {
            throw new IllegalArgumentException("Posição inválida");
        }

        aumentarCapacidade();

        if (this.elementos[posicao] != null) {
            for (int i = (this.tamanhoReal - 1); i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
        }
        this.elementos[posicao] = elemento;
        this.tamanhoReal++;
    }

    private void aumentarCapacidade() {
        if (this.tamanhoReal == this.elementos.length) {
            Object[] elementosNovos = new Object[elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void removerElemento(int posicao) throws IllegalArgumentException {

        if (this.tamanhoReal == 0) {
            throw new IllegalArgumentException("Vetor está vazio.");
        }

        if (posicao < 0 || posicao > this.tamanhoReal) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        for (int i = posicao; i < (this.tamanhoReal - 1); i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.elementos[this.tamanhoReal - 1] = null;

        this.tamanhoReal--;
    }
}
