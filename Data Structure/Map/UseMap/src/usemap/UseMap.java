
package usemap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class UseMap {

    
    public static void main(String[] args) {
        HashMap<String, Double> hm =new HashMap<>();
        //insert values:
        hm.put("Shahed", 4.4);
        hm.put("Reema", 3.3);
        
        //get the keys (Set of strings)
        Set<String> keys =hm.keySet();
        System.out.println("keys:");
        keys.forEach((s) -> {
            System.out.println(s);
        });
        
        System.out.println();
        
        //get the values (List of Double)
       ArrayList<Double>al=new ArrayList<> (hm.values());
        System.out.println("Values:");
        al.forEach((v) -> {
            System.out.println(v);
        });
         System.out.println();
         
         //get values of the whole map:
         Iterator <String> i=hm.keySet().iterator();
         String k;
          System.out.println("kys   "+"values");
         while (i.hasNext()){
         k=i.next();
            Double get = hm.get(k);
            System.out.println(k +"  "+get);
            
         }
        
    }
    
}
