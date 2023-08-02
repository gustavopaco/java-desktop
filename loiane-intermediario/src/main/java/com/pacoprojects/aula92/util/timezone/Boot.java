package main.java.com.pacoprojects.aula92.util.timezone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Boot {
    public static void main(String[] args) {

        // Note: Calendar.getInstance -> Obtem instancia do Calendar
        Calendar calendar = Calendar.getInstance();
        // Note: calendar.getTimeZone() -> Obtem uma instancia do Timezone
        TimeZone tz = calendar.getTimeZone();

        System.out.println(tz);
        System.out.println();

        // Note: TimeZone.getAvailableIDs -> Obtem uma lista de Timezones disponiveis.
        String[] fusos = TimeZone.getAvailableIDs();
        for (String fuso : fusos) {
            System.out.println(fuso);
        }
        System.out.println();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        // Note: TimeZone.getTimeZone(ID) -> Obtem uma instancia do TimeZone a partir de um TimeZone especifico
        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
        // Note: TimeZone.getDisplayNome() -> Retorna o NOME do TimeZone utilizado
        System.out.println("NOME: " + tzSP.getDisplayName());
        // Note: TimeZone.getID() -> Retorna o ID do TimeZone utilizado
        System.out.println("COD_TIMEZONE: " + tzSP.getID());

        // Note: Calendar.getInstance(TimeZone) -> Obtem uma instancia de Calendar definindo o TimeZone como X
        Calendar agoraSaoPaulo = Calendar.getInstance(tzSP);
        // Note: Calendar.getTimeZone() -> Obtem uma instancia do TimeZone
        System.out.println("TIMEZONE_SAO_PAULO: " + agoraSaoPaulo.getTimeZone());
        // Imprimindo Horario Formatado sem correcao de SP
        System.out.println("Horário em São Paulo: " + sdf.format(agoraSaoPaulo.getTime()));

        System.out.println();

        // Note: TimeZone.getTimeZone(ID) -> Obtem uma instancia do TimeZone a partir de um TimeZone especifico
        TimeZone tzIndianapolis = TimeZone.getTimeZone("America/Indianapolis");
        // Note: TimeZone.getDisplayNome() -> Retorna o NOME do TimeZone utilizado
        System.out.println("NOME: " + tzIndianapolis.getDisplayName());
        // Note: TimeZone.getID() -> Retorna o ID do TimeZone utilizado
        System.out.println("COD_TIMEZONE: " + tzIndianapolis.getID());

        // Note: Calendar.getInstance(TimeZone) -> Obtem uma instancia de Calendar definindo o TimeZone como X
        Calendar agoraIndianapolis = Calendar.getInstance(tzIndianapolis);
        // Note: Calendar.getTimeZone() -> Obtem uma instancia do TimeZone
        System.out.println("TIMEZONE_INDIANAPOLIS: " + agoraIndianapolis.getTimeZone());
        // Imprimindo Horario Formatado SEM CORRECAO de Indianapolis
        System.out.println("Horário em Indianapolis: " + sdf.format(agoraIndianapolis.getTime()));

        // Calculo de diferenca de horas entre dois Fusos Horarios
        int diferencaHoras = (tzIndianapolis.getOffset(System.currentTimeMillis()) - tzSP.getOffset(System.currentTimeMillis())) / (1000 * 60 * 60);
        // Adicionando Diferenca de horas as horas do Fuso de Indianapolis
        agoraIndianapolis.add(Calendar.HOUR_OF_DAY, diferencaHoras);
        // Imprimindo Horario Formatado CORRIGIDO de Indianapolis
        System.out.println("Horário em Indianapolis após ajuste: " + sdf.format(agoraIndianapolis.getTime()));
    }
}
