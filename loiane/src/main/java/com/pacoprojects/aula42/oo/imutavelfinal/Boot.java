package com.pacoprojects.aula42.oo.imutavelfinal;

import com.pacoprojects.aula42.oo.imutavelfinal.constants.Constantes;
import com.pacoprojects.aula42.oo.imutavelfinal.model.Aluno;
import com.pacoprojects.aula42.oo.imutavelfinal.model.PessoaFisica;
import com.pacoprojects.aula42.oo.imutavelfinal.model.Professor;

public class Boot {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        //PessoaFisica aluno = new Aluno();
        //PessoaFisica professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        System.out.println(Constantes.URL_PORTFOLIO);
    }
}
