package com.pacoprojects.exercicios.lista.aula25a27.model;

public class NotasDisciplinaAluno {
    public Aluno aluno;
    public Disciplina disciplina;
    public Notas[] notas = new Notas[4];

    public void associarAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void associarDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
