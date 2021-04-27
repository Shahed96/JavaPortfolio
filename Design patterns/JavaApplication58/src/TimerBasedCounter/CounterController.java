
package TimerBasedCounter;


public class CounterController {
    private int  startValue;
     private int endValue;

    public CounterController(int startValue, int endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }
    
     
    public void start(){
        
    CounterModel cm = new CounterModel(startValue) ;
    for (int i=startValue; i<endValue; i++){
     cm.increment();
    }
    
    }

    public int getStartValue() {
        return startValue;
    }
    
   /* public static void main (String [] args){
    CounterController v =new CounterController(3,9);
    v.start();
    }*/
    
}
