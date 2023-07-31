package main.java.com.pacoprojects.aula64.escopoclasses.model;

public class Externa {
    private String texto = "texto externo";

    public class Interna {
        private String texto = "texto interno";

        public void imprimeTexto() {
            System.out.println(texto);
            // Consegue ver atributos e metodos da classe Externa
            System.out.println(Externa.this.texto);
        }

    }
}
