package main.java.com.pacoprojects.aula65.anotacoes;

public @interface InformacaoAula {
    String autor();
    int aulaNumero();
    String blog() default "https://pacoprojects.com/blog";
    String site() default "https://pacoprojects.com";
}
