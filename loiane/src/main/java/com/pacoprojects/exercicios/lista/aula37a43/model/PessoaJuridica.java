package com.pacoprojects.exercicios.lista.aula37a43.model;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaJuridica that)) return false;
        if (!super.equals(o)) return false;

        return getCnpj().equals(that.getCnpj());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCnpj().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }

    @Override
    public void calcularImpostoRenda(double rendaBruta) {
        double valorImposto = obterValorImposto(rendaBruta);
        imprimirValorImposto(valorImposto);
    }

    private double obterValorImposto(double rendaBruta) {
        return rendaBruta * (0.10);
    }

    private void imprimirValorImposto(double valor) {
        System.out.println("A empresa " + super.getNome() + " de CNPJ: " + this.cnpj + "\nDeverá pagar um imposto no valor de R$ " + String.format("%.2f",valor));
    }
}
