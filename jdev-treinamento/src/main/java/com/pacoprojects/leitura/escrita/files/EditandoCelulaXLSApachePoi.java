package com.pacoprojects.leitura.escrita.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class EditandoCelulaXLSApachePoi {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Development\\Back-End\\Java\\JavaProjects\\JavaDesktop\\arquivoLeituraEscritaTxtExcel\\src\\arquivoLeituraEscritaTxtExcel\\arquivoExcelPoi.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);	/* PREPARA A ENTRADA DO ARQUIVO XLS*/
		
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		
		Iterator<Row> linhasIterator = planilha.iterator();
		
		
		while(linhasIterator.hasNext()) {		/* ENQUANTO TIVER LINHA */
			
			Row linha = linhasIterator.next();		/* DADOS DA PESSOA NA LINHA */
			
			String valorcelula = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorcelula + " Valor Alterado");
			
			
		}
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		
		saida.flush();
		saida.close();
		
		
		System.out.println("Planilha Atualizada");
		
	}
}
