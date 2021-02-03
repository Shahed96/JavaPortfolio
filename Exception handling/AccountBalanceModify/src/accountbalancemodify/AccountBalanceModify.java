package accountbalancemodify;

/**
 *
 * @author Shahed A.
 */
public class AccountBalanceModify {

    public static void main(String[] args) throws AmountNotExcepted {
        //shoud throw an exception
        Account account1 = new Account(1000.0);

        account1.withdraw(200000.0);
    }

}
