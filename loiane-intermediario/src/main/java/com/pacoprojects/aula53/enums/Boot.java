package main.java.com.pacoprojects.aula53.enums;

public class Boot {
    public static void main(String[] args) {
        usandoConstantes();
        System.out.println();
        System.out.println("-----------");
        usandoEnums();
        System.out.println();
        System.out.println("-----------");
        usandoInterfaces();
    }

    private static void usandoConstantes() {
        int segunda = DiasSemanasConstantes.SEGUNDA;
        int terca = DiasSemanasConstantes.TERCA;
        int quarta = DiasSemanasConstantes.QUARTA;
        int quinta = DiasSemanasConstantes.QUINTA;
        int sexta = DiasSemanasConstantes.SEXTA;
        int sabado = DiasSemanasConstantes.SABADO;
        int domingo = DiasSemanasConstantes.DOMINGO;
        System.out.println("Teste utilizando constantes no java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void usandoEnums() {
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
        System.out.println("Teste utilizando ENUMS no java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void usandoInterfaces() {
        int segunda = DiaSemanaInterface.SEGUNDA;
        int terca = DiaSemanaInterface.TERCA;
        int quarta = DiaSemanaInterface.QUARTA;
        int quinta = DiaSemanaInterface.QUINTA;
        int sexta = DiaSemanaInterface.SEXTA;
        int sabado = DiaSemanaInterface.SABADO;
        int domingo = DiaSemanaInterface.DOMINGO;
        System.out.println("Teste utilizando Interfaces no java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
        }
    }

    private static void imprimeDiaSemana(DiaSemana diaSemana) {
        switch (diaSemana) {
            case SEGUNDA -> System.out.println("Segunda-feira");
            case TERCA -> System.out.println("Terça-feira");
            case QUARTA -> System.out.println("Quarta-feira");
            case QUINTA -> System.out.println("Quinta-feira");
            case SEXTA -> System.out.println("Sexta-feira");
            case SABADO -> System.out.println("Sábado");
            case DOMINGO -> System.out.println("Domingo");
        }
    }
}
