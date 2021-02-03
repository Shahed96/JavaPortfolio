package accountbalancemodify;

/**
 *
 * @author Shahed A.
 */
public class AmountNotExcepted extends Exception {

    public AmountNotExcepted() {
        super("you have entered either negative or zero amount");
    }

    public AmountNotExcepted(String message) {
        super(message);
    }
}
