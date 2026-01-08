//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();

        for(int i=0; i<10; i++){
            new Thread(new Car(bridge,"North "+i, true)).start();
        }

        for(int i=0; i<10; i++){
            new Thread(new Car(bridge,"South "+i, false)).start();
        }
    }
}