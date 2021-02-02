
package com.shahed.vehicles;

/**
 *
 * @author Shahed A.
 */
public class Vehicle {

    private String manufactureName;
    private int numberOfCylinderInEngine;
    private Person owner;

    public Vehicle() {
        manufactureName = "No name";
        numberOfCylinderInEngine = 0;
        owner = new Person();
    }

    public Vehicle(String manufactureName, int numberOfCylinderInEngine, Person owner) {
        this.manufactureName = manufactureName;
        this.numberOfCylinderInEngine = numberOfCylinderInEngine;
        this.owner = new Person(owner);
    }

    public Vehicle(Vehicle vehicleObject) {
        this.manufactureName = vehicleObject.manufactureName;
        this.numberOfCylinderInEngine = vehicleObject.numberOfCylinderInEngine;
        this.owner = new Person(vehicleObject.owner);

    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;

    }

    public void setNumberOfCylinderInEngine(int numberOfCylinderInEngine) {
        this.numberOfCylinderInEngine = numberOfCylinderInEngine;

    }

    public void setOwner(Person owner) {
        this.owner = new Person(owner);

    }

    public String getManufactureName() {
        return manufactureName;
    }

    public int getNumberOfCylinderInEngine() {
        return numberOfCylinderInEngine;
    }

    public Person getOwner() {
        return new Person(owner);
    }

    @Override
    public String toString() {
        return ("Manufacture name " + manufactureName + "\n" + "Number Of Cylinder In Engine:" + numberOfCylinderInEngine
                + "\n" + owner.toString());
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            Vehicle other = (Vehicle) otherObject;
            return ((manufactureName.equalsIgnoreCase(other.manufactureName)) && (numberOfCylinderInEngine == other.numberOfCylinderInEngine)
                    && (owner.equals(other.owner)));

        }

    }

}
