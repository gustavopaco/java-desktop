package com.pacoprojects.estrutura.dados.matriz;

public class Matriz {
	
	/* Executar o codigo Java */
	public static void main(String[] args) {
		
		int[][] notas= new int[2][3];
		String imprimeBimestre = "";
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
		
//		System.out.println(notas);
		
		/* PERCORRE AS LINHAS  */
		for(int i = 0 ; i < notas.length ; i++) {
			
			String imprimeNotas = "";
			imprimeBimestre += "Bimestre: " + i;
			
			/* PERCORRE AS COLUNAS  */
			for(int pos = 0 ; pos < notas[i].length; pos ++) {
				
				imprimeNotas += notas[i][pos] + "  ";
			}
			
			imprimeBimestre += " = " + imprimeNotas + "\n";
		}
	
		System.out.println(imprimeBimestre);
	}

}
