package nyc.c4q.abassawo;
//Twenty Questions
/**
 * Created by c4q-Abass on 3/16/15.
 */

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void randomNum(){
        Scanner userInput = new Scanner(System.in);
        double x = 1 + Math.random()*100000;
        int y = (int)x;   //Converted to an Integer.
        int numGuess = 20;
        int guessVal;

        for (int i = 0; i <= numGuess; i++) {
            guessVal = userInput.nextInt();
            if(guessVal == y) {
                System.out.println("You guessed correctly!");
                return;
            } else if(guessVal > y) {
                System.out.println("Input number is too high");
            } else{
                System.out.println("Input number is too low");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Please input a number");
        randomNum();
    }


}
