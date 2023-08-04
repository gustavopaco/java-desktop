package com.pacoprojects.exercicios.lista.aula37a43.model;

public abstract class Contribuinte {
    private String nome;

    public Contribuinte() {
    }

    public Contribuinte(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contribuinte that)) return false;

        return getNome().equals(that.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }

    public abstract void calcularImpostoRenda(double rendaBruta);
}
