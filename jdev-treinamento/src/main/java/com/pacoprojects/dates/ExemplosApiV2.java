package com.pacoprojects.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ExemplosApiV2 {

	public static void main(String[] args) throws ParseException {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		LocalDate dataAtual = LocalDate.now();
		
		LocalDate dataVencimento = LocalDate.parse("2020-04-01");
		
		System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Mais 5 Semanas: " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 2 meses: " + (dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Mais 5 Anos: " + (dataBase = dataBase.plusYears(5)));
		
		
		System.out.println("Menos 1 ano: " + (dataBase = dataBase.minusYears(1)));
		
		System.out.println("Menos 1 mes: " + (dataBase = dataBase.minusMonths(1)));
		
		System.out.println("Menos 20 dias: " + (dataBase = dataBase.minusDays(20)));
		
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		
		for(int mes = 1 ; mes <= 12 ; mes++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Boleto numero: " + mes + " - " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
		}
		
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		
		if(dataAtual.isAfter(dataVencimento)) {
			System.out.println("Boleto Vencido a: " + (ChronoUnit.DAYS.between(dataAtual, dataVencimento)*(-1)) + " dias.");
		}else {
			System.out.println("Boleto Valido");
		}
		
		System.out.println("Comparando 2 variaveis LocalDate em DIAS: " + ChronoUnit.DAYS.between(dataAtual, dataVencimento));
		System.out.println("Comparando LocalDate em DIAS: " + dataAtual.until(dataVencimento, ChronoUnit.DAYS));
		
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		
		
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
