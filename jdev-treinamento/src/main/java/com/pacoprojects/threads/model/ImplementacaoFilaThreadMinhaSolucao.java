package com.pacoprojects.threads.model;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThreadMinhaSolucao extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		

		while(true) {
			
			synchronized (pilha_fila) {		/* BLOQUEAR O ACESSO A ESTA LISTA POR OUTROS PROCESSOS*/
				
				while (!pilha_fila.isEmpty()) { /* ENQUANTO TIVER OBJETOS NA LISTA IRA PROCESSAR */

					ObjetoFilaThread p = pilha_fila.element();

					/*
					 * PROCESSAR 10 MIL NOTAS FISCAIS
					 * GERAR UMA LISTA ENORME DE PDFs GERAR UM ENVIO EM MASSA DE EMAIL
					 */
					
					System.out.println("-------------------------------------------");
					System.out.println(p.getNome());
					System.out.println(p.getEmail());
					System.out.println("-------------------------------------------");

					pilha_fila.remove();

					try {
						Thread.sleep(1000); /* DAR UM TEMPO PARA DESCARGA DE MEMORIA */
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(1000); /*
									 * PROCESSOU TODA A LISTA DA UM TEMPO PARA LIMPEZA DE MEMORIA, PARA BUSCAR OUTRO
									 * OBJETO QUANDO FOR ADICIONADO
									 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
