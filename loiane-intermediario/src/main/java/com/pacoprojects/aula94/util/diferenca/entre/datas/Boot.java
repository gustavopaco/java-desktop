package main.java.com.pacoprojects.aula94.util.diferenca.entre.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Boot {
    public static void main(String[] args) {

        try {
            // Note: Metodo de comparacao entre diferenca de datas utilizando calculo MANUAL e com TimeUnit
            diferencaDataAteJava7();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("-------------");
        // Note: Metodo de comparacao entre diferenca de datas utilizando Classe Period
        diferencaDataJava8LocalDate();

        System.out.println();
        System.out.println("-------------");
        // Note: Metodo de comparacao entre diferenca de datas utilizando Classe Period e Duration
        diferencaDataJava8LocalDateTime();

        System.out.println();
        System.out.println("-------------");
        // Note: Metodo de comparacao entre diferenca de datas utilizando Classe ChronoUnit
        diferencaDataJava8ChronoUnit();
    }

    public static void diferencaDataAteJava7() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date primeiraData = sdf.parse("01/01/2030");
        Date segundaData = sdf.parse("01/02/2030");

        // Note: Comparacao de Dias de forma Manual
        long diferencaMillissegundos = Math.abs(segundaData.getTime() - primeiraData.getTime());
        int dias = (int) (diferencaMillissegundos / (1000 * 60 * 60 * 24));
        System.out.println("Conversao manual: " + dias + " dias");

        // Note: Comparacao de Dias utilizando a Classe TimeUnit
        long diferecaDias = TimeUnit.DAYS.convert(Duration.ofMillis(diferencaMillissegundos));
        System.out.println("TimeUnit: " + diferecaDias + " dias");
    }

    public static void diferencaDataJava8LocalDate() {
        LocalDate data1 = LocalDate.of(2030,1,1);
        LocalDate data2 = LocalDate.of(2030,2,10);

        // Note: Comparacao de 'dias, meses, anos' utilizando a Classe Period a partir de LocalDate ou LocalDateTime
        Period between = Period.between(data1, data2);
        int dias = between.getDays();
        int meses = between.getMonths();
        int ano = between.getYears();

        System.out.println("Peridod");
        System.out.println(ano + " anos");
        System.out.println(meses + " meses");
        System.out.println(dias + " dias");
    }

    public static void diferencaDataJava8LocalDateTime() {

        LocalDateTime data1 = LocalDateTime.of(2030, 1, 1, 10, 20, 35);
        LocalDateTime data2 = LocalDateTime.of(2030, 2, 1, 18, 10, 58);

        // Note: Comparacao de 'dias, meses, anos' utilizando a Classe Period a partir de LocalDate ou LocalDateTime
        Period periodo = Period.between(data1.toLocalDate(), data2.toLocalDate());
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        // Note: Comparacao de 'horas, minutos, segundos' utilizando a Classe Duration a partir de LocalDateTime
        Duration duration = Duration.between(data1, data2);
        long horas = duration.toHours();
        long minutos = duration.toMinutes();
        long segundos = duration.toSeconds();

        System.out.println("Period & Duration");
        System.out.println(anos + " anos");
        System.out.println(meses + " meses");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }

    public static void diferencaDataJava8ChronoUnit() {

        LocalDateTime data1 = LocalDateTime.of(2030, 1, 1, 10, 20, 35);
        LocalDateTime data2 = LocalDateTime.of(2030, 2, 1, 18, 10, 58);

        // Note: Comparacao de 'anos, meses, dias, horas, minutos, segundos' utilizando a Classe ChronoUnit a partir de LocalDate ou LocalDateTime
        long anos = ChronoUnit.YEARS.between(data1,data2);
        long meses = ChronoUnit.MONTHS.between(data1,data2);
        long dias = ChronoUnit.DAYS.between(data1, data2);
        long horas = ChronoUnit.HOURS.between(data1, data2);
        long minutos = ChronoUnit.MINUTES.between(data1, data2);
        long segundos = ChronoUnit.SECONDS.between(data1, data2);

        System.out.println("ChronoUnit");
        System.out.println(anos + " anos");
        System.out.println(meses + " meses");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }
}
