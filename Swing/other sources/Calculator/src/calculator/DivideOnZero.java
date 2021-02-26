
package calculator;


public class DivideOnZero extends Exception{
    
    public DivideOnZero()
    { 
    super ("Divide On Zero");
    }
    @Override
    public String getMessage(){
    return ("Divide On Zero");
    }
    
}
