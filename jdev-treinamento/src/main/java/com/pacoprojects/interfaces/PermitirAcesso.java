package com.pacoprojects.interfaces;

 /* ESSA INTERFACE SERA NOSSO CONTRATO DE AUTENTICACAO */
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha); /* APENAS DECLARACAO DO METODO NA INTERFACE*/

	public boolean autenticar();  /* APENAS DECLARACAO DO METODO NA INTERFACE*/
}
