package com.pacoprojects.aula44.oo.interfaces.model;

public abstract class Animal {
    private String nome;

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();
}
