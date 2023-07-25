package main.java.com.pacoprojects.exercicios.lista.aula56.model;

public class DivisaoPorZero extends Exception {
    public DivisaoPorZero(double num1, double num2) {
        super("Não é possível realizar a divisão de " + num1 + " / " + num2 + ", pois divisão por ZERO nao existe." );
    }
}
