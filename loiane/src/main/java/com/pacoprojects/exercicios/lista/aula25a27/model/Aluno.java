package com.pacoprojects.exercicios.lista.aula25a27.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public String nome;
    public String sobrenome;
    public String cpf;
    public String numeroMatricula;
    public String curso;
    public List<NotasDisciplinaAluno> notasDisciplinaAlunos = new ArrayList<>();

    public void addNotasDiscilina(NotasDisciplinaAluno notasAluno) {
        this.notasDisciplinaAlunos.add(notasAluno);
    }

    public void alunoAprovado(String nomeDisciplina) {
        double media = 0;
        int quantidadeNotas = 0;
        for (NotasDisciplinaAluno notasDisciplina : notasDisciplinaAlunos) {
            System.out.println("Disciplina " + notasDisciplina.disciplina.nome + ": ");
            System.out.print("Notas: ");
            if (notasDisciplina.disciplina.nome.equals(nomeDisciplina)) {
                for (Notas nota : notasDisciplina.notas) {
                    System.out.print(nota.valor + " | ");
                    media += nota.valor;
                    quantidadeNotas++;
                }
                System.out.println();
            }
        }
        media /= quantidadeNotas;
        if (media > 7) {
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado.");
        }
    }
}
