package example1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread t1 = new Thread(new DoSomething(1));
        Thread t2 = new Thread(new DoSomething(21));
        t1.start();
        t2.start();
        System.out.println("End");
    }
}