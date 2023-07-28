package main.java.com.pacoprojects.aula58.autoboxing;

public class Boot {
    public static void main(String[] args) {
        // Autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 1000l;
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        Character b = 'b';


        // AutoUnboxing
        int num13 = num9;

        // Autoboxing em expressoes
        num13++;
        System.out.println(num9);

        // Auto unboxing num13
        Integer num14 = num13 / num9;

        // Mau uso pois so estamos tratando o uso de variaveis do tipo primitiva e nao nulas ou seja poderia usar o "double" tipo primitivo ao inves de usar a classe double
        Double a,c,d;
        a = 10.0;
        c = 12.2;
        d = 4.7;

        Double media = (a + c + d) / 3;
        System.out.println(media);
    }
}
