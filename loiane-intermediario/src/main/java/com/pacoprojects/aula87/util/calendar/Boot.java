package main.java.com.pacoprojects.aula87.util.calendar;

import java.util.Calendar;

public class Boot {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        // Note: calendar.get(Calendar.YEAR) -> Retorna o ANO
        System.out.println("ANO: " + calendar.get(Calendar.YEAR));
        int ano = calendar.get(Calendar.YEAR);

        // Note: calendar.get(Calendar.MONTH) -> Retorna o MES, NECESSARIO SOMAR +1, pois Janeiro é considerado mes 0.
        System.out.println("MES: " + (calendar.get(Calendar.MONTH) + 1));
        int mes = calendar.get(Calendar.MONTH);

        // Note: calendar.get() -> Retorna o DIA do MES
        System.out.println("DIA DO MES: " + calendar.get(Calendar.DAY_OF_MONTH));
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        // Note: calendar.get(Calendar.HOUR) -> Retorna as HORAS do dia, formato 12 HORAS
        System.out.println("HORAS 12H: " + calendar.get(Calendar.HOUR));

        // Note: calendar.get(Calendar.HOUR_OF_DAY) -> Retorna as HORAS do dia, formato 24 HORAS
        System.out.println("HORAS 24H: " + calendar.get(Calendar.HOUR_OF_DAY));
        int horas = calendar.get(Calendar.HOUR_OF_DAY);

        // Note: calendar.get(Calendar.MINUTE) -> Retorna os MINUTOS da HORA
        System.out.println("MINUTOS: " + calendar.get(Calendar.MINUTE));
        int minutos = calendar.get(Calendar.MINUTE);

        // Note: calendar.get(Calendar.SECOND) -> Retorna os SEGUNDOS do MINUTO
        System.out.println("SEGUNDOS: " + calendar.get(Calendar.SECOND));
        int segundos = calendar.get(Calendar.SECOND);

        System.out.printf("Hoje é %02d/%02d/%d %02d:%02d:%02d %n", dia, (mes + 1), ano, horas, minutos, segundos);

        // Note: calendar.add(PARAM, QTD) -> ADICIONA a partir de um PARAMETRO, X quantidades a Instancia do Calendar;
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("DIA: " + calendar.get(Calendar.DAY_OF_MONTH));

        // Note: calendar.add(PARAM, QTD) -> SUBTRAI a partir de um PARAMETRO, X quantidades a Instancia do Calendar;
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("DIA: " + calendar.get(Calendar.DAY_OF_MONTH));
    }
}
