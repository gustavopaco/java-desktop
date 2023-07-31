package main.java.com.pacoprojects.aula64.escopoclasses;

import main.java.com.pacoprojects.aula64.escopoclasses.model.Anonima;
import main.java.com.pacoprojects.aula64.escopoclasses.model.Externa;
import main.java.com.pacoprojects.aula64.escopoclasses.model.Externa2;
import main.java.com.pacoprojects.aula64.escopoclasses.model.Texto;

public class Boot {
    public static void main(String[] args) {
        // Instanciando Classe Externa
        Externa externa = new Externa();
        // Usando referencia de Classe Externa para instanciar Classe Interna
        Externa.Interna interna = externa.new Interna();
        // Acessando metodo de classe interna
        interna.imprimeTexto();


        // Instanciando Segunda Classe Externa
        Externa2 externa2 = new Externa2();
        // Chamando metodo que instancia Classe Local e chama metodo de imprimir texto
        externa2.metodoQualquer();


        // Instanciando Classe Anonima, usado para sobrescrever comportamento da classe ou de metodos. Basta abrir chaves apos instanciar
        Anonima anonima = new Anonima() {
            @Override
            public void imprimeTexto() {
                System.out.println("Qualquer texto que foi sobrescrito");
            }
        };
        anonima.imprimeTexto();


        // Instaciando Interface e sobrescrevendo metodo de imprimir da interface
        Texto texto = () -> System.out.println("Qualquer texto da Interface");
        texto.imprimeTexto();
    }
}
