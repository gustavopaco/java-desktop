package com.pacoprojects.exercicios.lista.aula25a27.model;

public class Aluno {
    public String nome;
    public String sobrenome;
    public String cpf;
    public String numeroMatricula;
    public String curso;
    public NotasDisciplinaAluno[] notasDisciplinaAlunos = new NotasDisciplinaAluno[3];

    public void mostrarResultadosAluno() {
        double soma = 0;
        for (NotasDisciplinaAluno notasDisciplina : notasDisciplinaAlunos) {
                System.out.println("Disciplina " + notasDisciplina.disciplina.nome + ": ");
                System.out.print("Notas: ");
                for (Notas nota : notasDisciplina.notas) {
                    System.out.print(nota.valor + " | ");
                    soma += nota.valor;
                }
                System.out.println();
        }
    }

    public void obterMedia(double soma) {
        double media = soma / 4;
        if (media > 7) {
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado.");
        }
    }
}
