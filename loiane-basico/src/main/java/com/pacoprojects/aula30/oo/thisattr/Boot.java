package com.pacoprojects.aula30.oo.thisattr;

import com.pacoprojects.aula30.oo.thisattr.model.ContaCorrente;

public class Boot {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(
                "123456",
                "365",
                "Gustavo",
                "Banco Bradesco",
                false,
                98000,
                0,
                1000000);

        System.out.println("O saldo é de " + contaCorrente.saldo);

    }
}
