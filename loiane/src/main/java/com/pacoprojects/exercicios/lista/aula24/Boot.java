package com.pacoprojects.exercicios.lista.aula24;

import com.pacoprojects.exercicios.lista.aula24.model.*;

import java.time.LocalDateTime;
import java.util.List;

public class Boot {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.cor = "Amarela";
        TipoLampada abajur = new TipoLampada();
        abajur.nome = "Abajur";
        TipoLampada lampeao = new TipoLampada();
        lampeao.nome = "Lampeão";
        lampada.tipos.add(abajur);
        lampada.tipos.add(lampeao);
        lampada.valor = 12;

        //---

        Livro livro = new Livro();
        livro.nome = "Java para iniciantes";
        livro.anoLancamento = 2020;
        livro.quantidadePaginas = 900;
        CategoriaLivro categoriaLivro = new CategoriaLivro();
        categoriaLivro.nome = "Suspense";
        livro.categoria = categoriaLivro;

        // --

        LivroLivraria livroLivraria = new LivroLivraria();
        livroLivraria.nome = "Senhor dos aneis";
        livroLivraria.autor = "Ciclano";
        livroLivraria.quantidadePaginas = 5000;
        CategoriaLivro categoriaLivro2 = new CategoriaLivro();
        categoriaLivro2.nome = "Aventura/Fantasia";
        livroLivraria.categoria = categoriaLivro2;
        livroLivraria.valor = 500;

        // --

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.nome = "Spring boot";
        livroBiblioteca.autor = "Beltrano";
        livroBiblioteca.quantidadePaginas = 3000;
        CategoriaLivro categoriaLivro1 = new CategoriaLivro();
        categoriaLivro1.nome = "Programação";
        livroBiblioteca.categoria = categoriaLivro1;
        livroBiblioteca.isEmprestado = true;

        EmprestimoLivro emprestimoLivro = new EmprestimoLivro();
        emprestimoLivro.dataEmprestimo = LocalDateTime.now();
        emprestimoLivro.dataDevolucao = emprestimoLivro.dataEmprestimo.plusDays(7);
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Gustavo";
        pessoa.cpf = "123.456.789-45";
        emprestimoLivro.pessoa = pessoa;
        emprestimoLivro.livroBiblioteca = livroBiblioteca;

        // --

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.agencia = "123456";
        contaBancaria.numero = "897456123-X";
        contaBancaria.agencia = "Banco do Brasil";
        contaBancaria.titular = "Fulano da Silva Sauro";
        contaBancaria.isEspecial = true;
        contaBancaria.limite = 9000;
        contaBancaria.saldo = 80000;

        // --

        Contato contato = new Contato();
        contato.nome = "José";
        contato.apelido = "Ciclano";
        contato.email = "jose@gmail.com";
        contato.descricao = "n/a";

        Endereco endereco = new Endereco();
        endereco.rua = "Rua qualquer";
        endereco.cep = "30590-253";
        endereco.bairro = "Betânia";
        endereco.numero = "200";
        endereco.complemento = "n/a";
        endereco.cidade = "Belo Horizonte";
        endereco.estado = "Minas Gerais";
        endereco.pais = "Brasil";
        contato.endereco = endereco;

        Telefone telefone = new Telefone();
        telefone.numero = "(31) 99303-9064";

        TipoTelefone tipoTelefone = new TipoTelefone();
        tipoTelefone.nome = "CELULAR";

        telefone.tipoTelefone = tipoTelefone;

        contato.telefones.add(telefone);

        Telefone telefone1 = new Telefone();
        telefone1.numero = "(33) 3278-9275";

        TipoTelefone tipoTelefone1 = new TipoTelefone();
        tipoTelefone1.nome = "RESIDENCIAL";

        telefone1.tipoTelefone = tipoTelefone1;

        contato.telefones.add(telefone1);
    }
}
