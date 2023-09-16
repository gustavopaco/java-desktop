package com.pacoprojects.threads;

import javax.swing.JOptionPane;

public class ExemploThread {

	public static void main(String[] args){

		/* THREAD PROCESSANDO EM PARALELO DO ENVIO DE EMAIL*/
		new Thread() {
			public void run() { /* EXECUTA O QUE NOS QUEREMOS EM BACKGROUND */
				/* CODIGO DA ROTINA */

				/* CODIGO DA ROTINA QUE EU QUERO EXECUTAR EM PARALELO */
				for (int pos = 0; pos < 10; pos++) {

					/*
					 * QUERO EXECUTAR ESSE ENVIO COM UM TEMPO DE PARADA, OU COM UM TEMPO DETERMINADO
					 */
					System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
					try {
						Thread.sleep(1000);  /* DA UM TEMPO DE X MILISEGUNDOS ENTRE CADA EXECUCAO */
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				/* FIM DO CODIGO EM PARALELO */

			};

		}.start(); /* LIGA A THREAD QUE FICA PROCESANDO PARALELAMENTE EM BACKGROUND */
	
		
	//=================================================DIVISAO PARA THREAD 2=============================================================================	
		
		
		/* THREAD PROCESSANDO EM PARALELO DE ENVIO DE NOTA FISCAL */
		new Thread() {
			public void run() { /* EXECUTA O QUE NOS QUEREMOS EM BACKGROUND */
				/* CODIGO DA ROTINA */

				/* CODIGO DA ROTINA QUE EU QUERO EXECUTAR EM PARALELO */
				for (int pos = 0; pos < 10; pos++) {

					/*
					 * QUERO EXECUTAR ESSE ENVIO COM UM TEMPO DE PARADA, OU COM UM TEMPO DETERMINADO
					 */
					System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
					try {
						Thread.sleep(4000);  /* DA UM TEMPO DE X MILISEGUNDOS ENTRE CADA EXECUCAO */
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				/* FIM DO CODIGO EM PARALELO */

			};

		}.start(); /* LIGA A THREAD QUE FICA PROCESANDO PARALELAMENTE EM BACKGROUND */
		

		/* CODIGO DO SISTEMA DO USUARIO CONTINUA O FLUXO DE TRABALHO */
		System.out.println("CHEGOU AO FIM DO CODIGO DE TESTE DE THREAD");

		/*
		 * Fluxo do Sistema - Cadastro de venda, uma emissao de nota fiscal, algo do
		 * tipo
		 */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	}
}
