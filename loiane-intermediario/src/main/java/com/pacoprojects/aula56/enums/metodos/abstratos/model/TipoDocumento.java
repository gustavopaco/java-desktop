package main.java.com.pacoprojects.aula56.enums.metodos.abstratos.model;

public enum TipoDocumento {
    CPF {
        @Override
        public String geraNumeroCpfCNpj() {
            return GeraCpfCnpj.cpf();
        }
    },
    CNPJ {
        @Override
        public String geraNumeroCpfCNpj() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumeroCpfCNpj();
}
