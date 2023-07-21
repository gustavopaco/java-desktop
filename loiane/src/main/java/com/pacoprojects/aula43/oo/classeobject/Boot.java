package com.pacoprojects.aula43.oo.classeobject;

import com.pacoprojects.aula43.oo.classeobject.model.Aluno;

public class Boot {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String[] curso = {"Sistemas de informacao"};
        double[] notas = {10, 9, 8, 9};
        aluno.setCursos(curso);
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "213212345f";
        String s2 = "213212345F";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();
        String[] curso2 = {"Sistemas de informacao"};
        double[] notas2 = {10, 9, 8, 9};
        aluno2.setCursos(curso);
        aluno2.setNotas(notas);

        System.out.println(aluno.equals(aluno2));
    }
}
