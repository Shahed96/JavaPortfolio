package com.shahed.vehicles;

/**
 *
 * @author Shahed A.
 */
public class Truck extends Vehicle {

    private double loadCapacityInTons;
    private int towingCapacityInPounds;

    public Truck() {
        super();
        loadCapacityInTons = 0.0;
        towingCapacityInPounds = 0;
    }

    public Truck(String manufactureName, int numberOfCylinderInEngine, Person owner, double loadCapacityInTons,
            int towingCapacityInPounds) {
        super(manufactureName, numberOfCylinderInEngine, owner);
        this.loadCapacityInTons = loadCapacityInTons;
        this.towingCapacityInPounds = towingCapacityInPounds;
    }

    public Truck(Truck otherTruck) {
        super(otherTruck);
        this.loadCapacityInTons = otherTruck.loadCapacityInTons;
        this.towingCapacityInPounds = otherTruck.towingCapacityInPounds;
    }

    public String toString() {
        return (super.toString() + "\n" + "load capacity " + loadCapacityInTons + "\n"
                + "towing Capacity " + towingCapacityInPounds);
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            Truck other = (Truck) otherObject;
            return (super.equals(other) && (loadCapacityInTons == other.loadCapacityInTons) && (towingCapacityInPounds == other.towingCapacityInPounds));

        }
    }

}
