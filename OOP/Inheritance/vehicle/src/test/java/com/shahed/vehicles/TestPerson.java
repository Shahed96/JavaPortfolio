package com.shahed.vehicles;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Shahed A.
 */
public class TestPerson {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

    @Test
    void testEquals() {
        Person person2 = new Person();
        assertEquals(true, person.equals(person2));
    }

    @Test
    void testgetName() {
        
     assertEquals("No name yet!", person.getName());
    }

    @AfterEach
    void tearDown() {
        person = null;
    }

}
