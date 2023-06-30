package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra");
        char letraDigitada = scanner.next().charAt(0);
        letraDigitada = Character.toLowerCase(letraDigitada);
        if (letraDigitada == 'a' || letraDigitada == 'e' || letraDigitada == 'i' || letraDigitada == 'o' || letraDigitada == 'u') {
            System.out.println("Letra digitada é uma vogal.");
        } else if (letraDigitada > 'a' && letraDigitada <= 'z'){
            System.out.println("Letra digitada não é uma vogal");
        } else {
            System.out.println("Não é uma letra.");
        }
    }
}
