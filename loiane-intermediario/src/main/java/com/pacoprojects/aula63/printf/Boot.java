package main.java.com.pacoprojects.aula63.printf;

public class Boot {
    public static void main(String[] args) {
        String world = "World";
        char caracter = 'c';
        int valor = 123456789;
        int valor2 = -123456789;
        double valorDecimal = 1.665;
        String olaMundo = " Ola Mundo.";

        // %s -> formata para uma STRING
        System.out.printf("Hello %s", world);
        System.out.println();
        // %S -> formata para uma STRING MAIÚSCULO
        System.out.printf("Hello %S", world);
        System.out.println();

        // %20s Formata para uma STRING de 20 CARACTERES com ALINHAMENTO A DIREITA
        System.out.printf("%20s", olaMundo);
        System.out.println();

        // %-20s Formata para uma STRING de 20 CARACTERES com ALINHAMENTO A ESQUERDA
        System.out.printf("%-20s", olaMundo);
        System.out.println();

        // %c -> formata para um CHAR
        System.out.printf("%c", caracter);
        System.out.println();

        // %S -> formata para uma CHAR MAIÚSCULO
        System.out.printf("%C", caracter);
        System.out.println();

        // %n QUEBRA DE LINHA
        System.out.printf("%n");

        // %d Formata valor INTEIRO
        System.out.printf("%d", valor);
        System.out.println();

        // %d Formata valor INTEIRO FORCA IMPRESSAO DE SINAL POSITIVO OU NEGATIVO
        System.out.printf("%+d", valor);
        System.out.println();

        // %d Formata valor INTEIRO NEGATIVO PARA MOSTRAR SINAL
        System.out.printf("% d", valor2);
        System.out.println();

        // %d Formata valor INTEIRO COM 15 CASAS COMPLETANDO COM 0
        System.out.printf("%+015d", valor);
        System.out.println();

        // %d Formata valor INTEIRO COM CASAS DE MILHAR POR ','
        System.out.printf("%,d", valor);
        System.out.println();

        // %f Formata tipo DECIMAL
        System.out.printf("%f", valorDecimal);
        System.out.println();

        // %f Formata tipo DECIMAL COM PRECISAO DE 2 CASAS DECIMAIS
        System.out.printf("%.2f", valorDecimal);
        System.out.println();

        // %f Formata tipo DECIMAL COM PRECISAO DE 2 CASAS DECIMAIS COM 10 DIGITOS NO MAXIMO
        System.out.printf("R$%10.2f", valorDecimal);
        System.out.println();

        imprimeTeste();
    }
    private static void imprimeTeste() {
        double[] precos = {10000, 123.56, 7864.5565, 1, 4.9659841};
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %03d: total de R$%,10.2f%n", "Item", i, precos[i]);
        }
    }
}
