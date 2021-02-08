/*
 */

package classfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class ClassFile {

    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputStream=null;
        File fileObject =new File ("file.txt");
       
       if (fileObject.exists()) {
       inputStream = new Scanner(new FileInputStream("file.txt"));
          
      System.out.println(inputStream.nextLine()); 
      
       }
        
        
                
    }
    
}
