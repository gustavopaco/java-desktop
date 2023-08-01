package main.java.com.pacoprojects.aula76.strings.concatenacao;

public class BootConcatenacao {
    public static void main(String[] args) {
        String curso = "Curso ";
        String java = "Java";

        String cursoJava = curso + java;

        System.out.println(cursoJava);

        String resultado2Com2 = "Resultado de 2 + 2 = " + (2+2);
        System.out.println(resultado2Com2);
        String resultado2Com2_ = "Resultado de 2 + 2 = " + 2 + 2;
        System.out.println(resultado2Com2_);

        String um = String.valueOf(1);
        System.out.println(um);

        String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur" +
                " orci justo, rhoncus et odio et, molestie efficitur neque. Donec vulputate mauris" +
                " a sagittis tempus. Quisque risus lectus, aliquam vitae sem eget, commodo vestibulum" +
                " turpis. Pellentesque porta nisi eu laoreet molestie. Nulla consequat viverra consectetur." +
                " Nulla sit amet diam auctor, pharetra erat eu, venenatis turpis. Quisque suscipit ut velit" +
                " sit amet consequat. Vestibulum interdum, diam eu porta porttitor, dolor quam sollicitudin" +
                " lacus, a pellentesque quam mauris vitae nisl. Sed vitae purus gravida, auctor turpis in," +
                " tempor nibh. Morbi in hendrerit nunc. Sed ornare sem sit amet nisl efficitur, nec faucibus" +
                " ante porta.";

        System.out.println(concatenacao);


        // Note: Má prática pois fica alocando nova String na memoria Heap instanciando uma nova String
        String concatenacao2 =  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur";
        concatenacao2 +=  " orci justo, rhoncus et odio et, molestie efficitur neque. Donec vulputate mauris";
        concatenacao2 +=  " a sagittis tempus. Quisque risus lectus, aliquam vitae sem eget, commodo vestibulum";
        concatenacao2 +=  " turpis. Pellentesque porta nisi eu laoreet molestie. Nulla consequat viverra consectetur.";
        concatenacao2 +=  " Nulla sit amet diam auctor, pharetra erat eu, venenatis turpis. Quisque suscipit ut velit";
        concatenacao2 +=  " sit amet consequat. Vestibulum interdum, diam eu porta porttitor, dolor quam sollicitudin";
        concatenacao2 +=  " lacus, a pellentesque quam mauris vitae nisl. Sed vitae purus gravida, auctor turpis in,";
        concatenacao2 +=  " tempor nibh. Morbi in hendrerit nunc. Sed ornare sem sit amet nisl efficitur, nec faucibus";
        concatenacao2 +=  " ante porta.";

        System.out.println(concatenacao2);
    }
}
