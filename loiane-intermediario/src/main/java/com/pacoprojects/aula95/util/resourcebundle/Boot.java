package main.java.com.pacoprojects.aula95.util.resourcebundle;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class Boot {
    public static void main(String[] args) {

        System.out.println("Locale atual do servidor: " + Locale.getDefault());

        // Note: ResourceBundle.getBundle(PATH) -> Retorna o objeto do Resource Bundle a partir do caminho do pacote, nome do arquivo E LOCALE padrao do servidor
        ResourceBundle bundle = ResourceBundle.getBundle("main.java.com.pacoprojects.i18n.meu-texto");

        // Note: getString(Key) -> Retorna um STRING 'valor' a partir da 'chave' do texto do arquivo
        System.out.println("Inglês: " + bundle.getString("hello"));
        // Note: getString(Key) -> Retorna um STRING 'valor' a partir da 'chave' do texto do arquivo
        System.out.println("Inglês: " + bundle.getString("world"));

        // Note: Locale.setDefault() -> Define um novo Locale padrao no sistema
//        Locale.setDefault(new Locale("pt","BR"));

        System.out.println("Locale atual do servidor: " + Locale.getDefault());

        // Note: ResourceBundle.getBundle(PATH, LOCALE) -> Retorna o objeto do Resource Bundle a partir do caminho do pacote, nome do arquivo E LOCALE Custom
        bundle = ResourceBundle.getBundle("main.java.com.pacoprojects.i18n.meu-texto", new Locale("pt", "BR"));

        // Note: getString(Key) -> Retorna um STRING 'valor' a partir da 'chave' do texto do arquivo
        System.out.println("Português: " + bundle.getString("hello"));
        // Note: getString(Key) -> Retorna um STRING 'valor' a partir da 'chave' do texto do arquivo
        System.out.println("Português: " + bundle.getString("world"));
    }
}
