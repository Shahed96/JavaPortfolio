
package dateformat;

import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class DateFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws YearException, MonthException, DayException {
        System.out.println("enter the year");
        Scanner keyboard = new Scanner (System.in);
        int year=keyboard.nextInt();
        if (!(1000<=year)&&(3000>=year))
            throw new YearException(year);
        
         System.out.println("enter the month");
         
        int month=keyboard.nextInt();
         if ((month > 12) || (month<1))
            throw new MonthException(month);
         
          System.out.println("enter the day");
        int day=keyboard.nextInt();
        if ((day>31) ||(day<=0))
            throw new DayException(day);
        String monthString1 = monthString(month);
         System.out.println(monthString1+day+" "+year);
    }
    public static String monthString(int month){
    switch(month){
        case 1:
            return "January";
            case 2:
            return "February";
            case 3:
            return "March";
            case 4:
            return "April ";
            case 5:
            return "May";
            case 6:
            return "June";
            case 7:
            return "July";
            case 8:
            return "August";
            case 9:
            return "September";
            case 10:
            return "October";
            case 11:
            return "November";
            case 12:
            return "December";
           
    }
        return null;    
    
    }
    
}
