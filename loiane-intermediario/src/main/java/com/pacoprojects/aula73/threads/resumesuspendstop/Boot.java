package main.java.com.pacoprojects.aula73.threads.resumesuspendstop;

public class Boot {
    public static void main(String[] args) {
        MinhaThread t1 = new MinhaThread("#1");
        MinhaThread t2 = new MinhaThread("#2");

        t1.suspend();
        System.out.println("Thread 1 foi suspensa.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.suspend();
        System.out.println("Thread 2 foi suspensa.");
        t1.resume();
        System.out.println("Thread 1 foi resumida.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.resume();
        System.out.println("Thread 2 foi resumida.");
        t2.stop();
        System.out.println("Thread 2 foi parada.");
    }
}
