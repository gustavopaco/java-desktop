package com.pacoprojects.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExemplosApiV1 {

	
	public static void main(String[] args) throws ParseException {
		
		LocalDate localDate = LocalDate.now();
		
		
		System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		System.out.println("Dia da Semana: " + localDate.getDayOfWeek());
		System.out.println("Dia da Semana: " + (localDate.getDayOfWeek().ordinal()));
		
		
		System.out.println("Dia do Mes: " + localDate.getDayOfMonth());
		
		
		System.out.println("Dia do Ano: " + localDate.getDayOfYear());
		
		
		System.out.println("Mes: " + localDate.getMonth());
		System.out.println("Numero do Mes no Ano: " + localDate.getMonthValue());
		
		
		System.out.println("Ano: " + localDate.getYear());
		
		
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		/* ADICIONANDO 1 DIA AO DIA ATUAL*/
		System.out.println("Dia Atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))  
					+ " Dia +1: " + localDate.plusDays(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("                        *OU*                           ");
		
		System.out.println("Dia Atual: " + localDate.getDayOfMonth() + " Dia +1: " + localDate.plusDays(1).getDayOfMonth());
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		
		
		
		/* ADICIONANDO 1 MES AO MES ATUAL*/
		System.out.println("Mes Atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
					+ " Mes +1: " + localDate.plusMonths(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("                        *OU*                           ");
		
		System.out.println("Mes Atual: " + localDate.getMonth() + " Mes +1: " + localDate.plusMonths(1).getMonth());
		
		System.out.println("                        *OU*                           ");
		
		System.out.println("Mes Atual: " + localDate.getMonthValue() + " Mes +1: " + localDate.plusMonths(1).getMonthValue());
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		
		/* ADICIONANDO 1 ANO AO ANO ATUAL*/
		
		System.out.println("Ano Atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
				+ " Ano +1: " + localDate.plusYears(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("                        *OU*                           ");
		
		System.out.println("Ano Atual: " + localDate.getYear() + " Ano +1: " + localDate.plusYears(1).getYear());
		
		
		
		/* CONVERTENDO VARIAVEL DATE PARA LOCALDATE OU LOCALDATETIME (JAVA VERSAO 9) */
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse("24/09/1989");
//		System.out.println(data);
		
		LocalDate ld = LocalDate.ofInstant(data.toInstant(), ZoneId.systemDefault());
		LocalDate ld2 = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDateTime ldt = LocalDateTime.ofInstant(data.toInstant(), ZoneId.systemDefault());
		LocalDateTime ldt2 = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
//		System.out.println(ld2);
		
	}
}
