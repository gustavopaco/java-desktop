package com.pacoprojects.leitura.escrita.files;

import com.pacoprojects.leitura.escrita.files.model.Pessoa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraArquivoCSV {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		/* CLASSE QUE RECEBE O ARQUIVO*/
		FileInputStream entradaArquivo = new FileInputStream(
				new File("F:\\Java\\JavaProjects\\arquivoLeituraEscritaTxtExcel\\src\\arquivoLeituraEscritaTxtExcel\\arquivo.csv"));
		
		
		/* CLASSE QUE PERCORRE ARQUIVO - DADOS, LINHAS, ETC */
		Scanner percorreArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		
		/* ENQUANTO ARQUIVO TEM DADOS PARA PROCESSAR */
		while(percorreArquivo.hasNext()) {
			
			/* VARIAVEL RECEBENDO LINHA POR LINHA DO ARQUIVO */
			String linha = percorreArquivo.nextLine();
			
			/* SE LINHA NAO FOR VAZIA OU NULA  */
			if(linha != null && !linha.isEmpty()) {
				
				
				/* DIVIDE OS DADOS EM ARRAY STRING PELO ";" */
				String[] arrayDados = linha.split(";");
				
				
				/* SALVA DADOS NO OBJETO PESSOA */
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(arrayDados[0]);
				pessoa.setEmail(arrayDados[1]);
				pessoa.setIdade(Integer.parseInt(arrayDados[2]));
				
				
				/* E ADICIONA NA LISTA DE PESSOAS */
				list.add(pessoa);
			}
			
			
		}
		
		
		/* GRAVAR NO BANCO DE DADOS, ENVIAR EMAIL, GERAR BOLETO, FAZER QUALQUER COISA  */
		for(Pessoa p : list) { 	 
			System.out.println(p.getNome() + ", " + p.getEmail() + ", " + p.getIdade());
		}
		
		
		percorreArquivo.close();
	}
	
}
