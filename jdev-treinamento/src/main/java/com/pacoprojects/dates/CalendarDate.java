package com.pacoprojects.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDate {

    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();

        /*----------------------------FORMATANDO DATAS COM CALENDAR------------------------------------------*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
        System.out.println("Calendar - DATA para String: " + simpleDateFormat.format(calendar.getTime()));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
        System.out.println("Calendar - Hora formatada para Banco de Dados: " + simpleDateFormat.format(calendar.getTime()));




        /* FORMATANDO STRING PARA OBJETO DATE */
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Objeto Date: " + simpleDateFormat.parse("1989-09-24"));






        /* RECEBENDO UMA STRING DA INTERFACE E FORMATANDO PARA DATE USANDO CALENDAR */
        String data_aniversario = "1989-09-24 08:45.50";
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

        java.util.Calendar c = java.util.Calendar.getInstance();
        simpleDateFormat.parse(data_aniversario);


        System.out.println("Data de Aniversario - " + (simpleDateFormat.getCalendar().getTime()));
        System.out.println("Data de Aniversario - Dia do Mes: " + (simpleDateFormat.getCalendar().get(java.util.Calendar.DAY_OF_MONTH)));
        System.out.println("Data de Aniversario - Mes: " + (simpleDateFormat.getCalendar().get(java.util.Calendar.MONTH)+1));
        System.out.println("Data de Aniversario - Ano: " + (simpleDateFormat.getCalendar().get(java.util.Calendar.YEAR)));
        System.out.println("Data de Aniversario - Hora do Dia: " + (simpleDateFormat.getCalendar().get(java.util.Calendar.HOUR_OF_DAY)));
        System.out.println("Data de Aniversario - Minuto: " + (simpleDateFormat.getCalendar().get(java.util.Calendar.MINUTE)));
        System.out.println("Data de Aniversario - Segundo: " + (simpleDateFormat.getCalendar().get(java.util.Calendar.SECOND)));
    }
}
