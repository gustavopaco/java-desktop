package main.java.com.pacoprojects.com.exercicios.lista.exercicio06.model;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato() {
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;

        if (getNome() != null ? !getNome().equals(contato.getNome()) : contato.getNome() != null) return false;
        if (getTelefone() != null ? !getTelefone().equals(contato.getTelefone()) : contato.getTelefone() != null)
            return false;
        return getEmail() != null ? getEmail().equals(contato.getEmail()) : contato.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getTelefone() != null ? getTelefone().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }
}
