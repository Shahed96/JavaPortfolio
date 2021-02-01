
package movies;

/**
 *
 * @author DELL
 */
public class Action extends Movies {

    public Action() {
        super();
    }

    public Action(String rating, int ID, String title) {
        super(rating, ID, title);

    }

    public Action(Movies actionObject) {
        super(actionObject);

    }

    public double calculateFee(int daysMovieLate) {
        return 3 * daysMovieLate;
    }

}
