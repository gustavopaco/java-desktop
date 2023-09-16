package com.pacoprojects.estrutura.dados.vetores;

public class Vetor {

	/* Usado para executar codigo. */
	public static void main(String[] args) {
		
		/* Array pode ser de todos os tipos de dados e objetos inclusive*/
		
		/* Array sempre deve ter a quantidade de posicoes definidas*/
		double[] notas = new double[4];
		double resultado = 0;

		/* Atribuir valor nas posicoes do Array. */
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;
		
		/* Recuperar valor das posicoes do Array. */
		System.out.println("Nota 1: " + notas[0]);
		System.out.println("Nota 2: " + notas[1]);
		System.out.println("Nota 3: " + notas[2]);
		System.out.println("Nota 4: " + notas[3]);

		/* Percorrer Array. */
		for(int i = 0 ; i < notas.length ; i++) {
			resultado += notas[i];
			System.out.println("Nota " + (i+1) + " = " + notas[i]);
		}
		
		System.out.println("Resultado: " + resultado);
	}
}
