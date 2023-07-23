package com.pacoprojects.exercicios.lista.aula47a52;

import com.pacoprojects.exercicios.lista.aula47a52.model.*;

import java.util.Scanner;

public class Boot {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        boolean exit = false;
        while (!exit) {
            try {
                Thread.sleep(300);
                intro();
                int opcaoAgenda = obterOpcaoAgenda();
                if (opcaoAgenda == 1) {
                    String nomeContato = input("Informe o nome do contato:");
                    Contato contato = agenda.consultarContato(nomeContato).orElseThrow(() -> new ContatoNaoExisteException(nomeContato));
                    imprimirDadosContato(contato);
                } else if (opcaoAgenda == 2 && agenda.getContatos().size() > 2) {
                    throw new AgendaCheiaException();
                } else if (opcaoAgenda == 2) {
                    Contato contato = cadastrarContato();
                    agenda.adicionarContato(contato);
                } else {
                    break;
                }
                exit = sairSistema();
            } catch (ContatoNaoExisteException | AgendaCheiaException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (InterruptedException e) {
                System.out.println("Erro na Thread.");
                e.printStackTrace();
            }
        }
        System.out.println("Sistema encerrado.");


    }

    public static void intro() {
        System.out.println("AGENDA");
    }

    public static int obterOpcaoAgenda() {
        boolean valorValido = false;
        int opcaoEscolhida = -1;
        while (!valorValido) {
            System.out.println("'1' - Consultar contato da agenda");
            System.out.println("'2' - Adicionar um novo contato a agenda");
            System.out.println("'0' - Sair do sistema");
            try {
                opcaoEscolhida = scanner.nextInt();
                if (opcaoEscolhida == 0 || opcaoEscolhida == 1 || opcaoEscolhida == 2) {
                    valorValido = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Opção inválida, escolha entre ('0', '1' e '2').");
            }
            scanner.nextLine();
        }
        return opcaoEscolhida;
    }

    private static String input(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    private static Contato cadastrarContato() {
        Contato contato = new Contato();
        contato.setNome(input("Nome do contato:"));
        cadastrarNovoTelefone(contato);
        return contato;
    }

    private static void cadastrarNovoTelefone(Contato contato) {
        boolean continuar = true;
        while (continuar) {
            Telefone telefone = new Telefone();
            telefone.setNumero(input("Número de telefone:"));
            contato.adicionarTelefone(telefone);

            boolean opcaoValida = false;
            while (!opcaoValida) {
                String novo = input("Cadastrar outro telefone? \n'S' -> Sim  'N' -> Não");
                if (novo.equalsIgnoreCase("N")) {
                    opcaoValida = true;
                    continuar = false;
                } else if (novo.equalsIgnoreCase("S")) {
                    opcaoValida = true;
                } else {
                    System.out.println("Opção inválida, escolha entre ('S' e 'N').");
                }
            }
        }
    }

    private static void imprimirDadosContato(Contato contato) {
        System.out.println();
        System.out.println("-----------");
        System.out.println("Contato Encontrado!");
        System.out.println(contato);
        System.out.println();
    }

    private static boolean sairSistema() {
        boolean exit = false;
        boolean opcaoValida = false;
        while (!opcaoValida) {
            String sair = input("Sair do sistema? \n'S' -> Sim  'N' -> Não");
            if (sair.equalsIgnoreCase("S")) {
                opcaoValida = true;
                exit = true;
            } else if (sair.equalsIgnoreCase("N")) {
                opcaoValida = true;
            } else {
                System.out.println("Opção inválida, escolha entre ('S' e 'N').");
            }
        }
        return exit;
    }
}
