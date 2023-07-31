package main.java.com.pacoprojects.aula72.threads.notifywait.model;

public class ThreadTicTac implements Runnable {
    private TicTac tt;
    private Thread thread;
    final int NUM = 5;

    public Thread getThread() {
        return thread;
    }

    public ThreadTicTac(String nome, TicTac tt) {
        this.tt = tt;
        this.thread = new Thread(this, nome);
        this.thread.start();
    }

    @Override
    public void run() {
        if (thread.getName().equalsIgnoreCase("Tique")) {
            for (int i = 0; i < NUM; i++) {
                tt.tique(true);
            }
            tt.tique(false);
        } else {
            for (int i = 0; i < NUM; i++) {
                tt.taque(true);
            }
            tt.taque(false);
        }
    }
}
