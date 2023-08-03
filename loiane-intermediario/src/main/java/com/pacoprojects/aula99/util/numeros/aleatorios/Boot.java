package main.java.com.pacoprojects.aula99.util.numeros.aleatorios;

import java.util.Random;

public class Boot {
    public static void main(String[] args) {

        System.out.println(Math.floor(Math.random() * 10));

        Random random = new Random();

        // Note: nextInt() -> Gera numero aleatorio do 0 ate o tamanho do INT
        System.out.println(random.nextInt());
        // Note: nextInt(VALOR) -> Gera numero aleatorio de 0 a 10
        System.out.println(random.nextInt(11));
    }
}
