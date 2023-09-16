package com.pacoprojects.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ApiLocalDateAndLocalDateTime {

	
	public static void main(String[] args) throws ParseException {
		
		/* NOVA API DE DATA A PARTIR DO JAVA 8 */
		
		
		/* CLASSE PARA DATA */
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		/* CLASSE PARA HORA */
		LocalTime hora = LocalTime.now();
		
		System.out.println("Hora atual: " + hora.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		
		/* CLASSE PARA DATA E HORA */
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		String data2 = "2021-07-08T16:42:29";
		LocalDateTime data3 = LocalDateTime.parse(data2);

		System.out.println("Data Atual e Hora: " + dataAtualHoraAtual);

		String dataNovoFormato = dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		LocalDateTime novoDateFormatado = LocalDateTime.parse((dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));


		System.out.println("(yyyy-MM-dd HH:mm:ss) Data atual formatada: " + dataNovoFormato);

		System.out.println("(yyyy-MM-dd HH:mm:ss) Data atual formatada: " + novoDateFormatado);

		System.out.println("(yyyy-MM-ddTHH:mm:ss:sss) Data atual formatada: " + dataAtualHoraAtual);

		System.out.println("(yyyy-MM-ddTHH:mm:ss:sssZ) Data atual formatada: " + dataAtualHoraAtual.toInstant(ZoneOffset.UTC));

		System.out.println("DATA FORMATADA IMPRESSA: " + data3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		/*--------------------------FORMATANDO DATA E HORA-------------------------------------*/
		
		
		System.out.println("Data e Hora Formatada: " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		
		
		
		
		
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
