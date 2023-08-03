package main.java.com.pacoprojects.aula96.util.formatar.numeros.numberformat;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Boot {
    public static void main(String[] args) {



        // ----------------------------------------------------------------------------------------------------------------------
        // Obs:  NUMERO BR vs USA
        // Obs:  Brasil, numero 1000 => 1.000,00
        // Obs:  USA, numero 1000 => 1,000.00

        // Note: Definindo novo Locale no sistema
        Locale en = new Locale("en","US");

        // Note: NumberFormat(LOCALE) -> PARA VALOR - Obtem uma instancia do NumberFormat a partir do Locale passado no parametro
        NumberFormat nf = NumberFormat.getInstance(en);

        // Note: format() -> Retorna uma String com VALOR FORMATADO a partir de um Numero, de acordo com o Locale configurado
        String num = nf.format(100.99);
        System.out.println("VALOR_FORMATADO_EN_US: " + num);

        // Note: Definindo novo Locale no sistema
        Locale br = new Locale("pt","BR");

        // Note: NumberFormat(LOCALE) -> PARA VALOR - Obtem uma instancia do NumberFormat a partir do Locale passado no parametro
        nf = NumberFormat.getInstance(br);

        // Note: format() -> Retorna uma String com VALOR FORMATADO a partir de um Numero, de acordo com o Locale configurado
        num = nf.format(100.99);
        System.out.println("VALOR_FORMATADO_PT_BR: " + num);



        // ----------------------------------------------------------------------------------------------------------------------
        // Obs: MOEDA BR vs USA
        // Obs: Brasil, moeda 1000 => R$ 1.000,00
        // Obs: USA, moeda 1000 => $ 1,000.00

        // Note: NumberFormat(LOCALE) -> PARA MOEDAS - Obtem uma instancia do NumberFormat partir do Locale passado no parametro
        NumberFormat moeda = NumberFormat.getCurrencyInstance(en);

        // Note: format() -> Retorna uma String com MOEDA FORMATADO a partir de um Numero, de acordo com o Locale configurado
        String valor = moeda.format(100.99);
        System.out.println("MOEDA_FORMATADO_EN_US: " + valor);

        // Obs:  FORMATO DA MOEDA
        // Note: getCurrency() -> Obtem uma instancia do Currency partir do Locale
        Currency currency = moeda.getCurrency();
        System.out.println("MOEDA_EN_US: " + currency);

        // Note: NumberFormat(LOCALE) -> PARA MOEDAS - Obtem uma instancia do NumberFormat partir do Locale passado no parametro
        moeda = NumberFormat.getCurrencyInstance(br);

        // Note: format() -> Retorna uma String com MOEDA FORMATADO a partir de um Numero, de acordo com o Locale configurado
        valor = moeda.format(100.99);
        System.out.println("MOEDA_FORMATADO_PT_BR: " + valor);

        // Note: getCurrency() -> Obtem uma instancia do Currency partir do Locale
        currency = moeda.getCurrency();
        System.out.println("MOEDA_PT_BR: " + currency);



        // ----------------------------------------------------------------------------------------------------------------------
        // Obs: PORCENTAGEM

        // Note: NumberFormat(LOCALE) -> PARA PORCENTAGEM - Obtem uma instancia do NumberFormat partir do Locale passado no parametro
        NumberFormat porcent = NumberFormat.getPercentInstance(en);

        // Note: setMinimumIntegerDigits() -> Define o minimo de numeros inteiros permitidos
        porcent.setMinimumIntegerDigits(4);
        // Note: setMaximumIntegerDigits() -> Define o maximo de numeros inteiros permitidos
        porcent.setMaximumIntegerDigits(5);

        // Note: setMinimumFractionDigits() -> Define o minimo de numeros inteiros permitidos
        porcent.setMinimumFractionDigits(1);
        // Note: setMaximumFractionDigits() -> Define o maximo de numeros inteiros permitidos
        porcent.setMaximumFractionDigits(2);

        // Note: format() -> Retorna uma String com PORCENTAGEM FORMATADA a partir de um Valor, de acordo com o Locale. Ja calcula X / 100.
        String porcentagem = porcent.format(99.98);     // Calcula -> 99.98% / 100
        System.out.println(porcentagem);

        porcent = NumberFormat.getPercentInstance(br);

        // Note: setMinimumIntegerDigits() -> Define o minimo de numeros inteiros permitidos
        porcent.setMinimumIntegerDigits(4);
        // Note: setMaximumIntegerDigits() -> Define o maximo de numeros inteiros permitidos
        porcent.setMaximumIntegerDigits(5);

        // Note: setMinimumFractionDigits() -> Define o minimo de numeros inteiros permitidos
        porcent.setMinimumFractionDigits(1);
        // Note: setMaximumFractionDigits() -> Define o maximo de numeros inteiros permitidos
        porcent.setMaximumFractionDigits(2);

        // Note: format() -> Retorna uma String com PORCENTAGEM FORMATADA a partir de um Valor, de acordo com o Locale. Ja calcula X / 100.
        porcentagem = porcent.format(99.98);            // Calcula -> 99.98% / 100
        System.out.println(porcentagem);



        // ----------------------------------------------------------------------------------------------------------------------
        // Obs: ARREDONDAMENTO

        // Note: NumberFormat.getInstance(LOCALE) -> Obtem uma instancia do NumberFormat partir do Locale passado no parametro
        NumberFormat arredondamento = NumberFormat.getInstance(en);

        // Note: setRoundingMode () -> Define a regra de arredondamento
        arredondamento.setRoundingMode(RoundingMode.UP);

        // Note: setMinimumFractionDigits() -> Necessario para ser formatado - Define o minimo de numeros inteiros permitidos
        arredondamento.setMinimumFractionDigits(0);
        // Note: setMinimumFractionDigits() -> Necessario para ser formatado - Define o minimo de numeros inteiros permitidos
        arredondamento.setMaximumFractionDigits(0);

        // Note: format() -> Retorna uma String com VALOR FORMATADO a partir de um Numero, de acordo com o Locale.
        String valorArredondamento = arredondamento.format(99.55);
        System.out.println(valorArredondamento);



        // ----------------------------------------------------------------------------------------------------------------------
        // Obs: PARSE

        try {
            // Note: NumberFormat.getInstance(LOCALE) -> Obtem uma instancia do NumberFormat partir do Locale passado no parametro. E parseando um valor de acordo com uma String. Pode Lancar Exception
            Number num3 = NumberFormat.getInstance(en).parse("100,00");
            System.out.println(num3.intValue());

            // Note: NumberFormat.getInstance(LOCALE) -> Obtem uma instancia do NumberFormat partir do Locale passado no parametro. E parseando um valor de acordo com uma String. Pode Lancar Exception
            num3 = NumberFormat.getInstance(br).parse("100.00");
            System.out.println(num3.intValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
