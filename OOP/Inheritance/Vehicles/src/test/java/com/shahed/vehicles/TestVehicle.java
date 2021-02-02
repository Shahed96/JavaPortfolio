package com.shahed.vehicles;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Shahed A.
 */
public class TestVehicle {

    Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicle = new Vehicle();
    }

    @Test
    void testEquals() {
        Vehicle vehicle2 = new Vehicle();
        assertEquals(true, vehicle.equals(vehicle2));
    }

    @Test
    void testgetName() {

        assertEquals("No name yet!", vehicle.getOwner().getName());
    }

    @AfterEach
    void tearDown() {
        vehicle = null;
    }

}
