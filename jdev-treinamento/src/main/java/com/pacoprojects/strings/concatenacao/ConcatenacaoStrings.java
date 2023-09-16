package com.pacoprojects.strings.concatenacao;

public class ConcatenacaoStrings {

	public static void main(String[] args) {
		
		/* Concatenacao de Strings */
		String nome = "Gustavo Paco";
		String cpf = "107.775.376-49";
		String telefone = "(31)99303-9064";
		String endereco = "Rua Sargento Johnny da Silva, 200, Betania, "
				+ "Belo Horizonte";
		int idade = 31;
		
		String show = "Meu nome eh: " + nome +"\nCPF: " + cpf +
				"\nTelefone: " + telefone + "\nEndereco: " + endereco +
				"\nIdade: " + idade;
		
		System.out.println(show);
		
	}
}
