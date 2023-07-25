package main.java.com.pacoprojects.exercicios.lista.aula56.model;

public enum Operacoes {
    SOMAR('+') {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRAIR('-') {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICAR('*') {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVIDIR('/') {
        @Override
        public double executarOperacao(double x, double y) throws DivisaoPorZero {
            if (y == 0) {
                throw new DivisaoPorZero(x,y);
            }
            return x / y;
        }
    };
    private char valor;

    public abstract double executarOperacao(double x, double y) throws DivisaoPorZero;

    Operacoes(char valor) {
        this.valor = valor;
    }

    public char getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.valueOf(this.valor);
    }
}
