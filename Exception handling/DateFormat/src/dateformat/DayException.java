
package dateformat;


public class DayException extends Exception {
     int day;
    
    DayException(int day) {
       this.day=day;
    }
    @Override
   public String getMessage(){
    
    return (day+" is not a logical day!");
    }
    
}
