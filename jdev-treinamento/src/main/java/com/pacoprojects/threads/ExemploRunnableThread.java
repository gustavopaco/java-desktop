package com.pacoprojects.threads;

import javax.swing.JOptionPane;

public class ExemploRunnableThread {

	public static void main(String[] args){

		/* THREAD PROCESSANDO EM PARALELO DO ENVIO DE EMAIL*/
		Thread threadEmail = new Thread(thread1);   	/* INSTANCIANDO OBJETO THREAD */
		threadEmail.start();	 /* STARTANDO THREAD */
		
	//=================================================DIVISAO PARA THREAD 2=============================================================================	
		
		
		/* THREAD PROCESSANDO EM PARALELO DE ENVIO DE NOTA FISCAL */
		Thread threadNotafiscal = new Thread(thread2); 	/* INSTANCIANDO OBJETO THREAD */
		threadNotafiscal.start();	 /* STARTANDO THREAD */

		/* CODIGO DO SISTEMA DO USUARIO CONTINUA O FLUXO DE TRABALHO */
		System.out.println("CHEGOU AO FIM DO CODIGO DE TESTE DE THREAD");

		/*
		 * Fluxo do Sistema - Cadastro de venda, uma emissao de nota fiscal, algo do
		 * tipo
		 */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	}
	
	
	
	/* INSTANCIANDO OBJETO DO TIPO RUNNABLE QUE SERA UTILIZADO COMO PARAMETRO NA CRIACAO DE UM OBJETO THREAD*/
	private static Runnable thread1 = new Runnable() { 
		
		@Override
		public void run() {
			
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
			
		}
	};
	
	/* INSTANCIANDO OBJETO DO TIPO RUNNABLE QUE SERA UTILIZADO COMO PARAMETRO NA CRIACAO DE UM OBJETO THREAD*/
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
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
		}
	};
}
