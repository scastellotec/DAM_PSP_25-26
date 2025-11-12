package exercise1_TICTAC;

public class Hilo implements Runnable {

    String message;

    public Hilo(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
