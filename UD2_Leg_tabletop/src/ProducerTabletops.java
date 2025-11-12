public class ProducerTabletops implements Runnable{

    private WareHouse wh;

    public ProducerTabletops(WareHouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            wh.storeTabletop();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}