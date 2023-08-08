package main.java.com.pacoprojects.com.exercicios.fila.exercicio01.model;

import java.util.Queue;

public class ThreadImpressao implements Runnable {

    private final Queue<Documento> documentoQueue;
    private boolean remover;

    public ThreadImpressao(Queue<Documento> documentoQueue) {
        this.documentoQueue = documentoQueue;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (!documentoQueue.isEmpty()) {
            remover = true;
            try {
                imprimirQuantidadeProjetos();
                mostrarDocumentoASerImpresso();
                assert this.documentoQueue.peek() != null;
                Thread.sleep(this.documentoQueue.peek().getQuantidadeFolhas() * 1000L);
                removerDocumento();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            aguardarRemocaoDocumento();
        }
        System.out.println("Impressão de documentos finalizada.");
    }

    private synchronized void removerDocumento() {
        if (!documentoQueue.isEmpty() && remover) {
            this.documentoQueue.remove();
            System.out.println("Documento foi impresso.");
            System.out.println();
        }
        remover = true;
        notify();
    }

    private synchronized void aguardarRemocaoDocumento() {
        try {
            if (!documentoQueue.isEmpty()) {
                System.out.println("Aguardando Impressão do próximo documento");
            }
            while (!remover) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        remover = false;
    }

    private synchronized void imprimirQuantidadeProjetos() {
        System.out.println("Quantidade de documentos a imprimir: " + documentoQueue.size());
    }

    private synchronized void mostrarDocumentoASerImpresso() {
        System.out.println("Imprimindo o documento: " + this.documentoQueue.peek());
    }
}
