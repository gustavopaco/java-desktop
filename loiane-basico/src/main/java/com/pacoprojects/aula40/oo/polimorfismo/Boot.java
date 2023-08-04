package com.pacoprojects.aula40.oo.polimorfismo;

import com.pacoprojects.aula40.oo.polimorfismo.model.Aluno;
import com.pacoprojects.aula40.oo.polimorfismo.model.PessoaFisica;
import com.pacoprojects.aula40.oo.polimorfismo.model.Professor;

public class Boot {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaFisica aluno = new Aluno();
        PessoaFisica professor = new Professor();

        pessoaFisica.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

        System.out.println(pessoaFisica.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
