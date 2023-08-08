package main.java.com.pacoprojects.com.exercicios.fila.exercicio02.model;

public class Pessoa {
    private String nome;
    private TipoSenha tipoSenha;
    private Integer senha;

    public Pessoa () {
    }

    public Pessoa(String nome, TipoSenha tipoSenha, Integer senha) {
        this.nome = nome;
        this.tipoSenha = tipoSenha;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", tipoSenha=" + tipoSenha +
                ", senha=" + senha +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoSenha getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(TipoSenha tipoSenha) {
        this.tipoSenha = tipoSenha;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}
