
package genericclass;


public class GenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //automatic boxing allows us to use int instead of Integer
        Pair<Double> pair=new Pair<>(new Double(34.8), new Double(88.9));
       System.out.println( pair.toString());
    }
    
}
