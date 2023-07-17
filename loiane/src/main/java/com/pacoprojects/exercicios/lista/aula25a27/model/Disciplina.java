package com.pacoprojects.exercicios.lista.aula25a27.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nome;
    public Professor professor;
    public List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void associarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void associarProfessor(Professor professor) {
        this.professor = professor;
    }
}
