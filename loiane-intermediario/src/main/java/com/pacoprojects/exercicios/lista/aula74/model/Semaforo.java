package main.java.com.pacoprojects.exercicios.lista.aula74.model;

public class Semaforo {
    private CorSemaforo corSemaforo;

    public CorSemaforo getCorSemaforo() {
        return corSemaforo;
    }

    public void setCorSemaforo(CorSemaforo corSemaforo) {
        this.corSemaforo = corSemaforo;
    }

    public synchronized void sinalAberto(CorSemaforo corSemaforo) {
//        this.corSemaforo = corSemaforo;
//        if (corSemaforo != CorSemaforo.VERDE) {
//            this.corSemaforo = CorSemaforo.VERDE;
//            notify();
//            return;
//        }
        System.out.println("Sinal está VERDE");
//        notify();
//
//        try {
//            while (corSemaforo == CorSemaforo.VERDE) {
//                wait();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public synchronized void sinalAtencao(CorSemaforo corSemaforo) {
        this.corSemaforo = corSemaforo;
//        if (corSemaforo != CorSemaforo.AMARELO) {
//            this.corSemaforo = CorSemaforo.AMARELO;
//            notify();
//            return;
//        }
        System.out.println("Sinal está AMARELO");
//        notify();
//
//        try {
//            while (corSemaforo == CorSemaforo.AMARELO) {
//                wait();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public synchronized void sinalPare(CorSemaforo corSemaforo) {
//        this.corSemaforo = corSemaforo;
//        if (corSemaforo != CorSemaforo.VERMELHO) {
//            this.corSemaforo = CorSemaforo.VERMELHO;
//            notify();
//            return;
//        }
        System.out.println("Sinal está VERMELHO");
//        notify();
//
//        try {
//            while (corSemaforo != CorSemaforo.VERDE) {
//                wait();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
