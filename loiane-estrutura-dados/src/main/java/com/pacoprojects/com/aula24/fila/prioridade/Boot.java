package main.java.com.pacoprojects.com.aula24.fila.prioridade;

import main.java.com.pacoprojects.com.aula24.fila.prioridade.model.FilaPrioridade;
import main.java.com.pacoprojects.com.aula24.fila.prioridade.model.Paciente;

public class Boot {
    public static void main(String[] args) {

        FilaPrioridade<Paciente> filaPrioridade = new FilaPrioridade<>();

        filaPrioridade.enfileira(new Paciente("Gustavo", 5));
        filaPrioridade.enfileira(new Paciente("Augusto", 1));
        filaPrioridade.enfileira(new Paciente("Vagaba", 3));

        System.out.println(filaPrioridade);
    }
}
