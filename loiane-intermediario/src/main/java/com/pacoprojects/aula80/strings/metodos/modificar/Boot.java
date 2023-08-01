package main.java.com.pacoprojects.aula80.strings.metodos.modificar;

public class Boot {
    public static void main(String[] args) {

        // Note: substring() -> Cria uma String a partir de uma posicao inicial e final
        String teste = "Isso é um teste.";
        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));

        String ola = "olá";
        String mundo = "mundo";
        // Note: concat() -> Concatena String mais nao é uma boa prática
        String olaMundo = ola.concat(mundo); // ola + mundo
        System.out.println(olaMundo);

        String espacos = "i s p a ç o";
        // Note: replace() -> Cria uma nova String substituindo o primeiro trecho encontrado de codigos por um novo valor
        String semEspacos = espacos.replace("i", "e");
        System.out.println(semEspacos);

        // Note: replaceAll() -> Cria uma nova String substituindo varios trechos do codigo por um novo valor.
        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        String nome = " meu nome é: ";
        // Note: strip() -> Cria uma nova String removendo os espacos em branco do inicio e do fim da String. Incluindo Espacos em Branco UNICODE
        System.out.println(nome.strip());
        // Note: strip() -> Cria uma nova String removendo os espacos em branco do inicio e do fim da String. Não remove Espacos em Branco UNICODE
        System.out.println(nome.trim());
    }
}
