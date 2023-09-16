package com.pacoprojects.dates;

import java.text.ParseException;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println(date);
		
		System.out.println("Data em Milisegundos: " + date.getTime());
		
		System.out.println("Dia do Mes: " + date.getDate());
		
		System.out.println("Dia da Semana: " + date.getDay());
		
		System.out.println("Hora do Dia: " + date.getHours());
		
		System.out.println("Minuto da Hora: " + date.getMinutes());
		
		System.out.println("Segundos da Hora: " + date.getSeconds());
		
		System.out.println("Ano: " + (1900 + date.getYear()));
		
		System.out.println("Timezone: " + date.getTimezoneOffset());
		
		System.out.println("GMT: " + date.toGMTString());
		
		

		
	}
}
