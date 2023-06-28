package com.pacoprojects.aula05.tipos.primitivos;

public class VariaveisChar {
    public static void main(String[] args) {
//        char o = 'o';
        char o = 111;
//        char i = 'i';
        char i = 105;
        char interrogacao = 0x00E1; // valor '?'

        // Imprimir usando UTF-8


        System.out.println("" + o + i + interrogacao);
        System.out.printf(String.format("%c%c%c", o, i, interrogacao));
    }
}
