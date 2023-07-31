package main.java.com.pacoprojects.exercicios.lista.aula74;

import main.java.com.pacoprojects.exercicios.lista.aula74.model.Semaforo;
import main.java.com.pacoprojects.exercicios.lista.aula74.model.ThreadSemaforo;

public class Boot {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        ThreadSemaforo threadSemaforo = new ThreadSemaforo("#1", semaforo);
        for (int i = 0; i < 10; i++) {
            System.out.println(threadSemaforo.getSemaforo().getCorSemaforo());
            threadSemaforo.esperaCorMudar();
        }
        threadSemaforo.desligarSemaforo();
    }
}
