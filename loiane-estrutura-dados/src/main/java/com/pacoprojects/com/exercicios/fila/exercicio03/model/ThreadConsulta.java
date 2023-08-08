package main.java.com.pacoprojects.com.exercicios.fila.exercicio03.model;

public class ThreadConsulta<T> implements Runnable {


    private FilaPrioridade<T> filaPrioridade;
    private boolean proximoPaciente;
    private ThreadTempo threadTempo;

    public ThreadConsulta(FilaPrioridade<T> filaPrioridade) {
        this.filaPrioridade = filaPrioridade;
        Thread thread = new Thread(this);
        threadTempo = new ThreadTempo();
        thread.start();
    }

    @Override
    public void run() {
        threadTempo.ligarThread();
        boolean pararConsulta;
        int segundos = 0;
        while (!filaPrioridade.estaVazio()) {
            proximoPaciente = true;

            try {
                pararConsulta = false;
                while (!pararConsulta) {
                    Thread.sleep(1000);
                    segundos++;

                    if (segundos % Consulta.TEMPO_PROX_CONSULTA == 0) {
                        adicionarPacienteAFila(filaPrioridade);
                    }
                    if (segundos % Consulta.TEMPO_CONSULTA == 0) {
                        chamarProximoPaciente();
                        pararConsulta = true;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            aguardarAtendimento();
        }
    }

    private synchronized void chamarProximoPaciente() {
        if (!this.filaPrioridade.estaVazio() && this.proximoPaciente) {
            T elemento = this.filaPrioridade.desenfileira();
            imprimirFilaPacientes(elemento);
        }
        proximoPaciente = true;
        notify();
    }

    private synchronized void aguardarAtendimento() {
        try {
            if (this.filaPrioridade.estaVazio()) {
                threadTempo.desligar();
            }

            while (!proximoPaciente) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        proximoPaciente = false;
    }

    public synchronized void adicionarPacienteAFila(FilaPrioridade<T> filaPrioridade) {
        Pessoa pessoa = new Pessoa("Pessoa " + Consulta.novoNumeroFila(), Consulta.gerarCodigAleatorio());
        filaPrioridade.enfileira((T) pessoa);
        System.out.println("==> Nova pessoa Adicionada. <==  " + pessoa);
    }

    private synchronized void imprimirFilaPacientes(T elemento) {
        System.out.println();
        System.out.println("Pessoa a ser Atendida: " + elemento);
        System.out.println("Pessoa esta sendo atendida....");
        System.out.println("Restam: " + this.filaPrioridade.tamanho());
        System.out.println("toString => " + filaPrioridade);
        System.out.println();
    }
}
