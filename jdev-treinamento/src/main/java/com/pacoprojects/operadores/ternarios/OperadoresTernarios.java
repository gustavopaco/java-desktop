package com.pacoprojects.operadores.ternarios;

public class OperadoresTernarios {

    public static void main(String[] args) {

        int n1 = 60;
        int n2 = 80;
        int n3 = 60;
        int n4 = 80;
        int media = 0;

        media = (n1 + n2 + n3 + n4) / 4;

        // Utilizando if/else
		if(media >= 70) {
			System.out.println("Aluno Aprovado: " + media);
		}else if(media >= 40 && media <= 69) {
			System.out.println("Aluno em Recuperacao:" + media);
		}else {
			System.out.println("Aluno Reprovado: " + media);
		}

        // Utilizando operador ternario
        String saidaResultado = media >= 70 ? "Aluno Aprovado"
                : media >= 40 && media <= 69 ? "Aluno em Recuperacao"
                : "Aluno Reprovado";

        System.out.println("Media: " + media + "\n" + saidaResultado);

    }
}
