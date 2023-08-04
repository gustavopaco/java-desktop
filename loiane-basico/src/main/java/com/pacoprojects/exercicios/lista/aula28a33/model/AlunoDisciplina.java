package com.pacoprojects.exercicios.lista.aula28a33.model;

public class AlunoDisciplina {
    private Aluno aluno;
    private Disciplina disciplina;
    private final Nota[] notas = new Nota[4];

    public AlunoDisciplina() {
    }

    public AlunoDisciplina(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void associarNotasAluno(int posicao, Nota nota) {
        this.notas[posicao] = nota;
    }

    public void associarAlunoDisciplina(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
}
