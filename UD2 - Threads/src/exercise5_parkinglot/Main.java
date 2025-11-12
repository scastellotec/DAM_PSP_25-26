package exercise5_parkinglot;

public class Main {

    public static void main(String[] args) {
        Parking park = new Parking(4);

        for(int i=0; i<10; i++){
            new Thread(new Car("car_"+i, park)).start();
        }
    }
}
