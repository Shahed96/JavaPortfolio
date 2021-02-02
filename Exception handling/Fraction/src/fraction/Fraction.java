package fraction;

/**
 *
 * @author Shahed A.
 */
public class Fraction {

    private int denominator;
    private int numerator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) throws DenominatorZeroException {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new DenominatorZeroException();
        }
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) throws DenominatorZeroException {
        if (denominator == 0) {
            throw new DenominatorZeroException();
        }
        this.denominator = denominator;
    }

    public void display() {
        System.out.println("Fraction = " + numerator + "/" + denominator);

    }
}
