package com.pacoprojects.exercicios.primeiro.programa;

public class Variaveis {
	
	/* Variavel Global, acessivel a todos. */
	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {
		
		/* Variavel Local porque pertence Somente a esse Metodo. */
		int maiorIdade = 18;
		int idosoIdade = 60;
		int adolescenteIdade = 16;
		int criancaIdade = 7;
		String cpf = "107.775.376-49";
		
		System.out.println("Maior idade eh: " + maiorIdade);
		System.out.println("Idoso idade eh: " + idosoIdade);
		System.out.println("Adolescente idade eh: " + adolescenteIdade);
		System.out.println("Crianca idade eh: " + criancaIdade);
		System.out.println("CPF eh: " + cpf);
		
		
		metodo2();

	}
	
	public static void metodo2() {
		/*int mediaAno = 50;*/
		System.out.println("Valor da variavel Global eh: " + maiorIdadeGlobal);
	}
}
