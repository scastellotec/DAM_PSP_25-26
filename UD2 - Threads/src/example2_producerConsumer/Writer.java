package example2_producerConsumer;

public class Writer implements Runnable{

    private SharedBuffer sharedBuffer;

    public Writer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        String messageToSend = "abcdefghijklmn";
        for(int i=0; i<messageToSend.length(); i++){
            try {
                sharedBuffer.setLetter(messageToSend.charAt(i));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
