package usehashmap2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

public class UseHashMap2 {

    public static void main(String[] args) {
        //Create a HashMap with size=10, and default load capacity(0.7)
        //=> 10*0.7=7 => at 8th entry the rehashing will starts
        HashMap<String, BigDecimal> numbers = new HashMap<>(10);

        //fill  them:
        numbers.put("shahed1", new BigDecimal(99));
        numbers.put("shahed2", new BigDecimal(1));
        numbers.put("shahed3", new BigDecimal(1));
        numbers.put("shahed4", new BigDecimal(1));
        numbers.put("shahed5", new BigDecimal(1));
        numbers.put("shahed6", new BigDecimal(1));
        numbers.put("shahed7", new BigDecimal(1));
        numbers.put("shahed8", new BigDecimal(1));
        numbers.put("shahed9", new BigDecimal(1));
        numbers.put("shahed10", new BigDecimal(1));
        numbers.put("shahed11", new BigDecimal(1));
        numbers.put("shahed12", new BigDecimal(1));

        Scanner input = new Scanner(System.in);

        String key = "";
        do {
            System.out.println("enter a key:");

            key = input.nextLine();
            if (numbers.containsKey(key)) {

                BigDecimal get = numbers.get(key);
                System.out.println("value of ur key:" + get);

            } else if (!key.equals("")) {
                System.out.println("key not found!");
            }
        } while (!key.equals(""));

    }

}
