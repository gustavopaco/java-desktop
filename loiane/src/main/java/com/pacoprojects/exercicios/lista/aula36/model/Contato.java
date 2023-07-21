package com.pacoprojects.exercicios.lista.aula36.model;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private String email;
    private List<Telefone> telefones;

    public Contato() {
        telefones = new ArrayList<>();
    }

    public Contato(String nome, String email, List<Telefone> telefones) {
        this.nome = nome;
        this.email = email;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
