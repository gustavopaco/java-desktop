package com.pacoprojects.operadores.logicos.switchcase;

public class OperadoresLogicosSwitchCase {

	public static void main(String[] args) {
		
		int dia = 3;
		
		// SWITCH CASE: OPERACOES EXATAS
		switch (dia) {
		case 1:
			System.out.println("Domingo ");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terca");
			break;
		default:
			System.out.println("Outro dia: ");
			break;
		}
	}
}
