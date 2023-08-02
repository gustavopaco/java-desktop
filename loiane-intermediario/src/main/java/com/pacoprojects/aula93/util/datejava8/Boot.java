package main.java.com.pacoprojects.aula93.util.datejava8;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Boot {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------------
        // SOMENTE DATA - LOCALDATE
        System.out.println("*** LocalDate ***");

        // Note: LocalDate.now() -> Retorna uma instancia do LocalDate com a DATA atual.
        LocalDate agora = LocalDate.now();

        System.out.println("DATA_HORA_ATUAL: " + agora);
        System.out.println("DATA_HORA_ESPECIFICA: " + LocalDate.of(1989,9,24));

        // Note: LocalDate.parse() -> Converte uma DATA em STRING no formato ISO para LocalDate
        System.out.println("PARSE_STRING: " + LocalDate.parse("2021-10-13"));

        System.out.println();

        // Note: plus(Qtd, ChronoUnit.X) | plusDays() | plusMonths() | plusYears() -> Retorna um LocalDate Adicionando X Dias
        System.out.println("HOJE_MAIS_5_DIAS: " + agora.plusDays(5));
        // Note: minus(Qtd, ChronoUnit.X) | minusDays() | minusMonths() | minusYears() -> Retorna um LocalDate Removendo X Dias
        System.out.println("HOJE_MENOS_5_DIAS: " + agora.minus(5, ChronoUnit.DAYS));
        // Note: getDayOfWeek() -> Retorna um DayOfWeek com o Dia da Semana
        System.out.println("DIA_DA_SEMANA: " + agora.getDayOfWeek());
        // Note: getDayOfMonth() -> Retorna um Int com o Dia do Mes
        System.out.println("DIA_DO_MES: " + agora.getDayOfMonth());
        // Note: getDayOfYear() -> Retorna um Int com o Dia do Ano
        System.out.println("DIA_DO_ANO: " + agora.getDayOfYear());
        // Note: isLeapYear() -> Retorna um Boolean se é ano BISSEXTO
        System.out.println("BISSEXTO: " + agora.isLeapYear());

        System.out.println();
        //--------------------------------------------------------------------------------------------------------------------
        // SOMENTE HORA - LOCALTIME
        System.out.println("*** LocalTime ***");

        // Note: LocalTime.now() -> Retorna uma instancia do LocalTime com a HORA atual.
        LocalTime hAgora = LocalTime.now();

        System.out.println("HORA_ATUAL: " + hAgora);
        System.out.println("HORA_ESPECIFICA: " + LocalTime.of(14,25));

        // Note: LocalTime.parse() -> Converte uma HORA em STRING no formato ISO para LocalTime
        System.out.println("PARSE_STRING: " + LocalTime.parse("09:10"));

        // Note: plus(Qtd, ChronoUnit.X) | plusHours() | plusMinutes() | plusSeconds() | plusNanos() -> Retorna um LocalTime Adicionando X Minutos
        System.out.println("HORA_ATUAL_MAIS_50MIN: " + hAgora.plusMinutes(50));
        // Note: minus(Qtd, ChronoUnit.X) | minusHours() | minusMinutes() | minusSeconds() | minusNanos() -> Retorna um LocalTime Removendo X Horas
        System.out.println("HORA_ATUAL_MENOS_5HORAS: " + hAgora.minus(5, ChronoUnit.HOURS));
        // Note: getHour() -> Retorna um Int com a HORA do dia
        System.out.println("HORA_ATUAL: " + hAgora.getHour());
        // Note: getMinute() -> Retorna um Int com a MINUTO da hora
        System.out.println("MINUTO_ATUAL: " + hAgora.getMinute());
        // Note: getMinute() -> Retorna um Int com a SEGUNDO do minuto
        System.out.println("SEGUNDO_ATUAL: " + hAgora.getSecond());
        // Note: getMinute() -> Retorna um Int com a NANOSEGUNDO do segundo
        System.out.println("NANOSEGUNDO_ATUAL: " + hAgora.getNano());

        System.out.println();
        //--------------------------------------------------------------------------------------------------------------------
        // DATA E HORA COMPLETA - LOCALDATETIME
        System.out.println("*** LocalDateTime ***");

        // Note: LocalDateTime.now() -> Retorna uma instancia do LocalDateTime com a DATA e HORA atual.
        LocalDateTime agoraCompleto = LocalDateTime.now();

        System.out.println("HORA_ATUAL: " + agoraCompleto);
        System.out.println("HORA_ESPECIFICA: " + LocalDateTime.of(2005,5,26,18,14,30));

        System.out.println("PARSE_STRING: " + LocalDateTime.parse("1989-09-24T10:25:13"));

        // Todos os metodos do LocalDate e do LocalTime

        System.out.println();
        //--------------------------------------------------------------------------------------------------------------------
        // TIMEZONE - ZONEID
        System.out.println("*** ZoneId ***");

        // Note: ZoneId.systemDefault() ->  Obtem o timezone do sistema
        ZoneId fusoAtual = ZoneId.systemDefault();
        System.out.println(fusoAtual);

//        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println("FUSO: " + availableZoneId);
//        }

        // Note: ZoneId.of() -> Obtem o timezone de uma regiao especifica
        ZoneId zoneSP = ZoneId.of("America/Sao_Paulo");
        ZoneId zoneIndi = ZoneId.of("America/Indianapolis");

        System.out.println(zoneIndi.getRules());


        //--------------------------------------------------------------------------------------------------------------------
        // TIMEZONE - ZONEDATETIME
        System.out.println("*** ZoneDateTime ***");

        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), zoneIndi);
        System.out.println("ZoneDateTime: " + zdt);

        System.out.println("OffSet: " + zdt.getOffset());

        //--------------------------------------------------------------------------------------------------------------------
        // TIMEZONE - ZONEOFFSET
        System.out.println("*** ZoneOffSet ***");

        ZoneOffset zos = ZoneOffset.of(zdt.getOffset().toString());
        System.out.println("ZoneOffSet: " + zos);

        //--------------------------------------------------------------------------------------------------------------------
        // TIMEZONE - OFFSETDATETIME
        System.out.println("*** OffSetDateTime ***");

        OffsetDateTime odt = OffsetDateTime.of(LocalDateTime.now(), zos);
        System.out.println("OffSetDateTime: " + odt);


        //--------------------------------------------------------------------------------------------------------------------
        // CONVERSAO
        System.out.println("*** CONVERSAO ***");

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        // Note: LocalDateTime.OfInstant(DATE.toInstant(), ZoneId) -> Converte Date para LocalDateTime
        LocalDateTime localDateTimeFromDate = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        // Note: LocalDateTime.OfInstant(Calendar.toInstant(), ZoneId) -> Converte Date para LocalDateTime
        LocalDateTime localDateTimeFromCalendar = LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());

        // Note: Converter LocalDateTime para Date
        Date date3 = Date.from(localDateTimeFromDate.atZone(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(localDateTimeFromDate.toInstant(ZoneOffset.of(ZonedDateTime.now().getOffset().toString())));

        // Note: Mostrar Horario em qualquer timezone a partir do horario atual local
        ZoneId zoneSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId zoneIndianapolis = ZoneId.of("America/Indianapolis");

        LocalDateTime agoraSaoPaulo = LocalDateTime.now();
        ZonedDateTime zdtSaoPaulo = agoraSaoPaulo.atZone(zoneSaoPaulo);
        System.out.println("ZonedDateTime_Sao_Paulo: " + zdtSaoPaulo);
        System.out.println("Horário atual em São Paulo: " + agoraSaoPaulo);

        ZonedDateTime zdtIndianapolis = zdtSaoPaulo.withZoneSameInstant(zoneIndianapolis);
        LocalDateTime agoraIndianapolis = zdtIndianapolis.toLocalDateTime();
        System.out.println("ZonedDateTime_Indianapolis: " + zdtIndianapolis);
        System.out.println("Horário atual em Indianapolis: " + agoraIndianapolis);

        LocalDateTime agoraMoscow = ZonedDateTime.now(ZoneId.of("Europe/Moscow")).toLocalDateTime();
        System.out.println("Horário atual em Moscow: " + agoraMoscow);
    }
}
