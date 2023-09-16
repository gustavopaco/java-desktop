package com.pacoprojects.dates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploGerarBoletoDatas {

	public static void main(String[] args) throws ParseException {
		
//		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");
//		Calendar calendar = Calendar.getInstance();
//		
//		calendar.setTime(dataInicial);
//		System.out.println(dataInicial);
		
		
		
		/* STRING VINDO DA INTERFACE COM DD/MM/YYYY , TRANSFORMANDO EM YYYY/MM/DD PARA GRAVAR NO BANCO */
		String data_aniversario = "24/09/1989";
		LocalDate data_aniversarioBancoDeDados = LocalDate.parse(data_aniversario, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Data de Aniversario para gravar no Banco de Dados: " + data_aniversarioBancoDeDados);
		
	
		
		
		LocalDate dataAtual = LocalDate.parse("2021-04-08");
		
		
		for(int parcela = 1 ; parcela <= 10 ; parcela++) {
//			calendar.add(Calendar.MONTH, 1);
//			System.out.println("Parcela numero: " + parcela + " vencimento eh em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			
			
			dataAtual = dataAtual.plusMonths(1);
			System.out.println("Parcela numero: " + parcela + " vencimento eh em: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
		
			
			/* GERA BOLETO AQUI */
			
			
		}
		
	}
}
