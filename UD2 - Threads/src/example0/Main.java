package example0;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting the app");

        // OPTION 1: Create a thread extending Thread class
        miThread t1 = new miThread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        // OPTION 2: Create a thread implemeting Runnable interface
        miRunnable r = new miRunnable();
        Thread t2 = new Thread(r);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t2.interrupt();

        // Version reducida (clases anonimas)
        //new Thread(new miRunnable()).start();

        t1.join();
        t2.join();
        System.out.println("Finish the app");
    }
}
