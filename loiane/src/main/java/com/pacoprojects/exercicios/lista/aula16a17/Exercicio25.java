package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que verifica a media de idade de N pessoas entre 0-25 | 26-60 ou 60+ e informa entre Jovem, Adulta ou Idosa");
        int contadorPessoa = 0;
        double resultado = 0;
        while (true) {
            System.out.println("Informe a idade da pessoa" + (contadorPessoa + 1));
            resultado += scanner.nextDouble();
            contadorPessoa++;

            System.out.println("Deseja continuar informando idade de pessoas? 'S' -> Sim, 'N' -> Não");
            char continuar = scanner.next().charAt(0);

            if (continuar == 'N' || continuar == 'n') {
                break;
            }
        }

        resultado = resultado / contadorPessoa;

        if (resultado < 60) {
            if (resultado >= 26) {
                System.out.println("A media da idade das pessoas foram: " + resultado + "\nDevido a essa media são consideradas: " + "Adultas");
            } else {
                System.out.println("A media da idade das pessoas foram: " + resultado + "\nDevido a essa media são consideradas: " + "Jovens");
            }
        } else {
            System.out.println("A media da idade das pessoas foram: " + resultado + "\nDevido a essa media são consideradas: " + "Idosas");
        }
    }
}
