/*
   1.creat the origin file 
   2.add a line of text in
   3.read it in the program and remove all double blankes 
   4.write the content to an exist temp file
   5.delete the origin file u created
 */
package blankremoval;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class BlankRemoval {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //writing to the original file
        System.out.println("please enter the original file name");
        Scanner keyboard = new Scanner(System.in);
        String originalName = keyboard.nextLine(); //nextLine

        PrintWriter outputStream;
        outputStream = new PrintWriter(new FileOutputStream(originalName + ".txt"));

        //writing to the file 
        System.out.println("please enter the original paragraph");
        String originalParagraph = keyboard.nextLine(); //nextLine
        outputStream.println(originalParagraph);
        //close the connection
        outputStream.close();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//reading from original text to the program:
        PrintWriter outputStream2;
        outputStream2 = new PrintWriter(new FileOutputStream("temp.txt"));
        Scanner inputStream = null;
        String line = null;
        inputStream = new Scanner(new FileInputStream(originalName + ".txt"));
        while (inputStream.hasNext()) {
            line = inputStream.nextLine();
            line = line.replaceAll("  ", " ");
            outputStream2.println(line);
        }
        outputStream2.close();
        inputStream.close();

        File temp = new File("temp.txt"); // or full path
        File origin = new File(originalName + ".txt");

        boolean s = origin.delete();
        System.out.println(s);

    }

}
