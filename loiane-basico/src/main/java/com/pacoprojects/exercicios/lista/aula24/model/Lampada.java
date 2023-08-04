package com.pacoprojects.exercicios.lista.aula24.model;

import java.util.ArrayList;
import java.util.List;

public class Lampada {
    public String marca;
    public String modelo;
    public String tensao;
    public int potencia;
    public String cor;
    public String tipoLuz;
    public int garantiaMeses;
    public List<TipoLampada> tipos = new ArrayList<>();
    public double valor;
    public String descricao;
}
