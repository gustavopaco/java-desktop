package com.pacoprojects.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploSimpleDateFormat {

	public static void main(String[] args) throws ParseException {

		/* FORMATANDO DATAS. */
		
		Date date = new Date(); /* Instanciando Variavel do tipo Date */

		/*---------------------SIMPLE DATE FORMAT---------------------------------------- */
		
		
		/*Note: Setando Formato para impressao na TELA*/
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss"); 

		System.out.println("Data Atual no formato Padrao e String: " + simpleDateFormat.format(date));

		
		
		/*Note: Setando Formato para Banco de Dados*/
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

		System.out.println("Data em Formato para Banco de Dados: " + simpleDateFormat2.format(date));

		
		
		
		
		/* Note: STRING PARA OBJETO DATA */
		
		Date d = new Date();

		d = simpleDateFormat2.parse("1989-09-24 08:45.20");
		System.out.println("Imprimindo Objeto Date 1 : " + d);

		System.out.println("Imprimindo Objeto Date 2 : " + simpleDateFormat2.parse("1989-09-24 08:45.20"));

		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Imprimindo Objeto Date 10 : " + s.parse("1989/02/25"));

		
		
		
		
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println("Imprimindo Objeto Date 3 : " + simpleDateFormat3.parse("1989-09-24"));

		
		
		
		
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Imprimindo Objeto Date 4 : " + simpleDateFormat4.parse("24/09/1989"));

	}
}
