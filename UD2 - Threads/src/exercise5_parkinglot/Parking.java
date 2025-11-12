package exercise5_parkinglot;

public class Parking {

    private int spaces_available;

    public Parking(int spaces_available) {
        this.spaces_available = spaces_available;
    }

    public synchronized void enter(String carName) throws InterruptedException {
        while(spaces_available <= 0){
            System.out.println(carName + " Parking lleno");
            wait();
        }
        spaces_available--;
        System.out.println(carName + " aparcado");
    }


    public synchronized void exit(String carName) {
        spaces_available++;
        System.out.println(carName + " sale");
        notifyAll();
    }
}
