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
public class Drama extends Movies {
    public Drama() {
        super();
    }

    public Drama(String rating, int ID, String title) {
        super(rating, ID, title);

    }

    public Drama(Movies dramaObject) {
        super(dramaObject);

    }

    public double calculateFee(int daysMovieLate) {
        return 2 * daysMovieLate;
    }
}
