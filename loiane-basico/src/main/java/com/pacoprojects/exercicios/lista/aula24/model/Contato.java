package com.pacoprojects.exercicios.lista.aula24.model;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    public String nome;
    public String email;
    public String apelido;
    public List<Telefone> telefones = new ArrayList<>();
    public Endereco endereco;
    public String descricao;
}
