package multiplecatches;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class MultipleCatches {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0;
        double r;

        boolean done = false;
        while (!done) {
            System.out.println("Enter two integer value!");
            try {
                Scanner input = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);
                n1 = input.nextInt();
                n2 = input2.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Retry");

            }

        }
        try {
            r = (double) n1 / n2;
            System.out.println("n1/n2 = " + r); //Statement may throw an exception
        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

    }

}
