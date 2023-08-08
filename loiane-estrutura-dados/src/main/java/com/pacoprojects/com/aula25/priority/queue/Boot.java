package main.java.com.pacoprojects.com.aula25.priority.queue;

import main.java.com.pacoprojects.com.aula25.priority.queue.model.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Boot {
    public static void main(String[] args) {

        // Note: Metodo 1 implementando compareTo
//        Queue<Paciente> filaPrioridade1 = new PriorityQueue<>(new Comparator<Paciente>() {
//            @Override
//            public int compare(Paciente o1, Paciente o2) {
//                if (o1.getPrioridade() < o2.getPrioridade()) {
//                    return -1;
//                } else if (o1.getPrioridade() > o2.getPrioridade()) {
//                    return 1;
//                }
//                return 0;
//            }
//        });
        // Note: Metodo 2 implementando compareTo
//        Queue<Paciente> filaPrioridade2 = new PriorityQueue<>(new Comparator<Paciente>() {
//            @Override
//            public int compare(Paciente o1, Paciente o2) {
//                return Integer.valueOf(o1.getPrioridade()).compareTo(o2.getPrioridade());
//            }
//        });
        // Note: Metodo 3 implementando compareTo
//        Queue<Paciente> filaPrioridade3 = new PriorityQueue<>(new Comparator<Paciente>() {
//            @Override
//            public int compare(Paciente o1, Paciente o2) {
//                return Integer.compare(o1.getPrioridade(), o2.getPrioridade());
//            }
//        });
        // Note: Metodo 4 implementando compareTo
//        Queue<Paciente> filaPrioridade4 = new PriorityQueue<>((o1, o2) -> Integer.valueOf(o1.getPrioridade()).compareTo(o2.getPrioridade())));
        // Note: Metodo 5 implementando compareTo
//        Queue<Paciente> filaPrioridade5 = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.getPrioridade(), o2.getPrioridade()));
        // Note: Metodo 6 implementando compareTo
        Queue<Paciente> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(Paciente::getPrioridade));


        filaPrioridade.add(new Paciente("Fulano", 2));
        filaPrioridade.add(new Paciente("Beltrano", 1));

        System.out.println(filaPrioridade);
    }
}
