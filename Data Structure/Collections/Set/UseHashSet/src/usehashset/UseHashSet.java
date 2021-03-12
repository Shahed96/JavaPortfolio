package usehashset;

import java.util.*;

public class UseHashSet {

    public static void displaySet(HashSet<String> set) {
        //to cycle through the set, we need an iterator:
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

    public static void main(String[] args) {
        HashSet<String> round = new HashSet<>();
        HashSet<String> green = new HashSet<>();

        //add data to round set
        round.add("peas");
        round.add("ball");
        System.out.println("round set:");
        displaySet(round);

        //add data to round set
        green.add("peas");
        green.add("dd");
        System.out.println("green set:");
        displaySet(green);

        //to union two sets we use the addAll method:
        round.addAll(green);
        System.out.println("union them:");
        displaySet(round);

        //to intersect two sets we use retainAll
        HashSet<String> intersect = new HashSet<>(round);
        intersect.retainAll(green);
        System.out.println("Intersection them:");
        displaySet(intersect);

    }

}
