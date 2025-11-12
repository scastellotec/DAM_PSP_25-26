package exercise4_SharedCounter;

public class Person implements Runnable{

    private Counter myCounter;

    public Person(Counter myCounter) {
        this.myCounter = myCounter;
    }

    @Override
    public void run() {
        for(int i=0; i<5000; i++){
            myCounter.increment();
        }
    }
}
