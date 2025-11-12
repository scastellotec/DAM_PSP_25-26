package exercise5_parkinglot;

import static java.lang.Thread.sleep;

public class Car implements Runnable{

    private String name;
    private Parking park;

    public Car(String name, Parking park) {
        this.name = name;
        this.park = park;
    }

    @Override
    public void run() {
        // Car is ready to park
        System.out.println(name + " ready to park");
        try {
            park.enter(name);
            sleep(2000);
            park.exit(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
