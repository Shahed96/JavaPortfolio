package com.shahed.studentinterface;

public class App {

    public static void main(String[] args) {
        //create an array of student
        Student[] students = new Student[5];

        //construct each object
        students[0] = new Student("Reema", 7777);
        students[1] = new Student("Maram", 55555);
        students[2] = new Student("Kareem", 99999);
        students[3] = new Student("Nuha", 99);
        students[4] = new Student("Hanadi", 99999);

        sort(students);

    }

    public static void sort(Student[] a) {

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

    public static void swap(int i, int j, Student[] a) {
        //swap function with temp variable:

        Student temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void display(Student[] a, int size) {
        System.out.println("Students objects after sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Student's last name: " + a[i].getLastName() + " stdent's ID " + a[i].getID());

        }
    }
}
