package com.pacoprojects.aula36.oo.relacionamento.model;

public class Telefone {
    private String ddd;
    private String numero;
    private String tipo;

    public Telefone() {
    }

    public Telefone(String ddd, String numero, String tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
