package main.java.com.pacoprojects.aula56.enums.metodos.abstratos.model;

public class Pessoa {
    private TipoDocumento tipoDocumento;
    private String numero;

    public Pessoa() {
    }

    public Pessoa(TipoDocumento tipoDocumento, String numero) {
        this.tipoDocumento = tipoDocumento;
        this.numero = numero;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoDocumento=" + tipoDocumento +
                ", numero='" + numero + '\'' +
                '}';
    }
}
