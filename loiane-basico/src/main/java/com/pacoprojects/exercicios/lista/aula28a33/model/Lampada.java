package com.pacoprojects.exercicios.lista.aula28a33.model;

public class Lampada {
    private String modelo;
    private String marca;
    private String tensao;
    private int potencia;
    private String cor;
    private int garantiaMeses;
    private double peso;
    private boolean wifi;
    private double valor;
    private boolean ligado;

    public Lampada() {
    }

    public Lampada(String modelo, String marca, String tensao, int potencia, String cor, int garantiaMeses, double peso, boolean wifi, double valor, boolean ligado) {
        this.modelo = modelo;
        this.marca = marca;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.garantiaMeses = garantiaMeses;
        this.peso = peso;
        this.wifi = wifi;
        this.valor = valor;
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void mostrarEstadoLampada() {
        if (ligado) {
            System.out.println("A lampada está ligada.");
        } else {
            System.out.println("A lampada está desligada.");
        }
    }
}
