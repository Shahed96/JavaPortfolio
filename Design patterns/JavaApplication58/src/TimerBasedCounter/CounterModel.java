
package TimerBasedCounter;


class CounterModel {
    private int counter ;

    public CounterModel(int counter) {
       
        this.counter = counter;
    }

   
    public void increment(){
        CounterView cv=new CounterView() ;
         counter++;
    cv.display(counter);
    }
}
