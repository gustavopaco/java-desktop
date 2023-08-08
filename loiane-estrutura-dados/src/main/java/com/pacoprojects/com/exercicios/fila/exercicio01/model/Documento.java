package main.java.com.pacoprojects.com.exercicios.fila.exercicio01.model;

public class Documento {
    private String nome;
    private int quantidadeFolhas;

    public Documento() {
    }

    public Documento(String nome, int quantidadeFolhas) {
        this.nome = nome;
        this.quantidadeFolhas = quantidadeFolhas;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", quantidadeFolhas=" + quantidadeFolhas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFolhas() {
        return quantidadeFolhas;
    }

    public void setQuantidadeFolhas(int quantidadeFolhas) {
        this.quantidadeFolhas = quantidadeFolhas;
    }
}
