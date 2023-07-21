package com.pacoprojects.exercicios.lista.aula36;

import com.pacoprojects.exercicios.lista.aula36.model.*;

import java.util.Scanner;

public class BootCurso {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setNome(input("Informe o nome do curso:"));
        curso.setHorario(input("Informe o Horário do curso:"));

        Professor professor = new Professor();
        professor.setNome(input("Informe o nome do professor:"));
        professor.setDepartamento(input("Informe o departamento do professor"));
        professor.setEmail(input("Informe o e-mail do professor:"));

        curso.associarProfessor(professor);
        
        for (int i = 0; i < 5; i++) {
            Aluno aluno = new Aluno();
            aluno.setMatricula(input("Matrícula do aluno:"));
            aluno.setNome(input("Nome:"));

            NotasAlunoCurso notasAlunoCurso = new NotasAlunoCurso();
            notasAlunoCurso.setAluno(aluno);
            notasAlunoCurso.setCurso(curso);

            for (int j = 0; j < 4; j++) {
                Nota nota = new Nota();
                nota.setValor(inputNotas("Nota " + (j + 1) + ":"));
                notasAlunoCurso.adicionarNota(nota);
            }

            curso.getAlunos().add(notasAlunoCurso);
        }
        imprimirRelatorioDoCurso(curso);
    }

    private static String input(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    private static double inputNotas(String mensagem) {
        System.out.println(mensagem);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    private static void imprimirRelatorioDoCurso(Curso curso) {
        curso.imprimirDadosCurso();
        curso.imprimirDadosProfessor();
        curso.imprimirMediaAluno();
        curso.imprimirMediaTurma();
    }
}
