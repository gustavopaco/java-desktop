package main.java.com.pacoprojects.aula83.strings.metodos.builderbuffer;

public class Boot {
    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};
        String alfabeto = "";

        // Má prática
        for (String letra : letras) {
            alfabeto += letra;
        }

        System.out.println(alfabeto);

        // Note: Thread Safe -> Utilizado no dia a dia para concatenar N strings, e quando precisamos trabalhar com Thread Sincronizadas para nao perder a referencia
        StringBuffer buffer = new StringBuffer();
        for (String letra : letras) {
            buffer.append(letra);
        }
        System.out.println(buffer);
        System.out.println(buffer.reverse());

        // Note: Thread Unsafe -> Utilizado no dia a dia para concatenar N strings
        StringBuilder builder = new StringBuilder();
        for (String letra : letras) {
            builder.append(letra);
        }
        System.out.println(builder);
        System.out.println(builder.reverse());
    }
}
