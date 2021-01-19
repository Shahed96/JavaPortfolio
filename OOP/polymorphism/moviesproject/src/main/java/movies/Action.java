/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
