package fraction;

/**
 *
 * @author Shahed A.
 */
public class DenominatorZeroException extends Exception {

    public DenominatorZeroException() {
        super("DenominatorZeroException");
    }

    public DenominatorZeroException(String message) {
        super(message);
    }

}
