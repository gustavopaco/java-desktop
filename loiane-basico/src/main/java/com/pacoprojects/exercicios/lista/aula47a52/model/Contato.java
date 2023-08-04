package com.pacoprojects.exercicios.lista.aula47a52.model;

import java.util.ArrayList;
import java.util.List;

public class Contato {

    private final Long id;
    private String nome;
    private final List<Telefone> telefones;
    private static long CONTADOR;

    public Contato() {
        CONTADOR++;
        this.id = CONTADOR;
        telefones = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: ").append(this.id).append("\n");
        builder.append("Nome: ").append(this.nome).append("\n");
        builder.append("Telefones: [ ");
        this.telefones.forEach(telefone -> builder.append(telefone.getNumero()).append(" , "));
        builder.delete(builder.length() - 2, builder.length());
        builder.append("]");
        return builder.toString();
    }
}
