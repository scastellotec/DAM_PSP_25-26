package example2_producerConsumer;

public class Main {

    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();

        Thread tReader = new Thread(new Reader(sharedBuffer));
        //Thread tReader2 = new Thread(new Reader(sharedBuffer));
        Thread tWriter = new Thread(new Writer(sharedBuffer));

        tWriter.start();
        tReader.start();
        //tReader2.start();
    }
}
