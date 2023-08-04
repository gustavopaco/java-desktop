package com.pacoprojects.aula46.oo.interfacexheranca.model;

public interface SqlDML {
    void insert(String query);
    void update(String query);
    void select(String query);
    void delete(String query);
}
