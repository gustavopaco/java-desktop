package main.java.com.pacoprojects.aula89.util.formatar.datas.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Boot {
    public static void main(String[] args) {

        // Note: Ao instanciar o SimpleDateFormat podemos passar o formato da saida formatada.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

        Calendar calendar = new GregorianCalendar();

        // Note: format() -> Recebe uma Data do tipo "Date". Utilizando a Classe Calendar, o metodo getTime() retorna um "Date"
        System.out.println(sdf.format(calendar.getTime()));

        Date date = new Date();

        // Note: format() -> Recebe uma Data do tipo "Date".
        System.out.println(sdf.format(date));

        String data = "24/09/1989";
        try {
            // Note: parse() -> Retorna um Date, a partir de uma STRING que tenha o PATTERN definido do SimpleDateFormat
            Date dataEscolhida = sdf2.parse(data);

            System.out.println(dataEscolhida);
            System.out.println(sdf.format(dataEscolhida));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
