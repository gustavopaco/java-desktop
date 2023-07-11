package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        System.out.println("Sistema para descobrir quem é o mais alto, o mais baixo, o mais gordo e o mais magro. A partir dos campos de entrada, codigo do cliente, altura e peso. Para finalizar a entrada de mais pessoas, o cliente deve inserir 0 no campo de codigo de cliente.");
        System.out.println("Ao encerrar o sistema. Deve ser informado o codigo do cliente e a altura mais alto e do mais baixo. Tambem o mais magro e o mais gordo. Alem disso a media das alturas e tambem a media dos pesos dos clientes. ");
        Scanner scanner = new Scanner(System.in);
        double alturaMaisBaixo = Integer.MAX_VALUE;
        double alturaMaisAlto = Integer.MIN_VALUE;
        double pesoMaisMagro = Integer.MAX_VALUE;
        double pesoMaisGordo = Integer.MIN_VALUE;
        double mediaAltura = 0;
        double mediaPeso = 0;
        int codigoMaisBaixo = 0;
        int codigoMaisAlto = 0;
        int codigoPesoMaisMagro = 0;
        int codigoPesoMaisGordo = 0;
        int quantidadeClientes = 0;
        while (true) {

            System.out.println("Informe o código do cliente ou 0 para finalizar: ");
            int codigoCliente = scanner.nextInt();

            if (codigoCliente == 0) {
                break;
            } else {

                System.out.println("Informe a altura do cliente: ");
                double alturaCliente = scanner.nextDouble();

                mediaAltura += alturaCliente;
                quantidadeClientes++;

                if (alturaCliente > alturaMaisAlto) {
                    alturaMaisAlto = alturaCliente;
                    codigoMaisAlto = codigoCliente;
                }

                if (alturaCliente < alturaMaisBaixo) {
                    alturaMaisBaixo = alturaCliente;
                    codigoMaisBaixo = codigoCliente;
                }

                System.out.println("Informe o Peso do cliente: ");
                double pesoCliente = scanner.nextDouble();

                mediaPeso += pesoCliente;

                if (pesoCliente > pesoMaisGordo) {
                    pesoMaisGordo = pesoCliente;
                    codigoPesoMaisGordo = codigoCliente;
                }

                if (pesoCliente < pesoMaisMagro) {
                    pesoMaisMagro = pesoCliente;
                    codigoPesoMaisMagro = codigoCliente;
                }
            }
        }

        mediaAltura = mediaAltura / quantidadeClientes;
        mediaPeso = mediaPeso / quantidadeClientes;

        System.out.println("################################################");
        System.out.println("RESULTADO DO SENSO: ");
        System.out.printf("Cliente com código %d é o cliente mais BAIXO da academia com %.2fm de altura.\n", codigoMaisBaixo, alturaMaisBaixo);
        System.out.printf("Cliente com código %d é o cliente mais ALTO da academia com %.2fm de altura.\n", codigoMaisAlto, alturaMaisAlto);
        System.out.printf("Cliente com código %d é o cliente mais MAGRO da academia com %.2fkg.\n", codigoPesoMaisMagro, pesoMaisMagro);
        System.out.printf("Cliente com código %d é o cliente mais GORDO da academia com %.2fkg.\n", codigoPesoMaisGordo, pesoMaisGordo);
        System.out.println("---------------------------------------------------");
        System.out.printf("Média de peso da academia: %.2fkg\n", mediaPeso);
        System.out.printf("Média de altura da academia: %.2fm\n", mediaAltura);
    }
}
