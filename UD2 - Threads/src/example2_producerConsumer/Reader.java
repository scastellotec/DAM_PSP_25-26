package example2_producerConsumer;

public class Reader implements Runnable{

    private SharedBuffer sBuffer;

    public Reader(SharedBuffer sBuffer) {
        this.sBuffer = sBuffer;
    }

    @Override
    public void run() {
        for (int i=0; i<50; i++){
            try {
                System.out.println(Thread.currentThread() + ": " + sBuffer.getLetter());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
