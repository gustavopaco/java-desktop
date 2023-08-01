package main.java.com.pacoprojects.aula77.strings.metodoschar;

import java.util.Arrays;

public class Boot {
    public static void main(String[] args) {
        String java = "Java";

        // Note: charAt() -> Método responsavel por retornar caractere da posicao i de um String.
        for (int i = 0; i < java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        char[] jav = new char[3];
        // Note: getChars() -> Método responsavel por fazer uma 'substring' de uma String e atribuir o valor para um vetor de char[]
        java.getChars(0, java.length() -1 , jav, 0);
        System.out.println(jav);

        // Seria o mesmo que isso
        for (int i = 0; i < 3; i++) {
            jav[i] = java.charAt(i);
        }
        System.out.println(jav);

        byte[] javBytes = new byte[3];
        // Note: getChars() -> Método responsavel por fazer uma 'substring' de uma String e atribuir o valor para um vetor de byte[]
        java.getBytes(0, java.length() -1, javBytes, 0);
        System.out.println(Arrays.toString(javBytes));

        // Note: toCharArray() -> Transforma uma String em um array de char[]
        char[] charArray = java.toCharArray();
        System.out.println(charArray);
    }
}
