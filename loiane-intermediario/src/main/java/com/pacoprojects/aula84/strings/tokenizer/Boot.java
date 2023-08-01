package main.java.com.pacoprojects.aula84.strings.tokenizer;

import java.util.StringTokenizer;

public class Boot {
    public static void main(String[] args) {
        String doArquivo = "1;Jose;30";

        // Note: StringTokenizer é util para ler arquivos que tenha delimitador
        StringTokenizer st = new StringTokenizer(doArquivo,";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
