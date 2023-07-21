package com.pacoprojects.aula37.oo.heranca;

import com.pacoprojects.aula37.oo.heranca.model.Aluno;
import com.pacoprojects.aula37.oo.heranca.model.PessoaFisica;
import com.pacoprojects.aula37.oo.heranca.model.Professor;

public class BootHeranca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Maria");

        PessoaFisica alunoPessoa = new Aluno();
        PessoaFisica professorPessoa = new Professor();
    }
}
