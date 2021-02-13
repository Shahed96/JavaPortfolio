/*
 * 
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
