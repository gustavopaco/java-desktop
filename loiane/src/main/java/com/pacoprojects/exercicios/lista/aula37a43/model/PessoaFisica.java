package com.pacoprojects.exercicios.lista.aula37a43.model;

public class PessoaFisica extends Contribuinte{
    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaFisica that)) return false;
        if (!super.equals(o)) return false;

        return getCpf().equals(that.getCpf());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCpf().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public void calcularImpostoRenda(double rendaBruta) {
        double valor = obterValorImposto(rendaBruta);
        imprimirValorImposto(valor);
    }

    private double obterValorImposto(double rendaBruta) {
        double valor = 0;
        if (rendaBruta <= 1400) {
            valor = 0;
        } else if (rendaBruta > 1400 && rendaBruta <= 2100) {
            valor = valorImposto(rendaBruta, 10, 100);
        } else if (rendaBruta > 2100 && rendaBruta <= 2800) {
            valor = valorImposto(rendaBruta, 15,270);
        }  else if (rendaBruta > 2800 && rendaBruta <= 3600) {
            valor = valorImposto(rendaBruta, 25, 500);
        } else {
            valor = valorImposto(rendaBruta, 30, 700);
        }
        return valor;
    }

    private double valorImposto(double rendaBruta, int porcentagemAliquota, double parcelaDeduzir) {
        return (rendaBruta * ((double) porcentagemAliquota / 100)) - parcelaDeduzir;
    }

    private void imprimirValorImposto(double valor) {
        if (valor == 0) {
            System.out.println("A pessoa de nome: " + super.getNome() + " de CPF " + this.cpf + "\n É ISENTA do imposto de renda.");
        } else {
            System.out.println("A pessoa de nome: " + super.getNome() + " de CPF "  + this.cpf + " deve pagar R$ " + String.format("%.2f de imposto de renda.", valor));
        }
    }
}
