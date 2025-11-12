package exercise4_SharedCounter;

public class Counter {

    private int money;

    public Counter(int money) {
        this.money = money;
    }

    public synchronized void increment(){
        money++;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
