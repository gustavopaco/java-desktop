package com.pacoprojects.aula46.oo.interfacexheranca.model;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
    void abrirConexao();
    void fecharConexao();
}
