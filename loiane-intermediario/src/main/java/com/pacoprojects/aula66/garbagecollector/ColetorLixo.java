package main.java.com.pacoprojects.aula66.garbagecollector;

import main.java.com.pacoprojects.aula61.passagem.parametros.referencia.model.Contato;

public class ColetorLixo {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[10000];

        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato(
                    "Contato " + i,
                    "1234-56789" + i,
                    "contato" + i + "@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados.");
        obterMemoriaUsada();
        contatos = null;

        // Esse metodo pedimos para que seja finalizado os objetos criados na memoria Heap
        Runtime.getRuntime().runFinalization();
        // Pede para executar o Garbage collector
        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memoria.");
        obterMemoriaUsada();
    }

    // Note: Metodo que obtem a instancia da JVM e imprime o total de memoria utilizado
    public static void obterMemoriaUsada() {
        final int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime(); // singleton
        long memoria = runtime.totalMemory() - runtime.freeMemory();

        System.out.println(memoria / MB);
    }
}
