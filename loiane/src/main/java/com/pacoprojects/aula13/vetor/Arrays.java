package com.pacoprojects.aula13.vetor;

public class Arrays {
    public static void main(String[] args) {

        double[] temperatura = new double[365];

        temperatura[0] = 30.2;
        temperatura[1] = 34.5;
        temperatura[2] = 28.6;
        temperatura[3] = 18.7;
        temperatura[4] = 22.1;

        System.out.println("Tamanho do Array: " + temperatura.length);

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] != 0)
                System.out.println("A temperatura do dia " + (i + 1) + " é: " + temperatura[i]);
        }

        int count = 0;
        for (double i : temperatura) {
            if (i != 0)
                System.out.println("A temperatura do dia " + (count + 1) + " é: " + i);

            count++;
        }
    }
}
