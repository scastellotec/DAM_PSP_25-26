package example2_producerConsumer;

public class SharedBuffer {

    private char letter;
    private boolean isRead = true;

    public synchronized char getLetter() throws InterruptedException {
        while(isRead){
            wait();
        }
        isRead = true;
        notifyAll();
        return letter;
    }

    public synchronized void setLetter(char letter) throws InterruptedException {
        while(!isRead){
            wait();
        }
        this.letter = letter;
        notifyAll();
        isRead = false;
    }
}
