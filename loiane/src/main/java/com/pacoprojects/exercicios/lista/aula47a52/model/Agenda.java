package com.pacoprojects.exercicios.lista.aula47a52.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {
    private final List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public Optional<Contato> consultarContato(String nome) {
        return this.contatos.stream().filter(contato -> contato.getNome().equalsIgnoreCase(nome)).findFirst();
    }
}
