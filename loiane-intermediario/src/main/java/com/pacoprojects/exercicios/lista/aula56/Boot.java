package main.java.com.pacoprojects.exercicios.lista.aula56;

import main.java.com.pacoprojects.exercicios.lista.aula56.model.DivisaoPorZero;
import main.java.com.pacoprojects.exercicios.lista.aula56.model.Operacoes;

import java.util.Scanner;

public class Boot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1 = obterValor(scanner, "Informe um número: ");
        double valor2 = obterValor(scanner, "Informe um outro número: ");
        for (Operacoes value : Operacoes.values()) {
            try {
                System.out.println("Executando Operação: " + value.name());
                System.out.print(valor1 + " " + value.getValor() + " " + valor2 + " = " + value.executarOperacao(valor1, valor2));
            } catch (DivisaoPorZero e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
            System.out.println("-------");
        }
    }
    private static double obterValor(Scanner scanner, String mensagem) {
        boolean valorValido = false;
        double numero = 0;
        while (!valorValido) {
            System.out.println(mensagem);
            String valor = scanner.nextLine();
            try {
                numero = Integer.parseInt(valor);
                valorValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Entre com um número.");
            }
        }
        return numero;
    }
}
