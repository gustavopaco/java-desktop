package main.java.com.pacoprojects.aula90.util.locale.internacionalizacao;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Boot {
    public static void main(String[] args) {

        // Brasil - dd/MM/yyyy      |   1.000,02
        // USA - MM/dd/yyyy         |   1,000.02

        // Note: getDefault() -> Obtem o Locale padrao do sistema
        Locale locale = Locale.getDefault();

        System.out.println(locale);

        for (Locale availableLocale : Locale.getAvailableLocales()) {

            // Note: getDisplayName() -> Retorna o nome dos locais disponiveis para ser utilizado no sistema.
            System.out.println("NOME: " +  availableLocale.getDisplayName());

            // Note: getLanguage() -> Retorna o codigo da lingua utilizada nesses locais.
            System.out.println("COD LINGUA: " + availableLocale.getLanguage());

            // Note: getDisplayLanguage() -> Retorna a lingua
            System.out.println("LINGUA: " + availableLocale.getDisplayLanguage());

            // Note: getCountry() -> Retorna o codigo do pais
            System.out.println("COD PAIS: " + availableLocale.getCountry());

            // Note: getDisplayCountry() -> Retorna o nome do pais
            System.out.println("PAIS: " + availableLocale.getDisplayCountry());

            System.out.println("************");
        }

        Locale br = new Locale("pt", "BR");

        System.out.println(br);

        // Note: setDefault() -> Define como padrao um NOVO LOCAL para o sistema
        Locale.setDefault(br);

        System.out.println(Locale.getDefault());

        // Note: getCurrencyInstance() -> Obtem a MOEDA PADRAO do sistema
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(500000d));

        // Note: getCurrencyInstance(LOCALE.PAIS) -> Obtem a MOEDA PADRAO do PAIS X
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf2.format(500000d));

        // Note: getCurrencyInstance(LOCALE.PAIS) -> Obtem a MOEDA PADRAO do PAIS X
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(nf3.format(500000d));
    }
}
