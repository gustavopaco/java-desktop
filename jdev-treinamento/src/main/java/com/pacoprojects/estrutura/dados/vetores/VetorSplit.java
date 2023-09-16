package com.pacoprojects.estrutura.dados.vetores;

import java.util.Arrays;
import java.util.List;

public class VetorSplit {

	public static void main(String[] args) {

		String text = "Gustavo, curso Java, 80, 70, 90, 89, Roberio, curso Teclados, 85, 95, 90, 98";
		String nome = "";
		String curso = "";
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double nota4 = 0.0;
		int colunasMatriz = 6;
		String imprimeLinha = "";
		String imprimeColuna = "";

		System.out.println("Imprimindo Split Aqui: \n" + text.split(",")[0]);
		
		/* STRING.SPLIT VAI USAR O PADRAO ENTRE PARENTESES PARA DIVIDIR A STRING E SALVAR EM UM VETOR*/
		String[] arrayString = text.split(", ");	
		
		
		/* CRIANDO MATRIZ ONDE QTDE DE LINHAS VAI RECEBER (TAMANHO VETOR STRING.SPLIT / QUANTIDADE DE COLUNAS) VINDO DO USUARIO = 6 
		 * | E COLUNAS VINDA DO USUARIO*/
		String[][] matriz = new String[(arrayString.length / colunasMatriz)][colunasMatriz];
		int cont = 0;

		/* DIVIDINDO DADOS DE ARRAY EM MATRIZ DE 6 COLUNAS COM DADOS */
		for (int pos = 0; pos < matriz.length; pos++) {
			imprimeLinha += "Dados: " + pos;
			imprimeColuna = "";
			for (int k = 0; k < matriz[pos].length; k++) {
				matriz[pos][k] = arrayString[cont];
				cont++;
				imprimeColuna += matriz[pos][k] + "  ";
			}
			imprimeLinha += "  " + imprimeColuna + "\n";
		}
		System.out.println(imprimeLinha);
		
		
		
		
		/* CONVERTENDO UM ARRAY PARA LISTA*/
		List<String> list = Arrays.asList(arrayString);
		for (String lista : list) {
			System.out.println(lista);
		}
		
		
		/* CONVERTENDO UMA LISTA PARA ARRAY */
		String[] conversaoArray = list.toArray(new String[6]);
//		System.out.println(conversaoArray);
		for(int j = 0 ; j < conversaoArray.length ; j++) {
			System.out.println(conversaoArray[j]);
		}
		
	}
}
