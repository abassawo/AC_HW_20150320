package nyc.c4q.abassawo;
/**
 * Created by c4q-Abass on 3/18/15.
 */

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner fibInput = new Scanner(System.in);
        int userInput = 0;
        System.out.println("FibonacciMe says: Give me a number");
        userInput = fibInput.nextInt();

        System.out.println("The fibonacci number is " + fibonacciMe(userInput));
        System.out.println("The factorial for this number is " + factorialMe(userInput));
    }

    public static int fibonacciMe(int fibNum) {
        if (fibNum == 1) {
            return 0;
        } else if (fibNum == 2) {
            return 1;
        }return fibonacciMe(fibNum - 1) + fibonacciMe(fibNum - 2);   //Calli
    }

    public static int factorialMe(int factor) {  //practice.
        if (factor == 1) {
            return factor * factor;
        } else if (factor == 2) {
            return (factor);
        }return factor*factorialMe(factor-1);
    }
}