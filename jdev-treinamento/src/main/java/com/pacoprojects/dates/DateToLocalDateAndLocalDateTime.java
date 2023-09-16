package com.pacoprojects.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateAndLocalDateTime {

	public static void main(String[] args) throws ParseException {
		
		
		
		/* CONVERTENDO VARIAVEL DATE PARA LOCALDATE OU LOCALDATETIME (JAVA VERSAO 9) */
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse("24/09/1989");
//		System.out.println(data);
		
		LocalDate ld = LocalDate.ofInstant(data.toInstant(), ZoneId.systemDefault());
		LocalDate ld2 = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDateTime ldt = LocalDateTime.ofInstant(data.toInstant(), ZoneId.systemDefault());
		LocalDateTime ldt2 = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
//		System.out.println(ld2);
		/*-----------------------------------------------------------------------------------------------------*/
		/*-----------------------------------------------------------------------------------------------------*/
		
		
		
//		LocalDate dataAntiga = LocalDate.of(2020, 02, 07);
//		
//		LocalDate dataNova = LocalDate.of(2021, 07, 04);
		
		LocalDate dataAntiga = LocalDate.parse("2018-10-05");
		
		LocalDate dataNova = LocalDate.parse("2021-04-07");
		
		System.out.println("Data antiga eh posterior que data nova? " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga eh anterior que data nova? " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas sao iguais? " + dataAntiga.isEqual(dataNova));
		
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias de Diferenca entra Data Antiga e Nova? " + periodo.getDays());
		
		System.out.println("Quantos meses de Diferenca entra Data Antiga e Nova? " + periodo.getMonths());
		
		System.out.println("Quantos anos de Diferenca entra Data Antiga e Nova? " + periodo.getYears());
		
		System.out.println("Somente em meses a diferenca eh: " + periodo.toTotalMonths() + " meses");
		
		System.out.println("Diferenca entre a Data Antiga e a Nova sao: " + periodo.getYears() + " anos, " 
					+ periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
		
		
	}
}
