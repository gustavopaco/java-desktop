package main.java.com.pacoprojects.exercicios.lista.restaurante.model;

public enum StatusAtendimento {
    GERAR_SENHA(1000),
    AGUARDAR_ATENDIMENTO(3000),
    CHAMAR_SENHA(1000),
    REALIZAR_PEDIDO(2000),
    SERVIR_REFEICAO(4000),
    FECHAR_CONTA(1000),
    LIMPAR_MESA(2000);

    private final int tempoEspera;

    StatusAtendimento(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
