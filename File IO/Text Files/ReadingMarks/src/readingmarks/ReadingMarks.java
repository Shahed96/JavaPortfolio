/*
 * Readin a bunch of marks and displaying the max and min vlaues
 */
package readingmarks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class ReadingMarks {

    /**
     * @param args
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputStream = new Scanner(new FileInputStream("marks.txt"));
        
        int i = 0;
        
         float[] marks = new float[20];
         
        while (inputStream.hasNext()) {
               marks[i] = Float.parseFloat(inputStream.nextLine());
            i++;
        }
        
        float max=marks[0];
        for (int j=0; j<i; j++){
        if (max<marks[j])
            max=marks[j];
        }
        float min=marks[0];
        for (int j=0; j<i; j++){
        if (min>marks[j])
            min=marks[j];
        }
        System.out.println("Maximum mark is: "+max);
         System.out.println("Minimum mark is: "+min);
       
        
       
       
    }

}
