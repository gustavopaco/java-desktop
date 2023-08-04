package com.pacoprojects.exercicios.lista.aula37a43.model;

public abstract class Animal {
    private String nome;
    private double comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
    }

    public Animal(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        setNumeroPatas(4);
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Animal: " + this.getNome() +
                "\nComprimento: " + (int) this.getComprimento() + " cm" +
                "\nPatas: " + this.getNumeroPatas() +
                "\nCor: " + this.getCor() +
                "\nAmbiente: " + this.getAmbiente() +
                "\nVelocidade: " + this.getVelocidade() + " m/s";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;

        if (Double.compare(animal.getComprimento(), getComprimento()) != 0) return false;
        if (getNumeroPatas() != animal.getNumeroPatas()) return false;
        if (Double.compare(animal.getVelocidade(), getVelocidade()) != 0) return false;
        if (!getNome().equals(animal.getNome())) return false;
        if (getCor() != null ? !getCor().equals(animal.getCor()) : animal.getCor() != null) return false;
        return getAmbiente() != null ? getAmbiente().equals(animal.getAmbiente()) : animal.getAmbiente() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNome().hashCode();
        temp = Double.doubleToLongBits(getComprimento());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getNumeroPatas();
        result = 31 * result + (getCor() != null ? getCor().hashCode() : 0);
        result = 31 * result + (getAmbiente() != null ? getAmbiente().hashCode() : 0);
        temp = Double.doubleToLongBits(getVelocidade());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
