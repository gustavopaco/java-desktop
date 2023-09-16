package com.pacoprojects.dates;

import java.text.ParseException;
import java.util.Calendar;

public class ExemploCalendarV1 {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
	
		
		System.out.println("Calendar Dia do mes: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		
		System.out.println("Calendar Dia da Semana: " + (calendar.get(Calendar.DAY_OF_WEEK)-1));
		
		
		System.out.println("Hora do Dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		
		System.out.println("Minuto da Hora: " + calendar.get(Calendar.MINUTE));
		
		
		System.out.println("Segundos da Hora: " + calendar.get(Calendar.SECOND));
		
		
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		
		
		

		
	}
}
