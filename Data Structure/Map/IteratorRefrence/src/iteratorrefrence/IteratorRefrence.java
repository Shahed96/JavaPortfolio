
package iteratorrefrence;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


public class IteratorRefrence {

    
    public static void main(String[] args) {
       
        ArrayList<Double> bdate= new ArrayList<>();
      
         bdate.add(new Double(33.3));
          bdate.add(new Double(44.4));
          
          //make an iterator for bdate
          Iterator <Double> i= bdate.listIterator();
           //i= bdate.iterator();
           while (i.hasNext()){
           System.out.println(i.next());
          }
          
          i= bdate.iterator();
           double d;
          while (i.hasNext()){
          d=i.next(); //d is point to the bdate elements
          d=99.9; // change the values
          }
          
          //display pdate:
          i=bdate.iterator();
           while (i.hasNext()){
         System.out.println(i.next());
          }
          
          
        
        
    }
    
}
