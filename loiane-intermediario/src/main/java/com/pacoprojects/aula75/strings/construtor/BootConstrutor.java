package main.java.com.pacoprojects.aula75.strings.construtor;

public class BootConstrutor {
    public static void main(String[] args) {
        String vazia = new String();    // ""
        System.out.println(vazia);

        String java = new String("JAVA");
        System.out.println(java);

        char[] charsJava = {'J', 'A', 'V', 'A'};
        String java1 = new String(charsJava);
        System.out.println(java1);

        char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abc = new String(abcdef, 0, 3);
        System.out.println(abc);

        byte[] ascii = {65, 66, 67, 68, 69};
        String abcde = new String(ascii);
        System.out.println(abcde);

        // Note: Offset seria como se fosse uma substring
        String bcd = new String(ascii, 1, 3);
        System.out.println(bcd);

        // Note: Tanto java3 como java4 apontam para mesmo endereco de memoria pois ja existe no pool de atribuicoes do codigo.
        String java3 = "JAVA";
        String java4 = "JAVA";

        System.out.println(java3);
        System.out.println(java4);
    }
}
