package com.pacoprojects.exercicios.lista.aula36.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private List<NotasAlunoCurso> notasAlunoCursos;

    public Curso() {
        notasAlunoCursos = new ArrayList<>();
    }

    public Curso(String nome, String horario, Professor professor, List<NotasAlunoCurso> notasAlunoCursos) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.notasAlunoCursos = notasAlunoCursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<NotasAlunoCurso> getAlunos() {
        return notasAlunoCursos;
    }

    public void setAlunos(List<NotasAlunoCurso> notasAlunoCursos) {
        this.notasAlunoCursos = notasAlunoCursos;
    }

    public void associarProfessor(Professor professor) {
        this.professor = professor;
    }

    private double getMediaTurma() {
        double somaNotasTurma = 0;
        for (NotasAlunoCurso notasAlunoCurso : this.notasAlunoCursos) {
            somaNotasTurma += notasAlunoCurso.getMedia();
        }
        return somaNotasTurma / this.getAlunos().size();
    }

    public void imprimirDadosCurso() {
        System.out.println();
        System.out.println("################");
        System.out.println("CURSO: " + this.nome);
        System.out.println("HORÁRIO: " + this.horario);
    }

    public void imprimirDadosProfessor() {
        this.professor.imprimirDadosProfessor();
    }

    public void imprimirMediaAluno() {
        this.notasAlunoCursos.forEach(NotasAlunoCurso::imprimirMediaAluno);
    }

    public void imprimirMediaTurma() {
        System.out.println("MÉDIA DA TURMA: " + getMediaTurma());
    }
}
