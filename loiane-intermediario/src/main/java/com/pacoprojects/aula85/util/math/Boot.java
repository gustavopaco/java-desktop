package main.java.com.pacoprojects.aula85.util.math;

public class Boot {
    public static void main(String[] args) {

        // Note: pow() -> POTÊNCIA 'N' elevado a 'n'
        System.out.println(Math.pow(2, 3));

        // Note: round() -> ARREDONDA para o numero mais próximo, nesse caso para CIMA
        System.out.println(Math.round(4.7));

        // Note: round() -> ARREDONDA para o numero mais próximo, nesse caso para BAIXO
        System.out.println(Math.round(4.4));

        // Note: ceil() -> ARREDONDA para CIMA, SEMPRE
        System.out.println(Math.ceil(4.7));

        // Note: ceil() -> ARREDONDA para CIMA, SEMPRE
        System.out.println(Math.ceil(4.4));

        // Note: floor() -> ARREDONDA para BAIXO, SEMPRE
        System.out.println(Math.floor(4.7));

        // Note: floor() -> ARREDONDA para BAIXO, SEMPRE
        System.out.println(Math.floor(4.4));

        // Note: random() -> Gera NÚMERO ALEATÓRIO, porem com varias casas decimais
        System.out.println(Math.random());

        // Note: round(random() * 10) -> Gera NÚMERO ALEATÓRIO, Inteiro de 0 a 10
        System.out.println(Math.round(Math.random() * 10));

        // Note: sin() -> Gera o SENO a partir de um angulo em RADIANOS.
        System.out.println(Math.sin(30));

        // Note: sin(toRadians()) -> Gera o SENO a partir de um angulo em GRAUS.
        System.out.println(Math.sin(Math.toRadians(30)));

        // Note: cos() -> Gera o Cosseno a partir de um angulo em RADIANOS.
        System.out.println(Math.cos(1));

        // Note: cos() -> Gera o Cosseno a partir de um angulo em GRAUS.
        System.out.println(Math.cos(Math.toRadians(1)));

        // Note: tan() -> Gera a TANGENTE a partir de um angulo em RADIANOS.
        System.out.println(Math.tan(45));

        // Note: tan() -> Gera a TANGENTE a partir de um angulo em GRAUS.
        System.out.println(Math.tan(Math.toRadians(45)));
    }
}
