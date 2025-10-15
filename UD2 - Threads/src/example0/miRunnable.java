package example0;


public class miRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("I'm a Runnable "+i);

        }
    }
}
