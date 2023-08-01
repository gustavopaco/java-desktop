package main.java.com.pacoprojects.aula78.strings.metodos.comparacao;

public class Boot {
    public static void main(String[] args) {

        String ola1 = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola1);

        // Note: Método equals() -> Compara se conteudo é igual com case sensitive
        // Note: Método equalsIgnoreCase() -> Compara se conteudo é igual sem case sensitive
        System.out.println("ola1 equals ola2 = " + (ola1.equals(ola2)));    // false
        System.out.println("ola1 equals ola3 = " + (ola1.equals(ola3)));    // true
        System.out.println("ola1 equals ola2 = " + (ola1.equalsIgnoreCase(ola2)));  // true
        System.out.println("ola1 == ola2 = " + (ola1 == ola2)); // false
        System.out.println("ola1 == ola3 = " + (ola1 == ola3)); // true pois está apontando para a referencia que esta no pool de atribuicao de String
        System.out.println("ola1 == ola4 = " + (ola1 == ola4)); // false
        System.out.println("ola1 == ola4 = " + (ola1.equals(ola4))); // false

        String banana = "banana";
        String ana = "ana";
        String ban = "Ban";

        // Note: regionMatches() -> Método que compara se a partir de um indice da String primaria a String secundaria tem os mesmo caracteres
        System.out.println(banana.regionMatches(1, ana, 0, ana.length()));
        System.out.println(banana.regionMatches(true,0, ban, 0, ban.length()));
        System.out.println(ana.regionMatches(0, banana, 1, ban.length()));

        // Note: endsWith() -> Método que compara se String termina com caracteres
        System.out.println(banana.endsWith(ana));
        // Note: startWith() -> Método que compara se String termina com caracteres
        System.out.println(banana.startsWith(ban)); // false pois é levado em consideracao case sensitive

        String a = "a";
        String b = "b";
        String aMaiusculo = "A";
        System.out.println();

        // -1 quando a > b
        // 0 quando a == b
        // 1 ou >1 quando a < b
        // Note: Compara baseado na Tabela ASCII
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));
        System.out.println(a.compareTo(aMaiusculo));
    }
}
