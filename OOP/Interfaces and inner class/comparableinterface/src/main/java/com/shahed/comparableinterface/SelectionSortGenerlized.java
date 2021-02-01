/*
 * using the Comparable interface with selection sort 
 */
package com.shahed.comparableinterface;

/**
 *
 * @author Shahed A.
 */
public class SelectionSortGenerlized {

    public static void sort(Comparable[] a) {

        int size = a.length;
        int min, i;
        for (i = 0; i < size - 1; i++) {
            min = i;

            for (int j = i + 1; j < size; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                    swap(i, min, a);
                }

            }

        }

        display(a, size);

    }

    public static void swap(int i, int j, Comparable[] a) {
        //swap function with temp variable:

        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void display(Comparable[] a, int size) {

        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);

        }
    }

}
