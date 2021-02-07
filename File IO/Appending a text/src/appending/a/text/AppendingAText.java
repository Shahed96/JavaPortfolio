/*
 * Appending a text 
 */
package appending.a.text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Shahed 
 */
public class AppendingAText {

    public static void main(String[] args) throws FileNotFoundException {
         PrintWriter outputStream;
          outputStream = new PrintWriter(new FileOutputStream("shahed.txt",true));
          outputStream.println ("hello, I am from java now"+"\n"+"Iam apendding your old content");
          outputStream.close();
          
    }
    
}
