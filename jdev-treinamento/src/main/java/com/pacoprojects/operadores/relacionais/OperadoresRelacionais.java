package com.pacoprojects.operadores.relacionais;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int n1 = 11;
		int n2 = 10;

		if (n1 == n2) {	//se numero 1 for igual ao numero 2
			System.out.println("As notas sao iguais ");
		}else {
			System.out.println("As notas sao diferentes");
		}
		
		if (n1 != n2) {	//se numero 1 for diferente do numero 2
			System.out.println("As notas sao diferentes");
		}else {
			System.out.println("As notas sao iguais");
		}
		
		if (n1 < n2) {	//se numero 1 for menor que o numero 2
			System.out.println("A nota 1 eh menor que a nota 2");
		}else {
			System.out.println("A nota 1 eh maior que a nota 2");
		}
		
		if (n1 <= n2) { //se numero 1 for menor ou igual ao numero 2
			System.out.println("A nota 1 eh menor ou igual a nota 2");
		}else {
			System.out.println("A nota 1 eh maior ou igual a nota 2");
		}
		
	}
	
}
