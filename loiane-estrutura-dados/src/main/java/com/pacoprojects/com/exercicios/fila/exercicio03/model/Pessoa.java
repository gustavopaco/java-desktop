package main.java.com.pacoprojects.com.exercicios.fila.exercicio03.model;

public class Pessoa  implements Comparable<Pessoa> {
    private String nome;
    private CodAtendimento codAtendimento;

    public Pessoa() {
    }

    public Pessoa(String nome, CodAtendimento codAtendimento) {
        this.nome = nome;
        this.codAtendimento = codAtendimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", codAtendimento=" + codAtendimento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CodAtendimento getCodAtendimento() {
        return this.codAtendimento;
    }

    public void setCodAtendimento(CodAtendimento codAtendimento) {
        this.codAtendimento = codAtendimento;
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(this.codAtendimento.getPrioridade(), o.getCodAtendimento().getPrioridade());
    }
}
