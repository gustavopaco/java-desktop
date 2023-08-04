package com.pacoprojects.aula33.minhacalculadora;

import com.pacoprojects.aula33.minhacalculadora.model.MinhaCalculadora;

public class Boot {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();
        System.out.println(calc.soma(2, 8));
    }
}
