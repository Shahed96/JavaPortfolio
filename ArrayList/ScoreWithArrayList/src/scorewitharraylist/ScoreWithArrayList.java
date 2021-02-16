package scorewitharraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Shahed A.
 */
public class ScoreWithArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<Double>(7);

        int i = 0;
        System.out.println("Enter the" + (1) + " score between (0-10):");
        Scanner score = new Scanner(System.in);
        double scoreInput = score.nextDouble();

        while (i <= 6) {
            if ((scoreInput >= 0) && (scoreInput <= 10)) {
                scores.add(scoreInput);
                i++;
                if (i != 7) {
                    System.out.println("Enter the" + (i + 1) + " score between (0-10):");
                    scoreInput = score.nextDouble();
                }
            } else {
                System.out.println("REenter the" + (i + 1) + " score between (0-10):");
                scoreInput = score.nextDouble();
            }

        }
        

        //throw out the max score and remove it:
          double max=scores.get(0);
        for (i=0; i<scores.size(); i++){
        if (scores.get(i)> max){
            max=scores.get(i);
        }
        }
        scores.remove(max);
        scores.trimToSize();
        
        
  double min=scores.get(0);
        for (i=0; i<scores.size(); i++){
        if (scores.get(i)< min){
            min=scores.get(i);
        }
        scores.remove(min);
        scores.trimToSize();
        
        }
        //sum of the remaining scores
        double sum=0;
         for (i = 0; i < scores.size(); i++) {
            sum+=scores.get(i);
        }
         System.out.println("Sum of the remaining scores = " + sum);
         
        System.out.println("Enter the degree of difficulty (1.2 - 3.8)");
        double degree=score.nextDouble();
        boolean done =false;
        while (!done){
        
        if ((degree >= 1.2) && (degree <= 3.8)){
           sum=sum*degree;
           done =true;
        }
        else{
         System.out.println("Enter the degree of difficulty (1.2 - 3.8)");
         degree=score.nextDouble();
        }
        }
         System.out.println("After multiply sum by the degree = " + sum);
         System.out.println("After multiply by 0.6 = " + (sum*0.6));
        
        
        /////////////
        
    }

}
