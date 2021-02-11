
package writingtobinaryfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Shahed A.
 */
public class WritingToBinaryFile {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       ObjectOutputStream outputStream =new ObjectOutputStream(new FileOutputStream("numbers.dat"));
       for (int i=0; i<5; i++)
       {
       outputStream.writeInt(i);
       }
       outputStream.close();
    }
    
}
