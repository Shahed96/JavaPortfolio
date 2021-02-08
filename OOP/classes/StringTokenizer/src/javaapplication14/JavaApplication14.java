/*
 * StringTokenizer class effect
 */
package javaapplication14;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Shahed A.
 */
public class JavaApplication14 {

   
    public static void main(String[] args) {
        System.out.println("Enter a line of code: ");
       Scanner input =new Scanner (System.in);
       String in=input.nextLine();
       StringTokenizer words =new StringTokenizer(in);
        System.out.println("Your line after StringTokenizer effect: ");
       while (words.hasMoreTokens())
       {
        System.out.println(words.nextToken());
       }
       
       
    }
    
}
