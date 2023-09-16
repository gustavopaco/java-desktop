package com.pacoprojects.operadores.repeticao;

public class OperadoresRepeticaoForContinue {
	
	public static void main(String[] args) {
		
		/* Ao Encontrar o valor na lista o CONTINUE ignora o bloco de codigo abaixo e volta na repeticao do FOR para processar mais dados*/
		for(int i = 0; i <= 10; i++) {
			if(i == 6 || i == 8 || i == 10) {
				System.out.println("Encontrei o numero: " + i);
				continue;
			}
			
			System.out.println("Processando laco de repeticao...");
		}
	}
}
