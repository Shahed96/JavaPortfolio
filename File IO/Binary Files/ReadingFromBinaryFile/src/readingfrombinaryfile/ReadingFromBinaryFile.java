
package readingfrombinaryfile;

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
       int n1=inputStream.readInt();
       int n2=inputStream.readInt();
       int n3=inputStream.readInt();
       System.out.println("n1 = "+n1+" n2 = "+n2 +" n3 = "+n3);
       inputStream.close();
       
       
    }
    
}
