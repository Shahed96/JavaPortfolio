
package fraction;



/**
 *
 * @author DELL
 */
public class FractionDemo {

    
    public static void main(String[] args) {
        Fraction f=new Fraction ();
        f.setNumerator(8);
        try {
            f.setDenominator(0);
        } catch (DenominatorZeroException ex) {
           System.out.println("DenominatorZeroException");
        }
        
    }
    
}
