package main.java.com.pacoprojects.aula57.wrappers;

public class Boot {
    public static void main(String[] args) {
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000l;
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 'a';

        // Note: Declaracao de model depreciadas
        //Short num7 = new Short((short) 1);
        //Byte num8 = new Byte((byte) 10);
        //Integer num9 = new Integer(100);
        //Long num10 = new Long(1000l);
        //Float num11 = new Float(3.5f);
        //Double num12 = new Double(3.5555);
        //Boolean flag2 = new Boolean(true);
        //Character b = new Character('b');

        // Note: NumberFormatException
        //Integer num13 = new Integer("10000hh");
        //Double num14 = new Double("3.5"); // No caso de usar PC portugues brasil

        Integer num13 = 10000;

        System.out.println(num13.doubleValue());
        System.out.println(num13.intValue());

        // Note: Pode lancar um NumberFormatException
        int num16 = Integer.parseInt("1000");
        double num17 = Double.parseDouble("3.5");

        System.out.println(num16);
        System.out.println(num17);

        Integer num18 = Integer.valueOf(10000);
        System.out.println(num18);

        System.out.println(num13.equals(num18));
    }
}
