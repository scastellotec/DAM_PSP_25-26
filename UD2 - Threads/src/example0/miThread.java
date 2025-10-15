package example0;

public class miThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("I'm a Thread "+i);

        }
    }
}
