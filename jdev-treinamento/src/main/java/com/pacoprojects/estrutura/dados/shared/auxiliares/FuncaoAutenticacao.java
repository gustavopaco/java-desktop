package com.pacoprojects.estrutura.dados.shared.auxiliares;

import com.pacoprojects.interfaces.PermitirAcesso;

/* REALMENTE E SOMENTE RECEBER ALGUEM QUE TEM O CONTRATO DA INTERFACE DE PermitirAcesso e CHAMAR O AUTENTICAR*/
public class FuncaoAutenticacao {

	private PermitirAcesso acesso;

	public FuncaoAutenticacao() {
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.acesso = acesso;
	}

	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		return acesso.autenticar();
	}
	
	public boolean autenticarLogin() {
		return acesso.autenticar();
	}

}
