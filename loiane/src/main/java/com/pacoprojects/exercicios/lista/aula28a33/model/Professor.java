package com.pacoprojects.exercicios.lista.aula28a33.model;

public class Professor {
    private String nome;
    private String cpf;

    public Professor() {
    }

    public Professor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
