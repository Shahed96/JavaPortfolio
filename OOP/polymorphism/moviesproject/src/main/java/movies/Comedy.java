
package movies;


public class Comedy extends Movies {
    public Comedy() {
        super();
    }

    public Comedy(String rating, int ID, String title) {
        super(rating, ID, title);

    }

    public Comedy(Movies comedyObject) {
        super(comedyObject);

    }

    public double calculateFee(int daysMovieLate) {
        return 2.50 * daysMovieLate;
    }
    
}
