package com.pacoprojects.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAfterAndBefore {

	public static void main(String[] args) throws ParseException {
		

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date datavencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("07/04/2021");
		
		
		/* SE A DATA 1 EH MAIOR/POSTERIOR QUE A DATA 2 */
		if(dataAtualHoje.after(datavencimentoBoleto)) { 	/* SE A DATA DE HOJE EH MAIOR/DEPOIS DA DATA DO VENCIMENTO DO BOLETO */
			System.out.println("Boleto Vencido - URGENTE");
		}else {
			System.out.println("Boleto nao Vencido");
		}
		
		
		/* SE A DATA 1 EH MENOR/ANTERIOR QUE A DATA 2 */
		if(dataAtualHoje.before(datavencimentoBoleto)) { 	/* SE A DATA DE HOJE EH MENOR/ANTES DA DATA DO VENCIMENTO DO BOLETO */
			System.out.println("Boleto nao Vencido");
		}else {
			System.out.println("Boleto Vencido - URGENTE");
		}
		
	}
	
}
