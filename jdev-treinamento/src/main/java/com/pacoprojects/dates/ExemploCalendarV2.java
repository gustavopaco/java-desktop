package com.pacoprojects.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExemploCalendarV2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();		/* PEGA A DATA ATUAL */
		
		/* SIMULAR DATA VINDO DO BANCO DE DADOS */
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));	 /* DEFININDO UMA DATA QUALQUER. */
		
		
		
		calendar.add(Calendar.DAY_OF_MONTH, 2); 	/* SOMANDO DATA DE "HOJE" MAIS 2 DIAS */
		System.out.println("Somando Dias do mes: " + (new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())));
		
		
		
		calendar.add(Calendar.MONTH, 5); 	/* SOMANDO MES DE "HOJE" MAIS 5 MESES */
		System.out.println("Somando Meses: " + (new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())));
		
		
		
		calendar.add(Calendar.YEAR, 2); 	/* SOMANDO ANO DE "HOJE" MAIS 2 ANOS */
		System.out.println("Somando Ano: " + (new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())));
	}
}
