/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
         movie=new Drama(); //dfault movie is Drama
        daysMovieLate = 0;
        customerID = 0;
    }

    public Rental(Movies movie, int daysMovieLate, int customerID) {
        
        this.daysMovieLate = daysMovieLate;
        this.customerID = customerID;
        if (movie instanceof Drama) {
            this.movie = new Drama();
        }
        else if (movie instanceof Comedy) {
            this.movie = new Comedy();
        }

        else  if (movie instanceof Action) {
            this.movie = new Action();
        }
        else  this.movie = new Drama();

    }

    public Rental(Rental rentalObject) {
        // this.movie=new Movies (rentalObject.movie);
        this.daysMovieLate = rentalObject.daysMovieLate;
        this.customerID = rentalObject.customerID;
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
