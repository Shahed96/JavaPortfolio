package quarterysalesofcompany;

import java.util.Scanner;

//Author: Shahed A.

public class QuarterySalesOfCompany {

    public static void main(String[] args) {
        double a[][] = new double[7][7];
        display(a);
    }

    public static double[][] fillQuarterySales(double[][] arrayA) {
        double[][] temp = new double[8][7];
        Scanner input = new Scanner(System.in);

        //Filling:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.println("Enter the quartery sales of stor number " + (i + 1) + " quarter of " + (j + 1));
                temp[i][j] = input.nextDouble();
            }

        }
        System.out.print("\t" + "Q1" + "\t" + "Q2" + "\t" + "Q3" + "\t" + "Q4" + "\t");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("S" + i + "\t");
            for (int j = 0; j < 4; j++) {

                System.out.print(temp[i][j] + "\t");

            }

            System.out.println();

        }

        temp = calculateSumAndAvarageOfEachStore(temp);
        temp = calculateSumOWachQuarter(temp);
        return temp;
    }

    public static double[][] calculateSumAndAvarageOfEachStore(double[][] a) {

        double sum = 0;
        int i, j;
        System.out.println();
        System.out.println();
        System.out.println("sum" + "\t" + "avarage");

        for (i = 0; i < 5; i++) {
            a[i][5] = 0;
            for (j = 0; j < 4; j++) {
                sum += a[i][j];

            }
            a[i][4] = sum;
            a[i][5] = sum / 4;

            System.out.println(a[i][4] + "\t" + a[i][5]);
            sum = 0;

        }
        return a;

    }

    public static double[][] calculateSumOWachQuarter(double[][] a) {
        System.out.println();
        System.out.println();

        System.out.println("sum" + "\t" + "avarage");

        int i = 0, j = 0;
        double sum = 0;

        for (i = 0; i < 6; i++) {
            sum = 0;
            for (j = 0; j < 6; j++) {

                sum += a[j][i];

            }
            a[6][i] = sum;
            a[7][i] = sum / 5;
            System.out.print(a[6][i] + "\t" + a[7][i]);
            System.out.println();

        }
        return a;
    }

    public static void display(double array[][]) {

        array = fillQuarterySales(array);
        
        System.out.print("\n" + "\t" + "Q1" + "\t" + "Q2" + "\t" + "Q3" + "\t" + "Q4" + "\t");
        System.out.println("sum" + "\t" + "avarage" + "\t");
        
        for (int i = 0; i < array.length; i++) {
            if (i != 5) {
                if (i == 6) {
                    System.out.print("sum" + "\t");
                } else if (i == 7) {
                    System.out.print("avarage" + "\t");
                } else {
                    System.out.print("S" + (i + 1) + "\t");
                }

                for (int j = 0; j < array[i].length - 1; j++) {
                    System.out.print(array[i][j] + "\t");

                }
                System.out.println();

            }
        }
    }

}
