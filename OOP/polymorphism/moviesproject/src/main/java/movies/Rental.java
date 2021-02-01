package movies;

/**
 *
 * @author Shahed A.
 */
public class Rental {

    private Movies movie;
    private int daysMovieLate;
    private int customerID;

    public Rental() {
        movie = new Drama(); //dfault movie is Drama
        daysMovieLate = 0;
        customerID = 0;
    }

    public Rental(Movies movie, int daysMovieLate, int customerID) {

        this.daysMovieLate = daysMovieLate;
        this.customerID = customerID;
        if (movie instanceof Drama) {
            this.movie = new Drama(movie);
        } else if (movie instanceof Comedy) {
            this.movie = new Comedy(movie);
        } else if (movie instanceof Action) {
            this.movie = new Action(movie);
        } else {
            this.movie = new Drama(movie);
        }

    }

    public Rental(Rental rentalObject) {
        this.daysMovieLate = rentalObject.daysMovieLate;
        this.customerID = rentalObject.customerID;

        if (rentalObject.movie instanceof Drama) {
            this.movie = new Drama(rentalObject.movie);
        } else if (rentalObject.movie instanceof Comedy) {
            this.movie = new Comedy(rentalObject.movie);
        } else if (rentalObject.movie instanceof Action) {
            this.movie = new Action(rentalObject.movie);
        } else {
            this.movie = new Drama(rentalObject.movie);
        }

    }

    public void setDaysMovieLate(int daysMovieLate) {
        this.daysMovieLate = daysMovieLate;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getDaysMovieLate() {
        return daysMovieLate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public double calculateLateFees() {
        return movie.calculateFee(daysMovieLate);
    }
}
