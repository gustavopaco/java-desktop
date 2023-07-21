package com.pacoprojects.exercicios.lista.aula36;

import com.pacoprojects.exercicios.lista.aula36.model.Agenda;
import com.pacoprojects.exercicios.lista.aula36.model.Contato;
import com.pacoprojects.exercicios.lista.aula36.model.Telefone;
import com.pacoprojects.exercicios.lista.aula36.model.TipoTelefone;

import java.util.Scanner;

public class BootAgenda {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.setNome(input("Informe o nome da agenda:"));

        for (int i = 0; i < 3; i++) {
            Contato contato = new Contato();
            contato.setNome(input("Nome do contato " + (i + 1) + ":"));
            contato.setEmail(input("E-mail do contato " + (i + 1) + ":"));

            Telefone telefone = new Telefone();

            telefone.setTipoTelefone(inputTipoTelefone());
            telefone.setDdd(input("DDD:"));
            telefone.setNumero(input("Número do telefone:"));

            contato.getTelefones().add(telefone);
            agenda.getContatos().add(contato);
        }
        imprimirDados(agenda);
    }

    private static String input(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    private static TipoTelefone inputTipoTelefone() {
        boolean isTipoTelefoneValido = false;
        TipoTelefone tipo = null;

        while (!isTipoTelefoneValido) {
            String tipoTelefone = input("Tipo do telefone: CL -> Celular | T -> Trabalho | C -> Casa");
            switch (tipoTelefone) {
                case "CL" -> {
                    isTipoTelefoneValido = true;
                    tipo = TipoTelefone.CELULAR;
                }
                case "T" -> {
                    isTipoTelefoneValido = true;
                    tipo = TipoTelefone.TRABALHO;
                }
                case "C" -> {
                    isTipoTelefoneValido = true;
                    tipo = TipoTelefone.CASA;
                }
            }
        }
        return tipo;
    }

    private static void imprimirDados(Agenda agenda) {
        System.out.println();
        System.out.println("-----------");
        System.out.println("Nome da Agenda: " + agenda.getNome());
        for (int i = 0; i < agenda.getContatos().size(); i++) {
            agenda.imprimirDadosContatos(i);
        }
    }
}
