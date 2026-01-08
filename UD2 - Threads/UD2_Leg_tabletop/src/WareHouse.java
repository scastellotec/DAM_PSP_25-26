public class WareHouse {

    private final int MAX_LEGS = 6;
    private final int MAX_TABLETOPS = 2;

    private int legsStored = 0;
    private int tabletopsStored = 0;
    private int totalTablesBuilt = 0;

    public synchronized void storeLeg() throws InterruptedException {
        while(legsStored >= MAX_LEGS){
            wait();
        }
        legsStored++;
        System.out.println("New leg stored: "+legsStored+"/"+MAX_LEGS);
        notifyAll();
    }

    public synchronized void storeTabletop() throws InterruptedException {
        while(tabletopsStored >= MAX_TABLETOPS){
            wait();
        }
        tabletopsStored++;
        System.out.println("New tabletop stored: "+tabletopsStored+"/"+MAX_TABLETOPS);
        notifyAll();
    }

    public synchronized void buildTable() throws InterruptedException {
        while(tabletopsStored < 1 || legsStored < 4){
            wait();
        }
        tabletopsStored--;
        legsStored = legsStored - 4;
        totalTablesBuilt++;
        System.out.println("BUILD Table: "+totalTablesBuilt);
        notifyAll();
    }

}
