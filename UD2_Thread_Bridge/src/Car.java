public class Car implements Runnable{

    private Bridge bridge;
    private String nombre;
    private boolean esNorte;

    public Car(Bridge puente, String nombre, boolean esNorte) {
        this.puente = puente;
        this.nombre = nombre;
        this.esNorte = esNorte;
    }

    @Override
    public void run() {
        try {
            if(esNorte){
                bridge.enterNorthCar(nombre);
            }else{
                bridge.enterSouthCar(nombre);
            }
            Thread.sleep(2000);
            bridge.exitBridge(nombre);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
