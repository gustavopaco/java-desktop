package com.pacoprojects.exercicios.lista.aula25a27.model;

public class Lampada {
    public String modelo;
    public String tensao;
    public int potencia;
    public String cor;
    public int garantiaMeses;
    public double peso;
    public boolean isWifi;
    public TipoLampada tipoLampada;
    public boolean isLigado;

    public void ligarLampada() {
        this.isLigado = true;
    }

    public void desligarLampada() {
        isLigado = false;
    }

}
