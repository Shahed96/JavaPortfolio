/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfscoresarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class GolfScoresArrayList {

    /**
     * @param args
     *
     */
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>(4);
        showScoresDiff(list);
    }

    public static void fillArray(ArrayList<Double> a) {
        System.out.println("Enter a list nonnegative double numbers");
        System.out.println("Mark the end of the list with a negative number");

        Scanner input = new Scanner(System.in);

        double next = input.nextDouble(); //reading a double value from the keyboard7

        while ((next > 0) || (next == 0)) {
            a.add(next);

            next = input.nextDouble();

        }
        a.trimToSize();

    }

    public static double computeAvg(ArrayList<Double> a) {

        double sum = 0;
        double ave = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);

        }

        return sum / (a.size());
    }

    public static ArrayList<Double> differenceArray(ArrayList<Double> a, double avg) {

        ArrayList<Double> temp = new ArrayList<>(a.size());
        for (int i = 0; i < a.size(); i++) {
            temp.add(i, avg - a.get(i));

        }
        return temp;
    }

    public static void showScoresDiff(ArrayList<Double> a) {

        fillArray(a);
        double avg = computeAvg(a);
        double diff;
        for (int i = 0; i < a.size(); i++) {

            diff = avg - a.get(i);

            System.out.println("the diffrence between the avarege " + avg + " and the element " + a.get(i) + " is " + Math.abs(diff));
        }

        System.out.println("\n");

        ArrayList<Double> newArray = differenceArray(a, avg);
        for (int i = 0; i < a.size(); i++) {
            System.out.println("The " + (i + 1) + "th " + "element of the difference array is: " + Math.abs(newArray.get(i)));
        }
    }

}
