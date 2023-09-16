package com.pacoprojects.operadores.logicos.ifelse;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean n1 = false;
		boolean n2 = false;
		boolean n3 = true;
		
		if(n1 && n2 || n3) {
			System.out.println("Entrou na condicao");
		}else {
			System.out.println("Nao entrou na condicao");
		}

		int mediaAluno = 69;
		String nome = "Gustav";

		if (mediaAluno >= 70 && nome.equalsIgnoreCase("gustavo")) {
			System.out.println("Parabens voce esta aprovado. ");
		} else if (mediaAluno < 70){
			System.out.println("Voce esta reprovado. ");
		}else {
			System.out.println("Aluno invalido");
		}
	}
}
