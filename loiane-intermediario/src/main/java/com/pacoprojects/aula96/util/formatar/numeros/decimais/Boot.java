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


        DecimalFormat df = new DecimalFormat(padrao);
        //   df.applyPattern(padrao);
        System.out.println(df.format(1234567890.12235));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","BR"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        // df.setDecimalFormatSymbols(dfs);
        df = new DecimalFormat(padrao, dfs);
        System.out.println(df.format(1234567890.12235));

        df = new DecimalFormat(padrao3, dfs);
        System.out.println(df.format(1234567890.12235));

        df = new DecimalFormat(padrao4, dfs);
        System.out.println(df.format(1234567890.1));

        df = new DecimalFormat(padrao5, dfs);
        System.out.println(df.format(1234567890.12235));
    }
}
