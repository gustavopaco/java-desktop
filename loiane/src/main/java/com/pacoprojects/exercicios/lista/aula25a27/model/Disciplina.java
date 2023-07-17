package com.pacoprojects.exercicios.lista.aula25a27.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nome;
    public Professor professor;
    public List<Aluno> alunos = new ArrayList<>();

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
