package main.java.com.pacoprojects.aula82.strings.metodos.juntar.separar;

import main.java.com.pacoprojects.aula82.strings.metodos.juntar.separar.model.Pessoa;

import java.util.Arrays;

public class Boot {
    public static void main(String[] args) {

        // Note: join() -> A partir de um delimitador o metodo junta N elementos usando VarArgs
        String alfabeto = String.join(",", "A", "B", "C", "D", "E");
        System.out.println(alfabeto);

        String[] letras = alfabeto.split(",");
        Arrays.stream(letras).forEach(System.out::println);

        String doArquivo = "1;Jose;30";
        // Note: split() -> Cria um array de String a partir de um Regex
        String[] info = doArquivo.split(";");
        Arrays.stream(info).forEach(System.out::println);

        Pessoa pessoa = new Pessoa(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]));
        System.out.println(pessoa);
    }
}
