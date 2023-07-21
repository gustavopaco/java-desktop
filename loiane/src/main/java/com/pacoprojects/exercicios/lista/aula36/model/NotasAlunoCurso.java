package com.pacoprojects.exercicios.lista.aula36.model;

import java.util.ArrayList;
import java.util.List;

public class NotasAlunoCurso {
    private Aluno aluno;
    private Curso curso;
    private List<Nota> notas;

    public NotasAlunoCurso() {
        notas = new ArrayList<>();
    }

    public NotasAlunoCurso(Aluno aluno, Curso curso, List<Nota> notas) {
        this.aluno = aluno;
        this.curso = curso;
        this.notas = notas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void adicionarNota(Nota nota) {
        this.getNotas().add(nota);
    }

    private void imprimirDadosAluno() {
        System.out.println("ALUNO: " + aluno.getNome());
        System.out.println("MATRÍCULA: " + aluno.getMatricula());
    }

    private void imprimirNotasAluno() {
        System.out.print("NOTAS: ");
        for (int i = 0; i < this.notas.size(); i++) {
            if (i == this.notas.size() - 1) {
                System.out.print(this.notas.get(i).getValor());
            } else {
                System.out.print(this.notas.get(i).getValor() + " | ");
            }
        }
    }

    private void imprimirAlunoAprovado(double media) {
        if (media >= 7) {
            System.out.println("\nNOTA FINAL: " + media + ", APROVADO");
        } else {
            System.out.println("\nNOTA FINAL: " + media + ", REPROVADO");
        }
        System.out.println();
        System.out.println("----------------");
    }

    public double getSomaNotas() {
        double somaNotas = 0;
        for (Nota nota : this.getNotas()) {
            somaNotas += nota.getValor();
        }
        return somaNotas;
    }

    public double getMedia() {
        return getSomaNotas() / 4;
    }

    public void imprimirMediaAluno() {
       imprimirDadosAluno();
       imprimirNotasAluno();
       double media = getMedia();
       imprimirAlunoAprovado(media);
    }
}
