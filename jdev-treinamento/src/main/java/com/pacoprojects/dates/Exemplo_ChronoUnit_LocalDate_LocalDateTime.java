package com.pacoprojects.dates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exemplo_ChronoUnit_LocalDate_LocalDateTime {

	public static void main(String[] args) throws ParseException {
		
		/* CHRONOUNIT EH USADO PARA SABER DIFERENCAS DE DATAS EM DIAS -> DATA1 - DATA2 = 52 DIAS DE ATRASO */
		
//		Date data = new SimpleDateFormat("yyyy-MM-dd hh:mm.ss").parse("2021-02-01 08:45.50");
		
		
		long dias = ChronoUnit.HOURS.between(LocalDateTime.parse("2019-04-17T13:44:00"), LocalDateTime.now());
		
		System.out.println("Possui: " + dias + " HORAS entre a faixa de data");
		
		
		dias = ChronoUnit.DAYS.between(LocalDateTime.parse("2019-04-17T13:44:00"), LocalDateTime.now());
		
		System.out.println("Possui: " + dias + " DIAS entre a faixa de data");
		
		
		
		System.out.println("Data atual + Horas: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		
		
		System.out.println("DATA: " + LocalDateTime.parse("2021-02-01T08:45:50").format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		
		
		System.out.println("Meu aniversario: " + LocalDate.parse("2021-09-24").format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	}
}
