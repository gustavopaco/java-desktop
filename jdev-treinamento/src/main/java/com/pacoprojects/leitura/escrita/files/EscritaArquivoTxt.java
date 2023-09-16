package com.pacoprojects.leitura.escrita.files;

import com.pacoprojects.leitura.escrita.files.model.Pessoa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscritaArquivoTxt {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Gustavo");
		pessoa1.setEmail("gustavopaco@gmail.com");
		pessoa1.setIdade(31);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Joao");
		pessoa2.setEmail("joao@gmail.com");
		pessoa2.setIdade(45);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Maria");
		pessoa3.setEmail("maria@gmail.com");
		pessoa3.setIdade(70);
		
		/* PODE VIR DO BANCO DE DADOS */
		List<Pessoa> list = new ArrayList<Pessoa>();
		list.add(pessoa1);
		list.add(pessoa2);
		list.add(pessoa3);
		
		
		/* OBJETO DE ARQUIVO */
		File arquivo = new File("F:\\Java\\JavaProjects\\arquivoLeituraEscritaTxtExcel\\src\\arquivoLeituraEscritaTxtExcel\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		/* OBJETO QUE ESCREVE NO ARQUIVO */
		FileWriter escreverArquivo = new FileWriter(arquivo);
		
		/*WRITE ESCREVE LINHA NO ARQUIVO*/
//		escreverArquivo.write("Meu texto do arquivo");
//		escreverArquivo.write("\nMinha Segunda Linha");
		
		
//		for(int i = 1 ; i <= 10 ; i++) {
//			escreverArquivo.write("\nTexto da minha Linha - " + i );
//		}
		
		
		for(Pessoa pessoa : list) {
			
			/* PADRAO UTILIZADO PARA SALVAR EM ARQUIVOS */
			escreverArquivo.append(pessoa.getNome() + ";" + pessoa.getEmail() + ";" + pessoa.getIdade() + "\n");

		}
		
		
		
		/* FLUSH PERSISTE(SALVA) DADOS NO ARQUIVO*/
		escreverArquivo.flush();
		
		/* FECHA O ARQUIVO */
		escreverArquivo.close();
		
	}
}
