package example1;

public class DoSomething implements Runnable{

    private int numberStart;

    public DoSomething(int numberStart) {
        this.numberStart = numberStart;
    }

    @Override
    public void run() {
        //Sets the behavior
        for(int i=numberStart; i<numberStart+10;i++){
            System.out.println(i);
        }
    }
}
