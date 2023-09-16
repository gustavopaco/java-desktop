package com.pacoprojects.operadores.repeticao;

public class OperadoresRepeticaoForBreak {

	public static void main(String[] args) {

		for (int i = 10; i >= 0; i--) {
//			System.out.println("O valor eh: " + i);
			if (i == 5) {
				System.out.println("Encontrei o numero: " + i);
				break;
			}
		}
	}
}
