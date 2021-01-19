package com.shahed.alienGame;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Alien class.
 */
public class AlienTest {

    Alien alien;

    @BeforeEach
    void init() //create an instance for each method
    {
        alien = new MarshmallowManAlien(99, "Marshmallow");
    }
    @Disabled 
    @Test
    public void testGetHealth() {

        //compare the expected with the real value
        assertEquals(99, alien.getHealth(),
                "The method should return the health of the alien (int value)");
        assertNotNull(alien); //to check the object is not null

    }
}
