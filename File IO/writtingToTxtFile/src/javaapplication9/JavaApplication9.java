/*
 * A demonstration of output stream (writing to a text file)
 */
package javaapplication9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author: Walter Savitch &amp; Shahed A.
 */
public class JavaApplication9 {

    public static void main(String[] args) throws FileNotFoundException {
        //creating a stream object
        PrintWriter outputStream;
        //connect the stream (outputStream object) to shahed.txt
        outputStream = new PrintWriter(new FileOutputStream("shahed.txt"));

        //writing to the file 
        outputStream.print("this line written from a java program");
        //close the connection
        outputStream.close();

    }

}
