package exercise1_TICTAC;

public class Main {
    public static void main(String[] args) {
        // Create thread 1
        Hilo r1 = new Hilo("TIC");
        // Strat thread 1
        Thread t1 = new Thread(r1);
        t1.start();

        // Start thread 2 (fewer lines)
        new Thread(new Hilo("TAC")).start();
    }
}
