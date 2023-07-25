package main.java.com.pacoprojects.aula55.enums.valuevalueof;

import main.java.com.pacoprojects.aula54.enums.construtores.metodos.model.DiaSemana;

public class BootValueOf {
    public static void main(String[] args) {
        // Note: Com esse Método podemos receber uma String e verificar se a String é um tipo de enumerador da classe em questao, utiliando a superclasse Enum.valueOf(), caso contrario irá lançar uma exception IllegalArgumentException. Útil quando não sabemos o valor do Enum que iremos receber.
        DiaSemana diaSemana = Enum.valueOf(DiaSemana.class, "DOMINGO");
        System.out.println(diaSemana);
    }
}
