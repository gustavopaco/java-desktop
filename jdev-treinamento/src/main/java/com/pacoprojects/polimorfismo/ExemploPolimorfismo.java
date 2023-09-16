package com.pacoprojects.polimorfismo;

import com.pacoprojects.heranca.Aluno;
import com.pacoprojects.heranca.Diretor;
import com.pacoprojects.heranca.Pessoa;
import com.pacoprojects.heranca.Secretario;

public class ExemploPolimorfismo {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo - Web Developer");
		aluno.setCurso("Sistemas de Informacao");
		aluno.setIdade(30);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Roberio e seus teclados");
		diretor.setRg("8432123132");
		diretor.setTitulacao("Doutorado");
		diretor.setIdade(50);
		
		Secretario secretario = new  Secretario();
		secretario.setNome("Pele Marreta");
		secretario.setIdade(31);
		secretario.setExperiencia("10 anos de mercado");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		
		System.out.println("Salario Aluno : " + aluno.salario());
		System.out.println("Salario Diretor: " + diretor.salario());
		System.out.println("Salario Secretario: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		Aluno aluno2 = new Aluno();
		Diretor dir = new Diretor();
		Secretario sec = new Secretario();
		Pessoa pessoa = new Aluno();
		Pessoa pessoa2 = new Diretor();
		Pessoa pessoa3 = new Secretario();
		
		dir.setTitulacao("Mestrado");
		dir.setNome("Olivia Palito");
		
		pessoa3.setNome("Yanna");
		pessoa3.setNomePai("Joaquim");
		
		pessoa.setNome("Jose");
		pessoa.setCpf("10777537648");
		System.out.println(pessoa);
		
		aluno2 = (Aluno)pessoa;
		aluno2.setMatricula("71101462");
		aluno2.setNomeEscola("COTEMIG");
		System.out.println(aluno2);
		
		
		pessoa2.setNome("Jefferson");
		pessoa2.setIdade(80);
		pessoa = pessoa2;
		System.out.println(pessoa);
		
		System.out.println("---------------------------------------------------");
		pessoa = secretario;
		pessoa2 = aluno2;
//		pessoa3 = dir;
		sec = (Secretario)pessoa3;
		System.out.println(pessoa + "\n" + pessoa2 + "\n" + pessoa3 + "\n" + sec);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa eh demais = " + pessoa.getNome() + "  e o salario eh de: " + pessoa.salario());
	}
}
