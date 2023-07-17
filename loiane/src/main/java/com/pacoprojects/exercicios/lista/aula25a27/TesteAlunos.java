package com.pacoprojects.exercicios.lista.aula25a27;

import com.pacoprojects.exercicios.lista.aula25a27.model.*;

import java.util.List;

public class TesteAlunos {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Fulano";
        aluno.cpf = "123456";
        aluno.sobrenome = "da Silva";
        aluno.curso = "Sistema de informação";

        Disciplina disciplina = new Disciplina();
        disciplina.nome = "Lógica";

        Professor professor = new Professor();
        professor.nome = "Professor Girafales";
        professor.cpf = "987565621";

        disciplina.professor = professor;
        disciplina.addAluno(aluno);

        NotasDisciplinaAluno notasDisciplinaAluno = new NotasDisciplinaAluno();
        notasDisciplinaAluno.disciplina = disciplina;
        notasDisciplinaAluno.aluno = aluno;

        Notas notas = new Notas();
        notas.valor = 8;
        Notas notas1 = new Notas();
        notas1.valor = 7;
        Notas notas2 = new Notas();
        notas2.valor = 9;
        Notas notas3 = new Notas();
        notas3.valor = 6;

        notasDisciplinaAluno.addNotas(notas);
        notasDisciplinaAluno.addNotas(notas1);
        notasDisciplinaAluno.addNotas(notas2);
        notasDisciplinaAluno.addNotas(notas3);

        aluno.addNotasDiscilina(notasDisciplinaAluno);

        aluno.alunoAprovado("Lógica");
    }
}
