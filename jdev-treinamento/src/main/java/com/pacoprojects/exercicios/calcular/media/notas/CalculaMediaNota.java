package com.pacoprojects.exercicios.calcular.media.notas;

public class CalculaMediaNota {
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		int n3 = 10;
		int n4 = 80;
		int media = 0;

		media = (n1 + n2 + n3 + n4) / 4;
		
		if(media >= 70) {
			System.out.println("Aluno Aprovado: " + media);
		}else if(media >= 40 && media <= 69) {
			System.out.println("Aluno em Recuperacao:" + media);
		}else {
			System.out.println("Aluno Reprovado: " + media);
		}
	}
}
