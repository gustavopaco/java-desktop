package main.java.com.pacoprojects.aula96.util.formatar.numeros.decimais;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Boot {
    public static void main(String[] args) {

        String padrao = "###,###.##";       // Padrao Americano
        String padrao2 = "###.###,##";      // Padrao Brasileiro - Se Locale nao for setado corretamente para pt_BR pode lancar Exception
        String padrao3 = "####,####.##";    // 4# Representa 4 Casas de Milhar
        String padrao4 = "###,###,##0.00";  // 0 Representa Casas obrigatorios, se nao houver o java vai completar com 0
        String padrao5 = "\u00A4###,###,##0.00";  // ¤ Mostra o simbolo monetario do locale


        // Note: Recebe uma instancia do DecimalFormat ja passando o padrao no seu construtor
        DecimalFormat df = new DecimalFormat(padrao);
//        df.applyPattern(padrao);      // Define um novo padrao caso nao queira passar no construtor
        // Note: format() -> Formata um numero a partir do PADRAO
        System.out.println("VALOR_FORMATO_EN_US: " + df.format(1234567890.12235));

        // Note: Recebe uma instancia de DecimalFormatSymbols passando um novo Locale
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","BR"));
//        dfs.setDecimalSeparator(',');     // Define manualmente separador decimal, caso nao queira usar o Locale
//        dfs.setGroupingSeparator('.');    // Define manualmente separador milhar, caso nao queira usar o Locale
//        df.setDecimalFormatSymbols(dfs);  // Define novo formatador de simbolos

        // Note: Recebe uma instancia de DecimalFormat passando no construtor o PADRAO E o LOCALE dos Simbolos
        df = new DecimalFormat(padrao, dfs);
        System.out.println("VALOR_FORMATO_PT_BR: " + df.format(1234567890.12235));

        // Note: Recebe uma instancia de DecimalFormat passando no construtor o PADRAO E o LOCALE dos Simbolos
        df = new DecimalFormat(padrao3, dfs);
        System.out.println("VALOR_FORMATO_PT_BR_4MILHAR: " + df.format(1234567890.12235));

        // Note: Recebe uma instancia de DecimalFormat passando no construtor o PADRAO E o LOCALE dos Simbolos
        df = new DecimalFormat(padrao4, dfs);
        System.out.println("VALOR_FORMATO_PT_BR_CASAS_OBRIGATORIAS: " + df.format(1234567890.1));

        // Note: Recebe uma instancia de DecimalFormat passando no construtor o PADRAO E o LOCALE dos Simbolos
        df = new DecimalFormat(padrao5, dfs);
        System.out.println("VALOR_FORMATO_PT_BR_MONETARIO: " + df.format(1234567890.12235));
    }
}
