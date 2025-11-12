package exercise2_HumanCalculator;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Create and strat a thread operations
        Operations op = new Operations();
        Thread top = new Thread(op);
        top.start();

        // Start a countdown 10secs
        Thread.sleep(10000);

        // Main thread interrupts operations thread
        top.interrupt();

        // Show the final score
        System.out.println("Score: "+op.getPoints());

    }
}
