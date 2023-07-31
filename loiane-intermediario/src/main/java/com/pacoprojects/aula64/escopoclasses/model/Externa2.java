package main.java.com.pacoprojects.aula64.escopoclasses.model;

public class Externa2 {
    public void metodoQualquer() {
        class ClasseLocal {
            private String texto = "texto classe local";

            public void imprimeTexto() {
                System.out.println(texto);
            }
        }

        ClasseLocal classeLocal = new ClasseLocal();
        classeLocal.imprimeTexto();
    }
}
