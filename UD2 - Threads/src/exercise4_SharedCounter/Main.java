package exercise4_SharedCounter;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter sharedCounter = new Counter(0);

        Person eduardo = new Person(sharedCounter);
        Thread t1 = new Thread(eduardo);
        t1.start();

        Person kevin = new Person(sharedCounter);
        Thread t2 = new Thread(eduardo);
        t2.start();

        t1.join();t2.join();
        System.out.println("Final result: "+sharedCounter.getMoney());
    }
}
