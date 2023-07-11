package com.pacoprojects.aula12.breakcontinue;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        int numeroEscolhido = scanner.nextInt();
        System.out.println("Entre com um limite: ");
        int limite = scanner.nextInt();

        for (int i = numeroEscolhido; i <= limite; i++) {

            if ((i % 7) == 0) {
                System.out.println("Valor encontrado divisivel por 7 foi = " + i);
                break;
            }
        }

        for (int i = numeroEscolhido; i <= limite; i++) {

            if ((i % 11) == 0) {
                System.out.println("Valor encontrado divisivel por 11 foi = " + i);
                continue;
            }

            System.out.println(i);
        }
    }
}
