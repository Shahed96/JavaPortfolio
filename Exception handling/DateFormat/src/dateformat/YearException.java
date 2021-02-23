
package dateformat;


public class YearException extends Exception {
    private int year;
    
    YearException(){
    super("this number is not supported to be a year!");
    }
    
    YearException(String message) {
       super (message);
    }
    YearException(int year) {
       this.year=year;
    }
    @Override
   public String getMessage(){
    
    return (year+" is not a logical year!");
    }
    
    
}
