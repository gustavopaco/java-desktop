package com.pacoprojects.aula51.exception.custom;

public class DivisaoNaoExata extends Exception {
    private int num;
    private int denominador;

        // Note: Podemos passar a mensagem diretamente no construtor da classe custom  (como parâmetro ou setando diretamente na superclasse) e assim podemos obter a mensagem com o método getMessage()
    public DivisaoNaoExata(int num, int denominador) {
        super("Resultado X de " + num + " / " + denominador + " não é um inteiro");
        this.num = num;
        this.denominador = denominador;
    }

        // Note: Também É possivel sobrescrever o metodo getMessage() para passar uma mensagem mais amigavel
//    @Override
//    public String getMessage() {
//        return "Resultado de " + num + " / " + denominador + " não é um inteiro";
//    }

        // Note: OU podemos sobrescrever o método toString() da exception para colocar uma mensagem mais amigavel
    //    @Override
//    public String toString() {
//        return "Resultado de " + num + " / " + denominador + " não é um inteiro";
//    }
}
