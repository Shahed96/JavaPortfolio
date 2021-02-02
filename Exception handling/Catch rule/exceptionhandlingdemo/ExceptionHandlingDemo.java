/*
 * A demonstration of the catch rule
 */
package exceptionhandlingdemo;

import ExceptionHandling.NegativeNumberException;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        //Method may throw an exception
        inputIntegerAraay(3);
    }

    public static void calculateAvarage(int[] intArray) {

        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("Avarage of your array = " + (sum / intArray.length));

    }

    public static void inputIntegerAraay(int size) {
        int[] intArray = new int[size];
        Scanner input = new Scanner(System.in);
        boolean done = false;
        int i = 0;
        System.out.println("Enter up to " + intArray.length + " values");
        while (!done || i < intArray.length) {

            try {
                intArray[i] = input.nextInt();
                if (intArray[i] < 0) {
                    throw new NegativeNumberException(); //throw statment
                }
                i++;
                if (i == intArray.length) {
                    done = true;
                }
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        calculateAvarage(intArray);

    }
}
