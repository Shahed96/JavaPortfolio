package thesieveoferatosthenes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Sh.a.a
 */
public class TheSieveOfEratosthenes {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        primeNumbers(list);

    }

    private static ArrayList<Integer> initilizeList(ArrayList<Integer> list) {

        for (int i = 2; i <= 100; i++) {
            list.add(i);
        }
        return list;
    }

    private static ArrayList<Integer> findThePrimeNumbers(ArrayList<Integer> initilizeList) {
        ListIterator<Integer> i = initilizeList.listIterator();
        ArrayList<Integer> toRemove = new ArrayList();
        Integer number;
        while (i.hasNext()) {
            boolean flag = true;
            number = i.next();
            //find the prime number 
            for (int x = 2; x < number; x++) {
                if ((number % x) == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                int m;
                for (int y = 2; y <= 100; y++) {
                    m = number * y;
                    if (initilizeList.contains(m)) {

                        int indexOf = initilizeList.indexOf(m);
                        initilizeList.set(indexOf, 0);

                    }

                }
            }

        }
        return initilizeList;
    }

    private static void printPrimeNumbers(ArrayList<Integer> primeNumbers) {
        Iterator<Integer> i = primeNumbers.iterator();
        System.out.println("prime numbers: ");
        while (i.hasNext()) {

            int primeNumber = i.next();
            if (primeNumber != 0) {
                System.out.println(primeNumber);
            }

        }
    }

    private static void primeNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> initilizeList = initilizeList(list);
        ArrayList<Integer> primeNumbers = findThePrimeNumbers(initilizeList);
        printPrimeNumbers(primeNumbers);
    }

}
