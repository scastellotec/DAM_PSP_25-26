import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Persona implements Runnable {

    private Lock l1;
    private Lock l2;
    private String nombre;
    private Cuenta miCuenta;
    private Cuenta otraCuenta;

    public Persona(Lock lock1, Lock lock2, String nombre, Cuenta miCuenta, Cuenta otraCuenta) {
        this.l1 = lock1;
        this.l2 = lock2;
        this.nombre = nombre;
        this.miCuenta = miCuenta;
        this.otraCuenta = otraCuenta;
    }

    @Override
    public void run() {
        try {
            if (l1.tryLock()) { //Bloqueo miCuenta
                // Este bloque Sleep es para forzar el DeadLock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(nombre + " ha bloqueado su cuenta");

                try {
                    if (l2.tryLock()) { //Bloque la otraCuenta
                        System.out.println(nombre + " ha bloqueado la otra cuenta");
                        miCuenta.sacarDinero(100);
                        otraCuenta.ingresarDinero(100);
                    }
                } finally {
                    System.out.println(nombre + " libera la otra cuenta");
                    l2.unlock();
                }
            }
        } finally {
            System.out.println(nombre + " libera su cuenta");
            l1.unlock();
        }
        System.out.println("Ingreso realizado");
    }
}