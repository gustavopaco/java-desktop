package com.pacoprojects.exception;

public class ExcecaoProcessarNota extends Exception{
	
	public ExcecaoProcessarNota(String erro) {
		super("Vixe um erro no processamento do arquivo ao processar notas do aluno " + erro);
	}

}
