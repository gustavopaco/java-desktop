package main.java.com.pacoprojects.aula86.util.date;

import java.util.Date;

public class Boot {
    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        // Note: getTime() -> Retorna a quantidade em milissegundos desde 1 de Janeiro de 1970 ate a Data de hoje
        System.out.println(hoje.getTime());

        // Note: date() -> Retorna o dia do mes
        System.out.println(hoje.getDate());
    }
}
