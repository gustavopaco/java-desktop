package com.pacoprojects.exercicios.lista.aula28a33.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private Professor Professor;
    private List<AlunoDisciplina> alunoDisciplinas = new ArrayList<>();

    public Disciplina() {
    }

    public Disciplina(String nome, Professor professor, List<AlunoDisciplina> alunoDisciplinas) {
        this.nome = nome;
        Professor = professor;
        this.alunoDisciplinas = alunoDisciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor professor) {
        Professor = professor;
    }

    public List<AlunoDisciplina> getAlunoDisciplinas() {
        return alunoDisciplinas;
    }

    public void setAlunoDisciplinas(List<AlunoDisciplina> alunoDisciplinas) {
        this.alunoDisciplinas = alunoDisciplinas;
    }
}
