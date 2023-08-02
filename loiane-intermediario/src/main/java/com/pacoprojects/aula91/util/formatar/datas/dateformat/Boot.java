package main.java.com.pacoprojects.aula91.util.formatar.datas.dateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Boot {
    public static void main(String[] args) {

        Date date = new Date();

        // Note: Locale.getDefault() -> Obtem o LOCALE padrao do sistema
        System.out.println("LOCALE: " + Locale.getDefault());
        // Note: DateFormat.getInstance.format() -> Formata a DATA E HORA de acordo com o LOCALE (US)
        System.out.println("DATA_HORA: " + DateFormat.getInstance().format(date));
        // Note: DateFormat.getInstance.format() -> Formata a DATA(Textual) E HORA de acordo com o LOCALE (US)
        System.out.println("DATA_HORA_TEXTUAL: " + DateFormat.getDateTimeInstance().format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a DATA de acordo com o LOCALE (US)
        System.out.println("DATA: " + DateFormat.getDateInstance().format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a HORA de acordo com o LOCALE (US)
        System.out.println("HORA: " + DateFormat.getTimeInstance().format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a HORA(Formato Curto) de acordo com o LOCALE (US)
        System.out.println("HORA_FORMATO_CURTO: " + DateFormat.getTimeInstance(DateFormat.SHORT).format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a HORA(Formato Medio) de acordo com o LOCALE (US)
        System.out.println("HORA_FORMATO_MEDIO: " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a HORA(Formato Longo) de acordo com o LOCALE (US)
        System.out.println("HORA_FORMATO_LONGO: " + DateFormat.getTimeInstance(DateFormat.LONG).format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata a Data(Formato Medio) E HORA(Formato Curto) de acordo com o LOCALE (US)
        System.out.println("DATA_FORMATO_MEDIO_HORA_FORMATO_CURTO: " + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(date));

        String dataEscolhida = "09/24/1989, 00:00 AM";
        try {
            // Note: DateFormat.getInstance().parse() -> Transforma uma Data STRING em um Tipo Date
            System.out.println(DateFormat.getInstance().parse(dataEscolhida));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        // Note: setDefault() -> Define como padrao um NOVO LOCAL para o sistema
        Locale.setDefault(new Locale("pt","BR"));
        System.out.println();

        // Note: Locale.getDefault() -> Obtem o LOCALE padrao do sistema
        System.out.println("LOCALE: " + Locale.getDefault());
        // Note: DateFormat.getInstance.format() -> Formata a DATA E HORA de acordo com o LOCALE (BR)
        System.out.println("DATA_HORA: " + DateFormat.getInstance().format(date));
        // Note: DateFormat.getInstance.format() -> Formata a DATA(Textual) E HORA de acordo com o LOCALE (BR)
        System.out.println("DATA_HORA_TEXTUAL: " + DateFormat.getDateTimeInstance().format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a DATA de acordo com o LOCALE (BR)
        System.out.println("DATA: " + DateFormat.getDateInstance().format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a HORA de acordo com o LOCALE (BR)
        System.out.println("HORA: " + DateFormat.getTimeInstance().format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a HORA(Formato Curto) de acordo com o LOCALE (BR)
        System.out.println("HORA_FORMATO_CURTO: " + DateFormat.getTimeInstance(DateFormat.SHORT).format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a HORA(Formato Medio) de acordo com o LOCALE (BR)
        System.out.println("HORA_FORMATO_MEDIO: " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata SOMENTE a HORA(Formato Longo) de acordo com o LOCALE (BR)
        System.out.println("HORA_FORMATO_LONGO: " + DateFormat.getTimeInstance(DateFormat.LONG).format(date));
        // Note: DateFormat.getTimeInstance.format() -> Formata a Data(Formato Medio) E HORA(Formato Curto) de acordo com o LOCALE (BR)
        System.out.println("DATA_FORMATO_MEDIO_HORA_FORMATO_CURTO: " + DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(date));

        String dataEscolhida2 = "24/09/1989 00:00:00";
        try {
            // Note: DateFormat.getInstance().parse() -> Transforma uma Data STRING em um Tipo Date
            System.out.println(DateFormat.getInstance().parse(dataEscolhida2));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        // Note: setTime() -> Transforma um tipo Date para tipo Calendar
        calendar.setTime(date);
    }
}
