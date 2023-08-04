package com.pacoprojects.exercicios.lista.aula37a43;

import com.pacoprojects.exercicios.lista.aula37a43.model.PessoaFisica;
import com.pacoprojects.exercicios.lista.aula37a43.model.PessoaJuridica;

import java.util.Scanner;

public class BootImpostoDeRenda {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Imposto de renda");
        for (int i = 0; i < 5; i++) {
            String tipoPessoa = getTipoPessoa();
            if (isTipoPessoaJuridica(tipoPessoa)) {
                PessoaJuridica juridica = new PessoaJuridica();
                juridica.setNome(input("Informe o Nome Fantasia:"));
                juridica.setCnpj(input("Informe o CNPJ:"));
                juridica.calcularImpostoRenda(inputRendaBruta("Informe o rendimento bruto: "));
            } else {
                PessoaFisica fisica = new PessoaFisica();
                fisica.setNome(input("Informe o Nome:"));
                fisica.setCpf(input("Informe o CPF:"));
                fisica.calcularImpostoRenda(inputRendaBruta("Informe o rendimento bruto: "));
            }
        }
    }

    private static String input(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    private static double inputRendaBruta(String mensagem) {
        System.out.println(mensagem);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    private static String getTipoPessoa() {
        boolean isValidoTipoPessoa = false;
        String tipoPessoa = "";
        while (!isValidoTipoPessoa) {
            tipoPessoa = input("Você é: F -> Física ou PJ -> Jurídica ?");
            if (tipoPessoa.equalsIgnoreCase("F") || tipoPessoa.equalsIgnoreCase("PJ")) {
                isValidoTipoPessoa = true;
            }
        }
        return tipoPessoa;
    }

    private static boolean isTipoPessoaJuridica(String tipo) {
        if (tipo.equalsIgnoreCase("PJ")) {
            return true;
        }
        return false;
    }
}
