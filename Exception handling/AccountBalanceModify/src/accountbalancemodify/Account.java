package accountbalancemodify;

/**
 *
 * @author Shahed A.
 */
public class Account {

    private double balance;

    public Account() {
        balance = 0.0;
    }

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) throws AmountNotExcepted {
        if (amount > 0) {
            balance += amount;
        } else if (amount <= 0) {
            throw new AmountNotExcepted("you have entered either negative or zero amount");
        }
        return balance;

    }

    public double withdraw(double amount) throws AmountNotExcepted {
        if (amount > balance) {
            throw new AmountNotExcepted("you have entered amount bigger than your balance");
        } else if (amount < 0) {
            throw new AmountNotExcepted("you have entered negative number");
        } else {
            balance -= amount;
        }
        return balance;

    }

}
