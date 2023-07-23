package com.pacoprojects.aula46.oo.interfacexheranca.model;

public interface SqlDDL {
    void create(String query);
    void alter(String query);
    void drop(String query);
}
