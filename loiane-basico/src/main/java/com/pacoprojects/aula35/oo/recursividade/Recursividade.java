package com.pacoprojects.aula35.oo.recursividade;

import java.util.Scanner;

public class Recursividade {
    static int resultado = 1;

    public static void main(String[] args) {
        System.out.println("Entre com um numero inteiro positivo: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Fatorial de " + num + ":");
        System.out.print(num + "! ");
//        calcularFatorial(num);
        System.out.println(fatorial(num));

    }

    private static void calcularFatorial(int num) {
        if (num >= 1) {
            System.out.print(num + " x ");
            resultado *= num;
            num--;
        } else {
            System.out.print(num + " = ");
            resultado = 1;
        }
        if (num >= 1) {
            calcularFatorial(num);
        } else {
            System.out.print(resultado);
        }
    }

    private static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * (fatorial(num - 1));
    }
}
