package com.pacoprojects.exercicios.lista.aula36.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nome;
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public Agenda(List<Contato> contatos, String nome) {
        this.contatos = contatos;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public String imprimirDadosContatos(int position) {
        StringBuilder builder = new StringBuilder();
        Contato contato = this.getContatos().get(position);
        builder.append("CONTATO");
        builder.append("\nNome: ").append(contato.getNome());
        builder.append("\nE-mail: ").append(contato.getEmail());
        for (Telefone telefone : contato.getTelefones()) {
            builder.append("\nTELEFONE: ");
            builder.append("\nTipo: ").append(telefone.getTipoTelefone());
            builder.append("\nDDD: ").append(telefone.getDdd());
            builder.append("\nNúmero: ").append(telefone.getNumero());
        }
        builder.append("\n").append("\n-----------");
        return builder.toString();
    }
}
