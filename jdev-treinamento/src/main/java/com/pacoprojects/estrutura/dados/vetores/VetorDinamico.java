package com.pacoprojects.estrutura.dados.vetores;

import javax.swing.JOptionPane;

public class VetorDinamico {

	/* Usado para executar codigo. */
	public static void main(String[] args) {
		
		/* Posições do vetor: 0,1,2,3 */
		double[] valores = {9.5, 5.0, 7.6, 9.6};
		String[] valores2 = new String[4];
		String[] valores3 = {"Gustavo","Java","90","gustavopaco@gmail.com"};
		int[] inteiros = new int[10];
		float[] floats = new float[10];

		/* Preenchendo o vetor */
		valores2[0] = "Gustavo";
		valores2[1] = "Java";
		valores2[2] = "90";
		valores2[3] = "gustavopaco@gmail.com";

		/* Imprimindo valores de cada posição do vetor */
		for(int i = 0; i < valores3.length ; i++) {
			System.out.println("Valor na posicao" + i + " eh: " + valores3[i]);
		}

		/* Array pode ser de todos os tipos de dados e objetos tambem*/
		/* Array sempre deve ter a quantidade de posições definidas*/

		double resultado = 0;
		int tamanhoArray = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas."));
		/* Criando um array de double com o tamanho informado pelo usuário, Dinamicamente */
		double[] notas = new double[tamanhoArray];
		
		/* Preenchendo o array com as notas informadas pelo usuario */
		for(int i = 0 ; i < notas.length ; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota " + (i+1)));
			notas[i] = nota;
			resultado += notas[i];
			System.out.println("Nota " + (i+1) + " = " + notas[i]);
		}
		
		System.out.println("Resultado: " + resultado);
	}
}
