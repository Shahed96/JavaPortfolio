package com.shahed.vehicles;

/**
 *
 * @author Shahed A.
 */
public class Person {

    private String name;

    public Person() {
        name = "No name yet!";

    }

    public Person(String name) {
        this.name = name;

    }

    public Person(Person otherPerson) {
        try {
            if (otherPerson == null) {
                throw new NullPointerException("Null object");
            }
        } catch (NullPointerException e) {
            e.getMessage();
        }
        this.name = otherPerson.name;

    }

    public void setName(String name) {
        try {
            if (name == null) 
                throw new NullPointerException();
    
            this.name = name;
        } catch (NullPointerException e) {
            e.getMessage();
        }

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("name is " + name);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            Person otherPerson = (Person) otherObject;
            return (name.equalsIgnoreCase(otherPerson.name));
        }

    }
}
