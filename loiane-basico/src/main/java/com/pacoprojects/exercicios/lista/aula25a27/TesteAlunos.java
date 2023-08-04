package com.pacoprojects.exercicios.lista.aula25a27;

import com.pacoprojects.exercicios.lista.aula25a27.model.*;

import java.util.Scanner;

public class TesteAlunos {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        aluno.nome = scanner.nextLine();
        System.out.println("Informe o sobrenome do aluno:");
        aluno.sobrenome = scanner.nextLine();
        System.out.println("Informe o cpf do aluno:");
        aluno.cpf = scanner.nextLine();
        System.out.println("Informe o curso que o aluno está cursando:");
        aluno.curso = scanner.nextLine();

        for (int i = 0; i < aluno.notasDisciplinaAlunos.length; i++) {
            System.out.println("Informe o nome da disciplina: ");
            String nomeDisciplina = scanner.nextLine();

            System.out.println("Informe o nome do professor: ");
            String nomeProfessor = scanner.nextLine();

            Disciplina disciplina = new Disciplina(nomeDisciplina);
            Professor professor = new Professor(nomeProfessor);
            disciplina.associarAluno(aluno);
            disciplina.associarProfessor(professor);

            NotasDisciplinaAluno notasDisciplinaAluno = new NotasDisciplinaAluno();
            notasDisciplinaAluno.associarDisciplina(disciplina);
            notasDisciplinaAluno.associarAluno(aluno);

            int contadorNotas = 0;
            for (int j = 0; j < notasDisciplinaAluno.notas.length; j++) {
                System.out.println("Informe o valor da nota " + (contadorNotas + 1) + ": ");
                double nota = scanner.nextDouble();
                scanner.nextLine();
                Notas notas = new Notas(nota);
                notasDisciplinaAluno.notas[j] = notas;
                contadorNotas++;
            }
            aluno.notasDisciplinaAlunos[i] = notasDisciplinaAluno;
        }

        aluno.mostrarResultadosAluno();
    }
}
