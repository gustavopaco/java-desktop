package main.java.com.pacoprojects.com.exercicios.pilha.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FuncoesUteis {
    public static boolean isPar(int valor) {
        return valor % 2 == 0;
    }

    public static int lerValorInt(String mensagem, Scanner scanner) {
        boolean valorValido = false;
        String valor;
        int valorNum = 0;
        while (!valorValido) {
            valor = lerValorString(mensagem, scanner);
            try {
                valorNum = Integer.parseInt(valor);
                valorValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, digite um numero.");
            }
        }
        return valorNum;
    }

    public static String lerValorString(String mensagem, Scanner scanner) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    public static LocalDate lerValorData(String mensagem, Scanner scanner) {
        boolean isValorValido = false;
        String dataLancamento;
        LocalDate localDate = LocalDate.now();
        while (!isValorValido) {
            System.out.println(mensagem);
            dataLancamento = scanner.nextLine();
            try {
                localDate = LocalDate.parse(dataLancamento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                isValorValido = true;
            } catch (Exception e) {
                System.out.println("Data inválida, informe um ano válido.");
            }
        }
        return localDate;
    }
}
