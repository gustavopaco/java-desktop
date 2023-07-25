package main.java.com.pacoprojects.aula54.enums.construtores.metodos;

import main.java.com.pacoprojects.aula54.enums.construtores.metodos.model.Data;
import main.java.com.pacoprojects.aula54.enums.construtores.metodos.model.DiaSemana;

public class Boot {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(dia + " - " + dia.getValor());

        Data data = new Data(2,8,1989,dia);
    }
}
