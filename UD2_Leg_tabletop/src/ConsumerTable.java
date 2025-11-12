public class ConsumerTable implements Runnable{

    private WareHouse wh;

    public ConsumerTable(WareHouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            wh.buildTable();
        }
    }
}
