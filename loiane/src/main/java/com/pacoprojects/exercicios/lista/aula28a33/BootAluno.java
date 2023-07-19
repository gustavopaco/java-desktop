package com.pacoprojects.exercicios.lista.aula28a33;

import com.pacoprojects.exercicios.lista.aula28a33.model.*;

import java.util.Scanner;

public class BootAluno {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome(carregarDadoUsuario("Informe o nome do aluno:"));
        aluno.setCpf(carregarDadoUsuario("Informe o CPF do aluno:"));
        aluno.setMatricula(carregarDadoUsuario("Informe a matricula do aluno:"));
        aluno.setCurso(carregarDadoUsuario("Informe o curso do aluno:"));
        for (int i = 0; i < aluno.getAlunoDisciplinas().length; i++) {
            Disciplina disciplina = new Disciplina();
            disciplina.setNome(carregarDadoUsuario("Informe o nome da disciplina:"));

            Professor professor = new Professor();
            professor.setNome(carregarDadoUsuario("Informe o nome do professor:"));

            AlunoDisciplina alunoDisciplina = new AlunoDisciplina();
            for (int j = 0; j < alunoDisciplina.getNotas().length; j++) {
                Nota nota = new Nota();
                nota.setValor(carregarNotaUsuario("Informe o valor da nota " + (j + 1) + ":"));
                alunoDisciplina.associarNotasAluno(j, nota);
            }
            alunoDisciplina.associarAlunoDisciplina(aluno, disciplina);
            aluno.associarAlunoDisciplina(i, alunoDisciplina);
        }
        aluno.alunoAprovado();
    }

    private static String carregarDadoUsuario(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    private static double carregarNotaUsuario(String mensagem) {
        System.out.println(mensagem);
        double nota = scanner.nextDouble();
        scanner.nextLine();
        return nota;
    }
}
