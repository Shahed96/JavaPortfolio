
package dateformat;


public class MonthException extends Exception{
    int month;
    
    MonthException(int month) {
       this.month=month;
    }
    @Override
   public String getMessage(){
    
    return (month+" is not a logical month!");
    }
    
}
