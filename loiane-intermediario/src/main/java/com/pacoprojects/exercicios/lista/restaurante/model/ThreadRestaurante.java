package main.java.com.pacoprojects.exercicios.lista.restaurante.model;

public class ThreadRestaurante implements Runnable {

    private String nomeThread;
    private StatusAtendimento statusAtendimento;
    private Thread thread;
    private int numeroAtendimentos;
    private int atendimentoAtual;
    private boolean fecharRestaurante;
    private boolean mudouStatus;

    public ThreadRestaurante(String nomeThread, int numeroAtendimentos) {
        this.nomeThread = nomeThread;
        this.numeroAtendimentos = numeroAtendimentos;
        this.statusAtendimento = StatusAtendimento.GERAR_SENHA;
        thread = new Thread(this, this.nomeThread);
        thread.start();
    }

    public StatusAtendimento getStatusAtendimento() {
        return statusAtendimento;
    }

    public int getNumeroAtendimentos() {
        return numeroAtendimentos;
    }

    public synchronized void fecharRestaurante() {
        this.fecharRestaurante = true;
    }

    @Override
    public void run() {
        System.out.println("Restaurante Aberto, Thread " + this.nomeThread);
        while (this.atendimentoAtual < this.numeroAtendimentos) {
            if (this.statusAtendimento == StatusAtendimento.GERAR_SENHA) {
                System.out.println();
                System.out.println("Atendimento atual, senha: " + this.atendimentoAtual);
            }
            System.out.println(this.statusAtendimento);
            try {
                switch (this.statusAtendimento) {
                    case GERAR_SENHA, AGUARDAR_ATENDIMENTO, CHAMAR_SENHA,
                            REALIZAR_PEDIDO, SERVIR_REFEICAO, FECHAR_CONTA,
                            LIMPAR_MESA -> Thread.sleep(this.statusAtendimento.getTempoEspera());
                }
                mudarStatusAtendimento();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.esperarMudarStatusAtendimento();
        }
        System.out.println("Quantidades de atendimentos máximos atingidos! Fechando restaurante...");

//        while (!this.fecharRestaurante) {
//            try {
//                switch (this.statusAtendimento) {
//                    case GERAR_SENHA, AGUARDAR_ATENDIMENTO, CHAMAR_SENHA,
//                            REALIZAR_PEDIDO, SERVIR_REFEICAO, FECHAR_CONTA,
//                            LIMPAR_MESA -> Thread.sleep(this.statusAtendimento.getTempoEspera());
//                }
//                mudarStatusAtendimento();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

    private synchronized void mudarStatusAtendimento() {
        switch (this.statusAtendimento) {
            case GERAR_SENHA -> this.statusAtendimento = StatusAtendimento.AGUARDAR_ATENDIMENTO;
            case AGUARDAR_ATENDIMENTO -> this.statusAtendimento = StatusAtendimento.CHAMAR_SENHA;
            case CHAMAR_SENHA -> this.statusAtendimento = StatusAtendimento.REALIZAR_PEDIDO;
            case REALIZAR_PEDIDO -> this.statusAtendimento = StatusAtendimento.SERVIR_REFEICAO;
            case SERVIR_REFEICAO -> this.statusAtendimento = StatusAtendimento.FECHAR_CONTA;
            case FECHAR_CONTA -> this.statusAtendimento = StatusAtendimento.LIMPAR_MESA;
            case LIMPAR_MESA -> this.statusAtendimento = StatusAtendimento.GERAR_SENHA;
        }
        this.mudouStatus = true;
        notify();
    }

    public synchronized void esperarMudarStatusAtendimento() {
        try {
            while (!mudouStatus) {
                wait();
            }
            if (this.statusAtendimento == StatusAtendimento.GERAR_SENHA) {
                this.atendimentoAtual++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.mudouStatus = false;
    }
}
