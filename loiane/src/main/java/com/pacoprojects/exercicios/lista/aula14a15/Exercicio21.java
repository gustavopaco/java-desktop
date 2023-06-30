package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor do saque entre 10 e 600 reais, voce gostaria de sacar?");
        int valorSaque = scanner.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque deve ser entre 10 e 600 reais");
        } else {

            int notas100 = valorSaque / 100;
            int resto = valorSaque % 100;

            int notas50 = resto / 50;
            resto = resto % 50;

            int notas10 = resto / 10;
            resto = resto % 10;

            int notas5 = resto / 5;
            resto = resto % 5;

            int notas1 = resto;

            System.out.print("Você irá receber");
            if (notas100 > 0) {
                System.out.printf(", %d notas de 100", notas100);
            }
            if (notas50 > 0) {
                System.out.printf(", %d notas de 50", notas50);
            }
            if (notas10 > 0) {
                System.out.printf(", %d notas de 10", notas10);
            }
            if (notas5 > 0) {
                System.out.printf(", %d notas de 5", notas5);
            }
            if (notas1 > 0) {
                System.out.printf(", %d notas de 1", notas1);
            }
            System.out.println();


//            int notas100 = valorSaque / 100;
//            int notas50 = (valorSaque % 100) / 50;
//            int notas10 = (valorSaque % 100) / 10;
//            int notas5 = valorSaque % 10;
//            int notas1 = valorSaque % 10;
//
//            if (notas10 >= 5) {
//                notas10 = notas10 % 5;
//            }
//
//
//            if (notas5 >= 2) {
//                notas5 = 1;
//            }
//
//            if (notas1 >= 5) {
//                notas1 = notas1 % 5;
//            }

//            if (notas100 > 0) {
//                if (notas50 == 1) {
//                    if (notas10 > 0) {
//                        if (notas5 == 1) {
//                            if (notas1 > 0) {
//                                System.out.printf("Você irá receber %d notas de 100, %d notas de 50, %d notas de 10, %d notas de 5, %d notas de 1\n", notas100, notas50, notas10, notas5, notas1);
//                            } else {
//                                System.out.printf("Você irá receber %d notas de 100, %d notas de 50, %d notas de 10, %d notas de 5\n", notas100, notas50, notas10, notas5);
//                            }
//                        } else {
//                                System.out.printf("Você irá receber %d notas de 100, %d notas de 50, %d notas de 10\n", notas100, notas50, notas10);
//                        }
//                    } else {
//                                System.out.printf("Você irá receber %d notas de 100, %d notas de 50\n", notas100, notas50);
//                    }
//                } else {
//                                System.out.printf("Você irá receber %d notas de 100\n", notas100);
//                }
//            } else {
//                if (notas50 == 1) {
//                    if (notas10 > 0) {
//                        if (notas5 == 1) {
//                            if (notas1 > 0) {
//                                System.out.printf("Você irá receber %d notas de 50, %d notas de 10, %d notas de 5, %d notas de 1\n", notas50, notas10, notas5, notas1);
//                            } else {
//                                System.out.printf("Você irá receber %d notas de 50, %d notas de 10, %d notas de 5\n", notas50, notas10, notas5);
//                            }
//                        } else {
//                            System.out.printf("Você irá receber %d notas de 50, %d notas de 10\n", notas50, notas10);
//                        }
//                    } else {
//                        System.out.printf("Você irá receber %d notas de 50\n", notas50);
//                    }
//                } else {
//                    if (notas10 > 0) {
//                        if (notas5 == 1) {
//                            if (notas1 > 0) {
//                                System.out.printf("Você irá receber %d notas de 10, %d notas de 5, %d notas de 1\n",notas10 , notas5, notas1);
//                            } else {
//                                System.out.printf("Você irá receber %d notas de 10, %d notas de 5\n", notas10, notas5);
//                            }
//                        } else {
//                            System.out.printf("Você irá receber %d notas de 10\n", notas10);
//                        }
//                    } else {
//                        if (notas5 == 1) {
//                            if (notas1 > 0) {
//                                System.out.printf("Você irá receber %d notas de 5, %d notas de 1\n", notas5, notas1);
//                            } else {
//                                System.out.printf("Você irá receber %d notas de 5\n", notas5);
//                            }
//                        } else {
//                                System.out.printf("Você irá receber %d notas de 1\n", notas1);
//                        }
//                    }
//                }
//            }
        }
    }
}
