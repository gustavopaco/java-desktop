package com.pacoprojects.orientacao.objetos;

import com.pacoprojects.orientacao.objetos.model.Aluno;

public class ComparacaoObjetosEqualsHashCode {

	public static void main(String[] args) {
		
		/* EQUALS e HASHCODE (Diferenciar e Comparar Objetos) */
		// HashCode: Codigo Hash, codigo de identificacao de um objeto
		// Equals: Comparacao de objetos
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Gustavo");
		aluno1.setCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Gustavo");
		aluno2.setCpf("123");
		
		System.out.println("HashCode Aluno 1: " + aluno1.hashCode());
		System.out.println("HashCode Aluno 2: " + aluno2.hashCode());
		
		
		// PODE SE USAR COMPARACAO HASHCODE()
		// Se o HashCode for implementado na classe Aluno, quando for definir esse Objeto em algum tipo de colecao (Set, HashMap, etc), ele vai comparar o HashCode para definir a posicao do objeto na colecao
		if(aluno1.hashCode() == aluno2.hashCode()) {
			System.out.println("\nHashCode - Alunos sao iguais");
		}else {
			System.out.println("\nHashCode - Alunos sao diferentes");
		}
		
		// OU USAR COMPARACAO EQUALS, da no mesmo
		// O padrao do equals eh comparar o endereco de memoria dos objetos
		// Se Equals for implementado na classe Aluno, ele pode comparar os atributos de cada objeto para ver se sao iguais
		if(aluno1.equals(aluno2)) {
			System.out.println("\nEquals - Alunos sao iguais");
		}else {
			System.out.println("\nEquals - Alunos sao diferentes");
		}
		
	}
}
