package com.pacoprojects.aula29.oo.construtores.model;

public class Carro {
    public String marca;
    public String modelo;
    public int numeroPassageiros;
    public double capacidadeCombustivel;
    public double consumoCombustivel;

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

    public void exibirAutonomia() {
        System.out.println("A autonomia do veículo " + modelo + " é " + (consumoCombustivel * capacidadeCombustivel) + " km por litro.");
    }

    public double obterAutonomia() {
        System.out.println("Método obter autonomia foi chamado!");
        return consumoCombustivel * capacidadeCombustivel;
    }

    public double calculaCombustivel(double km) {
        return km / consumoCombustivel;
    }
}
