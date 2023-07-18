package com.pacoprojects.aula32.oo.encapsulamento.getset.model;

public class Carro {
    private String marca;
    private String modelo;
    private int numeroPassageiros;
    private double capacidadeCombustivel;
    private double consumoCombustivel;

    public Carro() {
        this.numeroPassageiros = 4;
    }

    public Carro(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public void exibirAutonomia() {
        System.out.println("A autonomia do veículo " + this.modelo + " é " + (this.consumoCombustivel * this.capacidadeCombustivel) + " km por litro.");
    }

    public double obterAutonomia() {
        System.out.println("Método obter autonomia foi chamado!");
        return this.consumoCombustivel * this.capacidadeCombustivel;
    }

    public double calculaCombustivel(double km) {
        return km / this.consumoCombustivel;
    }
}
