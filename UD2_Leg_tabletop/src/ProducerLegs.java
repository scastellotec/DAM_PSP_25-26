public class ProducerLegs implements Runnable{

    private WareHouse wh;

    public ProducerLegs(WareHouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            wh.storeLeg();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
