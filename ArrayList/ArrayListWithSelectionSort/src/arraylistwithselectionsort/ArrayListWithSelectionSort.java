/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistwithselectionsort;

import java.util.ArrayList;

/**
 *
 * @author Shahed A.
 */
public class ArrayListWithSelectionSort {

    /**
     * @param
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(10);

        list.add("rain");
        list.add("cloud");
        list.add("array");
        System.out.println("Array List befor sorting: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        sort(list);

    }

    public static void sort(ArrayList<String> a) {

        int size = a.size();
        int min, i;
        for (i = 0; i < size - 1; i++) {
            min = i;

            for (int j = i + 1; j < size; j++) {
                if (a.get(j).compareTo(a.get(i)) < 0) {
                    min = j;
                    swap(i, min, a);
                }

            }

        }

        display(a, size);

    }

    public static void swap(int i, int j, ArrayList<String> a) {
        //swap function with temp variable:

        String temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);

    }

    public static void display(ArrayList<String> a, int size) {
        System.out.println("Array List after sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.println(a.get(i));

        }
    }

}
