package exercise2_HumanCalculator;

import java.util.Random;
import java.util.Scanner;

public class Operations implements Runnable{

    private int points = 0;

    public int getPoints() {
        return points;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){

            Random randomNumbers = new Random();
            int number1 = randomNumbers.nextInt(0,10);
            int number2 = randomNumbers.nextInt(0,10);
            int result = number1 + number2;

            System.out.print(number1 + "+" + number2 + "= ?");
            Scanner sc = new Scanner(System.in);
            int userResult = sc.nextInt();

            if(result == userResult){
                System.out.println("Correct!");
                points++;
            }else{
                System.out.println("Incorrect!");
            }

        }
    }
}
