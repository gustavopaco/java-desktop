package com.pacoprojects.exercicios.lista.aula20;

import java.util.Scanner;

public class Exercicio5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[][][][] compromissos = new String[12][30][8][1];

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("Agenda de compromissos: ");
            System.out.println("'1' - Criar um novo compromisso");
            System.out.println("'2' - Consultar um compromisso");
            System.out.println("'0' - Sair do sistema");
            System.out.println("----------------------------------");
            int criarConsultar = scanner.nextInt();

            if (criarConsultar == 1 || criarConsultar == 2) {

                String mesEscolhido = criarConsultarCompromissoMes();
                if (mesEscolhido.equalsIgnoreCase("v")) {
                    continue;
                }
                if (mesEscolhido.equalsIgnoreCase("s")) {
                    break;
                }

                String diaEscolhido = criarConsultarCompromissoDia();
                if (diaEscolhido.equalsIgnoreCase("v")) {
                    continue;
                }
                if (diaEscolhido.equalsIgnoreCase("s")) {
                    break;
                }

                String horaEscolhida = criarConsultarCompromissoHora();
                if (horaEscolhida.equalsIgnoreCase("v")) {
                    continue;
                }
                if (horaEscolhida.equalsIgnoreCase("s")) {
                    break;
                }

                if (criarConsultar == 1) {
                    String detalhe = criarConsultarCompromissoDetalhe();
                    if (detalhe.equalsIgnoreCase("v")) {
                        continue;
                    }
                    if (detalhe.equalsIgnoreCase("s")) {
                        break;
                    }

                    compromissos[Integer.parseInt(mesEscolhido) - 1][Integer.parseInt(diaEscolhido) - 1][verificarHoraEscolhida(Integer.parseInt(horaEscolhida))][0] = detalhe;
                    System.out.println("Compromisso adicionado!");

                } else {
                    System.out.println("O compromisso do mes " + mesEscolhido + " do dia " + diaEscolhido + " e da hora " + horaEscolhida + " é: \n" + compromissos[Integer.parseInt(mesEscolhido) - 1][Integer.parseInt(diaEscolhido) - 1][verificarHoraEscolhida(Integer.parseInt(horaEscolhida))][0]);
                }

                if (reiniciarSistema().equalsIgnoreCase("n")) {
                    System.out.println("Sistema encerrado...");
                    break;
                }

            } else {
                System.out.println("Sistema encerrado.");
                break;
            }
        }
    }

    private static String criarConsultarCompromissoMes() {
        System.out.println("----------------------------------");
        System.out.println("Dia do Compromisso");
        System.out.println("'1-12' - Informe um mes: ");
        System.out.println("  'v'  - Voltar ao menu anterior");
        System.out.println("  's'  - Para sair do sistema");
        return scanner.next();
    }

    private static String criarConsultarCompromissoDia() {
        System.out.println("----------------------------------");
        System.out.println("Dia do Compromisso");
        System.out.println("'1-30' - Informe um dia do mes: ");
        System.out.println("  'v'  - Voltar ao menu anterior");
        System.out.println("  's'  - Para sair do sistema");
        return scanner.next();
    }

    private static String criarConsultarCompromissoHora() {
        System.out.println("----------------------------------");
        System.out.println("Hora do Compromisso");
        System.out.println("'0 as 8' - Informe a hora do compromisso");
        System.out.println("  'v'  - Para voltar ao menu inicial");
        System.out.println("  's'  - Para sair do sistema");
        return scanner.next();
    }

    private static String criarConsultarCompromissoDetalhe() {
        System.out.println("----------------------------------");
        System.out.println("Detalhe do Compromisso");
        System.out.println("Informe uma descricao do compromisso: ");
        System.out.println("  'v'  - Para voltar ao menu inicial");
        System.out.println("  's'  - Para sair do sistema");
        scanner.nextLine();
        String detalhe = scanner.nextLine();
        System.out.println("Detalhe eh: " + detalhe);
        return detalhe;
    }

    private static String reiniciarSistema() {
        System.out.println("----------------------------------");
        System.out.println("Reiniciar o sistema? ");
        System.out.println("'S'  - Sim");
        System.out.println("'N'  - Não");
        return scanner.next();
    }

    private static Integer verificarHoraEscolhida(Integer hora) {
        return hora == 8 ? 7 : hora;
    }
}
