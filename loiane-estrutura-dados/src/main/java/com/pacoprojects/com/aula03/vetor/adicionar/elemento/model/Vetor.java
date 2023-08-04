package main.java.com.pacoprojects.com.aula03.vetor.adicionar.elemento.model;

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

    public boolean adicionarElemento2(String elemento) {
        if (this.tamanhoReal < elementos.length) {
            this.elementos[tamanhoReal] = elemento;
            this.tamanhoReal++;
            return true;
        } else {
            return false;
        }
    }
}
