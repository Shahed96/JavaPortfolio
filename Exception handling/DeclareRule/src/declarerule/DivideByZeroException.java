
package declarerule;

/**
 *
 * @author Shahed A.
 */
public class DivideByZeroException extends Exception {
   public DivideByZeroException(){
   
   super("Divide by zero");
   }
   public DivideByZeroException(String message){
   
   super(message);
   }
    
}
