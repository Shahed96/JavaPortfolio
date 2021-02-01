package com.shahed.comparableinterface;

/**
 * main()
 *
 */
public class App {

    public static void main(String[] args) {
        String[] animals = new String[3];
        animals[0] = "Rabbit";
        animals[1] = "Dog";
        animals[2] = "Cat";
        System.out.println("A string array before sorting:");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("A string array after sorting:");

        SelectionSortGenerlized.sort(animals);

        System.out.println();
        System.out.println("//////////////////");
        System.out.println();

        //create a Double array from Double class
        Double[] number = new Double[3];
        //Assign a number to each Double object
        number[0] = new Double(3);
        number[1] = new Double(5);
        number[2] = new Double(4);
        System.out.println("A double array before sorting:");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(number[i]);
        }
        System.out.println("A double array after sorting:");

        SelectionSortGenerlized.sort(number);
    }

}
