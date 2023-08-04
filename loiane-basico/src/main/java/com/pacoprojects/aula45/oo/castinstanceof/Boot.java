package com.pacoprojects.aula45.oo.castinstanceof;

import com.pacoprojects.aula45.oo.castinstanceof.model.Aluno;
import com.pacoprojects.aula45.oo.castinstanceof.model.PessoaFisica;
import com.pacoprojects.aula45.oo.castinstanceof.model.Professor;

public class Boot {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        PessoaFisica pessoaFisica = new Aluno(); // upcasting
        PessoaFisica aluno2 = (PessoaFisica) new Aluno();   // casting
        PessoaFisica aluno3 = new PessoaFisica();
        //Aluno aluno4 = (Aluno) aluno3;    // ERROR - Ira estourar exception pois a classe Aluno tem atributos que a PessoaFisica nao tem, entao como nao consegue preencher ira dar a Exception: Class Cast Exception

        Object object = obterString();
        String s = (String) object;         // downcasting FUNCIONAL nesse caso eh possivel pois nao estamos passando atributos somente um valor de String.

        Object object2 = "Minha";
        String st = (String) object2;       // downcasting FUNCIONAL pois faz referencia a uma String

        Object object3 = new Object();
        //String s3 = (String) object3;     // ERROR - Ira estourar exception pois agora a classe String esta sendo referenciada a um Objeto e nao a uma String em si.

        Object i = obterInteiro();
        int it = (int) i;                   // downcasting FUNCIONAL pois faz referencia a um int

        Aluno a = new Aluno();
        PessoaFisica pf = new PessoaFisica();
        Professor prof = new Professor();

        if (pf instanceof PessoaFisica) {
            System.out.println("Objeto É do tipo Pessoa Fisica");
        }

        if (a instanceof Aluno) {
            System.out.println("Objeto É do tipo Aluno");
        }

        if (prof instanceof Professor) {
            System.out.println("Objeto É do tipo Professor");
        }

    }
    public static String obterString() {
        return "Minha String";
    }

    public static int obterInteiro() {
        return 1;
    }
}
