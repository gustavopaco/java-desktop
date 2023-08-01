package main.java.com.pacoprojects.exercicios.lista.restaurante;

import main.java.com.pacoprojects.exercicios.lista.restaurante.model.StatusAtendimento;
import main.java.com.pacoprojects.exercicios.lista.restaurante.model.ThreadRestaurante;

import java.util.Scanner;

public class Boot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhas = 0;
        boolean numSenhaValido = false;
        while (!numSenhaValido) {
            System.out.println("Qual o número de senhas geradas para atendimento?");
            String num = scanner.nextLine();

            try {
                senhas = Integer.parseInt(num);
                if (senhas > 0) {
                    numSenhaValido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Número de senhas inválido.");
                e.printStackTrace();
            }
        }

        ThreadRestaurante thread = new ThreadRestaurante("#1", senhas);

//        int atendimento = 0;
//        while (atendimento < thread.getNumeroAtendimentos()) {
//            System.out.println(thread.getStatusAtendimento());
//            thread.esperarMudarStatusAtendimento();
//            System.out.println("Atendimento " + atendimento);
//        }
//        thread.fecharRestaurante();

//        for (int i = 0; i < 8; i++) {
//            System.out.println(thread.getStatusAtendimento());
//            thread.esperarMudarStatusAtendimento();
//        }
//        thread.fecharRestaurante();
    }
}
