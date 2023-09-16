package com.pacoprojects.inicializacao.variaveis;

public class InicializacaoVariaveis {
	private static double total = 0; // double é um tipo primitivo de dado que armazena números decimais.
	private static int produtos = 10; // int é um tipo primtivo de dado que armazena números inteiros.
	private static int quantidade = 15; // int é um tipo primtivo de dado que armazena números inteiros.
	private static String nome = "Gustavo Paco"; // String é uma classe que armazena uma cadeia de caracteres.
	private static int idade = 31; // int é um tipo primtivo de dado que armazena números inteiros.
	private static char tipoPessoa = 'F'; // char é um tipo primitivo de dado que armazena um único caractere.
	
	public static void main(String[] args) {
		total = produtos * quantidade;
		System.out.println(total);
		
		total = (produtos * quantidade) * 5;
		System.out.println(total);


		if(idade == 31) {
			System.out.println(nome);
		}
		
		idade = 33;
		
		if(idade == 33) {
			nome += " Ramos";
			System.out.println(nome);
		}

		if(tipoPessoa == 'F') {
			System.out.println("Pessoa Fisica");
		}else {
			System.out.println("Pessoa Juridica");
		}
	}
	
}
