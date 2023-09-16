package com.pacoprojects.leitura.escrita.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pacoprojects.leitura.escrita.files.model.Pessoa;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LeituraArquivoXLSApachePoi {

	public static void main(String[] args) throws IOException {
		
		FileInputStream entradaArquivoXLS = new FileInputStream(
				new File("F:\\Java\\JavaProjects\\arquivoLeituraEscritaTxtExcel\\src\\arquivoLeituraEscritaTxtExcel\\arquivoExcelPoi.xls"));
		
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entradaArquivoXLS); /* USADO PARA LER E ESCREVER A PLANILHA  */
		
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); 	/* PEGA A PRIMEIRA PLANILHA DO NOSSO ARQUIVO EXCEL */
		
		
		
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		
		
		while (linhaIterator.hasNext()) {		/* PERCORRE ENQUANTO TIVER LINHAS NO ARQUIVO DO EXCEL */
			
			
			Row linha = linhaIterator.next();  /* DADOS DA PESSOA NA LINHA */
			
			Iterator<Cell> celulaIterator = linha.iterator();
			
			Pessoa p = new Pessoa();
			
			
			
			while(celulaIterator.hasNext()) {		/* PERCORRE ENQUANTO TIVER CELULAS NAS LINHAS*/
				
				
				Cell celula = celulaIterator.next();	/* ATRIBUTOS DE PESSOA EM CADA CELULA*/	
				
				switch (celula.getColumnIndex()) {
				case 0:
					p.setNome(celula.getStringCellValue());
					break;
				case 1:
					p.setEmail(celula.getStringCellValue());
					break;
				case 2:
					p.setIdade(Double.valueOf(celula.getNumericCellValue()).intValue());
					break;
					
					
				}
				
			} /* FIM DA CELULA  */
			
			
			list.add(p);
			
		}
		
		entradaArquivoXLS.close(); 	/* TERMINOU DE LER O ARQUIVO EXCEL */
		
		
		for (Pessoa pessoa : list) {		/* DEPOIS DE LER PODERIA GRAVAR NO BANCO DE DADOS A LISTA DAS PESSOAS*/
			System.out.println(pessoa);
		}
		
		
	}
	
}
