package declarerule;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class DeclareRule {

    public static void main(String[] args) {
        boolean done = false;
        while (!done) {
            try {

                double r = returnRatio(); //method may throw an exception
                done = true;
                System.out.println("n1/n2 = " + r);

            } catch (InputMismatchException | DivideByZeroException e) {
                System.out.println("Retry");
            }

        }
    }

    public static double returnRatio() throws InputMismatchException, DivideByZeroException {

        int n1 = 0, n2 = 0;
        double r;

        System.out.println("Enter two integer value!");

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input2.nextInt();

        if (n2 == 0) {
            throw new DivideByZeroException("Divide By Zero Exception");
        }
        r = (double) n1 / n2;
        return r;

    }

}
