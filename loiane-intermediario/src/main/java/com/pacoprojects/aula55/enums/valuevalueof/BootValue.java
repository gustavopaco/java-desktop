package main.java.com.pacoprojects.aula55.enums.valuevalueof;

import main.java.com.pacoprojects.aula54.enums.construtores.metodos.model.DiaSemana;

import java.util.Arrays;

public class BootValue {
    public static void main(String[] args) {
        // Note: Metodo value é utilizado para iterar todos os valores do ENUM como uma lista de enumeradores.
        DiaSemana[] diaSemanas = DiaSemana.values();
        for (int i = 0; i < diaSemanas.length; i++) {
            System.out.println(diaSemanas[i]);
        }

        System.out.println();
        System.out.println("--------------");
        for (DiaSemana diaSemana : diaSemanas) {
            System.out.println(diaSemana);
        }

        System.out.println();
        System.out.println("--------------");
        Arrays.stream(diaSemanas).forEach(System.out::println);
    }
}
