package com.pacoprojects.leitura.escrita.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class PesquisandoEditandoCelulaXLSApachePoi {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"F:\\Java\\JavaProjects\\arquivoLeituraEscritaTxtExcel\\src\\arquivoLeituraEscritaTxtExcel\\arquivoExcelPoi.xls");

		FileInputStream entrada = new FileInputStream(file);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /* PREPARA A ENTRADA DO ARQUIVO XLS */

		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);	/* PEGA A PRIMEIRA PLANILHA DO EXCEL 0. */

		int confirmEditarNome = JOptionPane.showConfirmDialog(null, "Gostaria de Editar algum nome?");
		if(confirmEditarNome == 0) {
			String nome = JOptionPane.showInputDialog("Informe o nome da pessoa que gostaria de alterar. ");
			editarNome(planilha,nome);
		}

		entrada.close();

		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);

		saida.flush();
		saida.close();
		hssfWorkbook.close();
		System.out.println("Planilha Atualizada");

	}

	private static void editarNome(HSSFSheet planilha,String nome) throws IOException {

		Iterator<Row> linhasIterator = planilha.iterator();
		
		boolean check_pessoa = false;

		while (linhasIterator.hasNext()) { /* ENQUANTO TIVER LINHA */

			Row linha = linhasIterator.next(); /* DADOS DA PESSOA NA LINHA */

			Iterator<Cell> celulaIterator = linha.iterator();

			while (celulaIterator.hasNext()) {

				Cell celula = celulaIterator.next();

				if (celula.getCellType().equals(CellType.STRING)) { /* VERIFICA SE CELULA EH DO TIPO STRING */
					System.out.println("Celula String : " + celula.getStringCellValue());

					if (celula.getStringCellValue()
							.equalsIgnoreCase(nome)) { /* VERIFICA SE NOME DIGITADO EXISTE NA TABELA */
						check_pessoa = true;
						String novo_nome = JOptionPane.showInputDialog("Informe o novo nome: ");
						celula.setCellValue(novo_nome); /* SUBISTITUI PARA NOVO NOME */
						JOptionPane.showMessageDialog(null, "Nome Atualizado com Sucesso!");
					}

				}

			}

		}
		if (check_pessoa == false) {
			JOptionPane.showMessageDialog(null, "Pessoa nao encontrada");
		}
	}

}
