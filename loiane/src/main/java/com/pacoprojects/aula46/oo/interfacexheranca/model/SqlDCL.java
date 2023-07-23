package com.pacoprojects.aula46.oo.interfacexheranca.model;

public interface SqlDCL {
    void grant(String access);
    void revoke(String access);
}
