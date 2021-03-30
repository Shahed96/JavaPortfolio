package birthdayparadox;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author ah.a.a
 */
public class BirthdayParadox {

    public static void main(String[] args) {
        Random birthday = new Random();
        HashSet<Integer> birthdays = new HashSet<>();
        Iterator<Integer> i = birthdays.iterator();
        int myB = 3;
        double prob;
        int counter = 0;
        int birthdayNumber;
        int numberOfPeople = 2;

        for (int n = numberOfPeople; n < 50; n++) {

            for (int o = 0; o < 5000; o++) {
                birthdays.removeAll(birthdays);

                for (int x = 0; x < numberOfPeople; x++) {
                    birthdayNumber = 1 + birthday.nextInt(365);
                    birthdays.add(birthdayNumber);
                }

                if (birthdays.contains(myB)) {
                    counter++;
                }

            }
            prob = (double) counter / 5000;

            System.out.println("For " + numberOfPeople + " people in the room the prob is " + prob);
            numberOfPeople++;
            counter = 0;

        }

    }

}
