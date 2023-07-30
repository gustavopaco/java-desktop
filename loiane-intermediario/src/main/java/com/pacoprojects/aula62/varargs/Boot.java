package main.java.com.pacoprojects.aula62.varargs;

import java.util.Arrays;

public class Boot {
    public static void main(String[] args) {
        System.out.println(soma(2,3));
        System.out.println(soma(2,3,4));
        int[] vetor = {1,2,3,4,5};
        System.out.println(soma(vetor));
        System.out.println(soma(1,2,3,4,5,6));
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static int soma(int[] vetor) {
        return Arrays.stream(vetor).sum();
    }

    // Note: Em situacoes onde usamos o varArgs, se necessario passar parametros do mesmo tipo, deve ser declarado antes do varArgs pois somente assim o compilador ira saber que 'a' e 'b' sao parametros diferentes dos valores do 'vetorInteger'
    public static int soma(int a, Integer b, Integer... vetorInteger) {
        return Arrays.stream(vetorInteger).reduce(1, Integer::sum);
    }
}
