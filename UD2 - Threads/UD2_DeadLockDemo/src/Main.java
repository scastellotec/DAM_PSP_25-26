import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        BlockingQueue<Cuenta> a = new ArrayBlockingQueue<>(4);


        Cuenta cuenta1 = new Cuenta(1000);
        Cuenta cuenta2 = new Cuenta(1000);


        try {
            a.put(cuenta1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Lock l1 = new ReentrantLock();
        Lock l2 = new ReentrantLock();

        /* A cada persona le doy primero su cuenta propia, y depués la cuenta de destino.
           Por eso es distinto para cada una de las personas.*/
        new Thread(new Persona(l1, l2,"Edu",cuenta1, cuenta2)).start();
        new Thread(new Persona(l1, l2,"Edu",cuenta1, cuenta2)).run();
        new Thread(new Persona(l2, l1,"Ali",cuenta2, cuenta1)).start();
    }
}