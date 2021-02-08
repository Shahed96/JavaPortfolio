/*
 * Reading a text using BufferedReader class
 */
package bufferedreader;

import java.io.FileNotFoundException;
import java.io.*;

/**
 *
 * @author Shahed A. 
 */
public class BufferedReader1 {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader inputStream = new BufferedReader(new FileReader("quots.txt"));
        String i= inputStream.readLine();
        while (i!=null){
             System.out.println(i);
        i= inputStream.readLine();
       
        }
      
    }

    
    
}
