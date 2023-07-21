package com.pacoprojects.aula41.oo.polimorfismo.abstrata;

import com.pacoprojects.aula41.oo.polimorfismo.abstrata.model.Aluno;
import com.pacoprojects.aula41.oo.polimorfismo.abstrata.model.PessoaFisica;
import com.pacoprojects.aula41.oo.polimorfismo.abstrata.model.Professor;

public class Boot {
    public static void main(String[] args) {
        //PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaFisica aluno = new Aluno();
        PessoaFisica professor = new Professor();

        //pessoaFisica.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

        //System.out.println(pessoaFisica.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        System.out.println();
        System.out.println("------------------");
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
