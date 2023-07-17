package com.pacoprojects.exercicios.lista.aula25a27.model;

import java.util.ArrayList;
import java.util.List;

public class NotasDisciplinaAluno {
    public Aluno aluno;
    public Disciplina disciplina;
    public List<Notas> notas = new ArrayList<>();

    public void addNotas(Notas nota) {
        this.notas.add(nota);
    }
}
