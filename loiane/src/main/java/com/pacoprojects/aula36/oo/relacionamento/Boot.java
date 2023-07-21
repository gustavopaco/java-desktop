package com.pacoprojects.aula36.oo.relacionamento;

import com.pacoprojects.aula36.oo.relacionamento.model.Contato;
import com.pacoprojects.aula36.oo.relacionamento.model.Endereco;
import com.pacoprojects.aula36.oo.relacionamento.model.Telefone;

public class Boot {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Fulano");

        Endereco endereco = new Endereco();
        endereco.setCep("30590-253");
        endereco.setRua("Av. Amazonas");
        endereco.setBairro("Betania");
        endereco.setComplemento("n/a");
        endereco.setNumero("500");
        endereco.setCidade("Belo Horizonte");
        endereco.setEstado("Minas Gerais");
        endereco.setPais("Brasil");

        Telefone telefone = new Telefone();
        telefone.setDdd("31");
        telefone.setTipo("Celular");
        telefone.setNumero("993039064");

        contato.getTelefones().add(telefone);

        System.out.println(contato.getNome());

        if (contato != null) {
            if (contato.getEndereco() != null) {
                System.out.println(contato.getEndereco().getCidade());
            }

            if (!contato.getTelefones().isEmpty()) {
                contato.getTelefones().forEach(telefone1 -> System.out.println(telefone1.getNumero()));
            }
        }
    }
}
