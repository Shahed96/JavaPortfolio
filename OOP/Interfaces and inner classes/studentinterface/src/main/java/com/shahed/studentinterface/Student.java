/*
 * Create a Student class that has instance variables for the student's last name and ID number 
 along with appropriate constructors, assessors and mutators. 
 Make the Student class implement the Comparable Interface.
 Define the compareTo method to compare Students objects based on the student ID number. 
 In the main method, create an array of at least five Student Objects, sort them using Arrays. sort, and output the students. 
 They should be listed by ascending student number.
 public int compareTo (Object other) A -ve number if the calling object "comes before" the parameter other
 A zero if the calling object "equals" the parameter other"comes after" the 
 A +ve number if the calling object parameter other
 */
package com.shahed.studentinterface;

/**
 *
 * @author Shahed A.
 */
public class Student implements Comparable {

    private String lastName;
    private int ID;

    public Student() {
        lastName = "Not yet!";
        ID = 00000000;
    }

    public Student(String lastName, int ID) {
        this.lastName = lastName;
        this.ID = ID;
    }

    public Student(Student otherStudent) {
        this.lastName = otherStudent.lastName;
        this.ID = otherStudent.ID;
    }

   

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void ID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return ID;
    }

    @Override
    public int compareTo(Object otherObject) {

        //convert it to Student object
        Student studentObject = (Student) otherObject;
        // comparasion using ID:
        if (studentObject.ID == this.ID) {
            return 0;
        } else if (studentObject.ID > this.ID) {
            return -1;
        }
        return 1;
    }

}
