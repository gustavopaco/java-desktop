package com.pacoprojects.operadores.repeticao;

public class OperadoresRepeticaoDoWhile {

	public static void main(String[] args) {
		
		int numero = 0;
		
		do { // Primeiro Executa e Depois Verifica
			System.out.println("O numero eh: " + numero);
			numero++;
			
		} while (numero <= 15);
	}
}
