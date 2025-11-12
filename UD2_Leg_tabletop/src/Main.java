//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WareHouse wh = new WareHouse();

        new Thread(new ProducerTabletops(wh)).start();
        new Thread(new ProducerLegs(wh)).start();
        new Thread(new ConsumerTable(wh)).start();

    }
}