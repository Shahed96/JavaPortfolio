
package readingfrombinaryfile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Shahed A.
 */
public class ReadingFromBinaryFile {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
       ObjectInputStream inputStream =new ObjectInputStream(new FileInputStream("numbers.dat"));
       int i=0;
       int n;
       
       while (true){
        n=inputStream.readInt();
       System.out.println("n"+(i+1)+" = "+n);
       i++; 
       }
        
       
      
       
       
    }
    
}
