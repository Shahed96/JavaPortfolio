
package ExceptionHandling;

/**
 *
 * @author Shahed A.
 */
public class NegativeNumberException extends Exception {
    public NegativeNumberException(){
    super("Negative Number Exception, Retry");
    }
    public NegativeNumberException(String message){
    super(message);
    }
    
}
