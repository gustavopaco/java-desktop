package main.java.com.pacoprojects.aula72.threads.notifywait;

import main.java.com.pacoprojects.aula72.threads.notifywait.model.ThreadTicTac;
import main.java.com.pacoprojects.aula72.threads.notifywait.model.TicTac;

public class Boot {
    public static void main(String[] args) {
        TicTac ticTac = new TicTac();
        ThreadTicTac tique = new ThreadTicTac("Tique", ticTac);
        ThreadTicTac taque = new ThreadTicTac("Taque", ticTac);

        try {
            tique.getThread().join();
            taque.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
