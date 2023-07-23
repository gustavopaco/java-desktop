package com.pacoprojects.aula50.exception.throwsstack;

import java.util.Scanner;

public class ExceptionThrows {
    public static void main(String[] args) {
        System.out.println("Entre com um numero: ");
        try {
            double num = lerNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception{
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }
}
