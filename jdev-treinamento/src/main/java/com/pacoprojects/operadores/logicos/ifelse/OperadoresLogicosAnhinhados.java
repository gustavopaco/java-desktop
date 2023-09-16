package com.pacoprojects.operadores.logicos.ifelse;

public class OperadoresLogicosAnhinhados {

	public static void main(String[] args) {
		
		int n1 = 40;
		int n2 = 40;
		int n3 = 45;
		int n4 = 40;
		int media = 0;
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		//Operacoes Logicas Aninhadas: Operacoes dentro de operacoes
		if(media >= 50) {
			if(media >= 70) {
				if(media >= 90) {
					System.out.println("Aluno esta de Parabens: " + media);
				}else {
					System.out.println("Aluno esta aprovado: " + media);
				}
			}else {
				System.out.println("Aluno esta em recuperacao: " + media);
			}
		}else {
			System.out.println("Aluno reprovado: " + media);
		}
	}
}
