package com.pacoprojects.leitura.escrita.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pacoprojects.leitura.escrita.files.model.Pessoa;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class EscritaArquivoXLSApachePoi {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("F:\\Java\\JavaProjects\\arquivoLeituraEscritaTxtExcel\\src\\arquivoLeituraEscritaTxtExcel\\arquivoExcelPoi.xls");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
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
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Roberto");
		pessoa4.setEmail("roberto@gmail.com");
		pessoa4.setIdade(22);
		
		/* PODE VIR DO BANCO DE DADOS */
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		list.add(pessoa1);
		list.add(pessoa2);
		list.add(pessoa3);
		list.add(pessoa4);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();		/* USADO PARA ESCREVER A PLANILHA */

		HSSFSheet planilha = hssfWorkbook.createSheet("Planilhas de pessoas Jdev Treinamento"); 	/* CRIAR A PLANILHA */
		
		
		int contadorLinhas = 0;
		
		for (Pessoa p : list) {
			
			Row linha = planilha.createRow(contadorLinhas++); /* CRIANDO A LINHA NA PLANILHA */
			
			int celula = 0;
			
			Cell cellNome = linha.createCell(celula++);		/* CELULA 1 */
			cellNome.setCellValue(p.getNome());
			
			Cell cellEmail = linha.createCell(celula++);	/* CELULA 2 */
			cellEmail.setCellValue(p.getEmail());
			
			Cell cellIdade = linha.createCell(celula++);	/* CELULA 3 */
			cellIdade.setCellValue(p.getIdade());
		}	/* TERMINOU DE MONTAR A TABELA DO EXCEL */
		
		FileOutputStream saida = new FileOutputStream(arquivo);
		hssfWorkbook.write(saida);	/* ESCREVE A PLANILHA EM ARQUIVO */
		
		saida.flush(); /* PERSISTINDO DADOS NA PLANILHA	*/
		saida.close(); 
		
		System.out.println("Planilha foi Criada.");
	}
	
}
