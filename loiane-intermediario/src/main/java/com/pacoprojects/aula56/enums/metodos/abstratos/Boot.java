package main.java.com.pacoprojects.aula56.enums.metodos.abstratos;

import main.java.com.pacoprojects.aula56.enums.metodos.abstratos.model.Pessoa;
import main.java.com.pacoprojects.aula56.enums.metodos.abstratos.model.TipoDocumento;

public class Boot {
    public static void main(String[] args) {
        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumero(pf.getTipoDocumento().geraNumeroCpfCNpj());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class,"CNPJ"));
        pj.setNumero(pj.getTipoDocumento().geraNumeroCpfCNpj());
        System.out.println(pj);
    }
}
