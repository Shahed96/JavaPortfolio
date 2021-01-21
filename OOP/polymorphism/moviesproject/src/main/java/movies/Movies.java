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
public abstract class  Movies {

    private String rating;
    private int ID;
    private String title;

    public Movies() {
        rating = "Not rated yet!";
        ID = 0;
        title = "Not available yet!";

    }

    public Movies(String rating, int ID, String title) {
        this.rating = rating;
        this.ID = ID;
        this.title = title;

    }

    public Movies(Movies movieObject) {
        rating = movieObject.rating;
        ID = movieObject.ID;
        title = movieObject.title;

    }

    public String getRating() {
        return this.rating;

    }

    public int getID() {
        return this.ID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setRating(String rating) {
        if (rating != null) {
            this.rating = rating;
        }
    }

    public void setID(int ID) {

        this.ID = ID;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Movies movieObject = (Movies) otherObject;
        return (movieObject.ID == ID && movieObject.rating.equalsIgnoreCase(rating)
                && movieObject.title.equalsIgnoreCase(title));
    }
    public abstract double calculateFee(int daysMovieLate);

      
}
