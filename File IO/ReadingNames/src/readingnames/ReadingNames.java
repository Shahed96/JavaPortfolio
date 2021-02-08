/*
 * Enter a name, then see the rank of that name and it's popularity 
 */
package readingnames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Shahed A.
 */
public class ReadingNames {

    /**
     *
     * @param args
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner keyboard = new Scanner(System.in);
        String[] names = new String[1000];
        String[] number = new String[1000];

        String[] namesBoys = new String[1000];
        String[] numberBoys = new String[1000];

        String[] girlNames = new String[1000];
        String[] boyNames = new String[1000];

        Scanner inputStream = new Scanner(new FileInputStream("girlnames.txt"));
        Scanner inputStream2 = new Scanner(new FileInputStream("boynames.txt"));

        int i = 0, j = 0;
        //reading names:
        while (inputStream.hasNext() && inputStream2.hasNext()) {
            girlNames[i] = inputStream.nextLine();
            boyNames[i] = inputStream2.nextLine();

            StringTokenizer wordsGirls = new StringTokenizer(girlNames[i]);
            StringTokenizer wordsBoys = new StringTokenizer(boyNames[i]);

            while (wordsGirls.hasMoreTokens()) {
                names[i] = wordsGirls.nextToken();
                number[i] = wordsGirls.nextToken();
            }
            while (wordsBoys.hasMoreTokens()) {
                namesBoys[i] = wordsBoys.nextToken();
                numberBoys[i] = wordsBoys.nextToken();
            }

            i++;
        }

        System.out.println("Enter a name");

        String name = keyboard.nextLine();
        for (j = 0; j < 1000; j++) {
            if (name.equalsIgnoreCase(names[j])) {
                System.out.println(name + " is ranked: " + (j + 1) + " in popularity among girls with " + number[j] + " namings.");
                System.exit(0);
            } else if (name.equalsIgnoreCase(namesBoys[j])) {
                System.out.println(name + " is ranked: " + (j + 1) + " in popularity among boys with " + numberBoys[j] + " namings.");
                System.exit(0);
            }

        }
        System.out.print(name + " does not exist");

    }

}
