/*
 * Reading a text file from Scanner class
 */
package readingtext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class ReadingText {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputStream = null;
        String line = null;
        inputStream = new Scanner(new FileInputStream("quote.txt"));
        while (inputStream.hasNext()) {
            line = inputStream.nextLine();
             System.out.println(line);
        }
        inputStream.close();

        

    }

}
