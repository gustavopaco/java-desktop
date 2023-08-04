package com.pacoprojects.exercicios.lista.aula37a43.model;

public abstract class Mamifero extends Animal{

    private String alimento;

    public Mamifero() {
        setAmbiente("Terra");
    }

    public Mamifero(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mamifero mamifero)) return false;
        if (!super.equals(o)) return false;

        return getAlimento() != null ? getAlimento().equals(mamifero.getAlimento()) : mamifero.getAlimento() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getAlimento() != null ? getAlimento().hashCode() : 0);
        return result;
    }
}
