package com.pacoprojects.strings.substring;

public class ExemploSubstring {
	
	public static void main(String[] args) {
		String text = "Gustavo Dutra Ramos Paco";
		String nome1 = "Gustavo";
		String nome2 = "Vagaba";
		int resultado = 0;

		/* Metodo compareTo retorna 0 se as strings forem iguais, -1 se a primeira for menor que a segunda e 1 se a primeira for maior que a segunda */
		resultado = nome1.compareTo(nome2);
		System.out.println(resultado);

		/* Metodo indexOf retorna a posicao do caracter na string */
		/* Metodo substring retorna a string a partir da posicao informada (inicio, fim) ou (inicio) */
		System.out.println("Imprimindo Aqui: " + text.substring(text.indexOf(" ")+1));
		System.out.println(text.substring(0,text.indexOf(" ")));
		System.out.println(text.substring(text.indexOf(" ")+1));
	}
}
