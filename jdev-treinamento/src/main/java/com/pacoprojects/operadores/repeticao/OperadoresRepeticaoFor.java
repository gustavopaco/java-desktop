package com.pacoprojects.operadores.repeticao;

public class OperadoresRepeticaoFor {

	public static void main(String[] args) {
		
		int numero = 10;
		
//		Imprimindo em ordem crescente
		for(int i = 0; i <= numero; i++) {
			System.out.println("O valor eh: " + i);
		}
		
//		Imprimindo em ordem decrescente
		for(int i = numero; i >= 0; i-- ) {
			System.out.println("O valor eh: " + i);
		}
	}
}
