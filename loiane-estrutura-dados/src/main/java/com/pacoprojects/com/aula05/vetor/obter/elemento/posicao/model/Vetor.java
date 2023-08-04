package main.java.com.pacoprojects.com.aula05.vetor.obter.elemento.posicao.model;

public class Vetor {
    private String[] elementos;
    private int tamanhoReal;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
    }

//    public void adicionarElemento(String elemento) {
//        for (int i = 0; i < elementos.length; i++) {
//            if (elementos[i] == null) {
//                elementos[i] = elemento;
//                break;
//            }
//        }
//    }

    public void adicionarElemento(String elemento) throws ArrayIndexOutOfBoundsException {
        if (this.tamanhoReal < elementos.length) {
            this.elementos[tamanhoReal] = elemento;
            this.tamanhoReal++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }

    public boolean adicionar(String elemento) {
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
        for (String elemento : this.elementos) {
            if (elemento != null) {
                builder.append(elemento).append(", ");
            } else {
                break;
            }
        }
        builder.delete(builder.length() - 2, builder.length());
        builder.append("]");
        return builder.toString();
    }

    public String buscarElementoPosicao(int posicao) throws IllegalArgumentException {
        if (!(posicao >= 0 && posicao < this.tamanhoReal)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }
}
