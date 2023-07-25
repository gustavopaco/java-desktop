package main.java.com.pacoprojects.aula54.enums.construtores.metodos.model;

public class Formulario {
    private String nome;
    private String cpf;
    private Genero genero;

    enum Genero {
        FEMININO('F'), MASCULINO('M');
        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }

        public char getValor() {
            return valor;
        }
    }
}
