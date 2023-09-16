package com.pacoprojects.dates;

import java.time.Duration;
import java.time.Instant;

public class ApiInstantDuration {

	public static void main(String[] args) throws InterruptedException {
		
		Instant instant = Instant.now();
		
		Thread.sleep(2000);  	/* PODE SER UM PROCESSO COM TEMPO QUALQUER QUE NAO CONHECEMOS */
		
		Instant ifinal = Instant.now();



		Duration duration = Duration.between(instant, ifinal);
		

		System.out.println("Duracao em nano-segundos: " + duration.toNanos());
		
		System.out.println("Duracao em minutos: " + duration.toMinutes());
		
		System.out.println("Duracao em horas: " + duration.toHours());
		
		System.out.println("Duracao em mili-segundos: " + duration.toMillis());
		
		System.out.println("Duracao em dias: " + duration.toDays());
		
	}
}
