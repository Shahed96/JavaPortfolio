package com.shahed.alienGame;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



/**
 * Unit test for Alien class.
 */
public class AlienTest 
{
    
    @Test
    public void getHealthTest()
    {
        //create an object
        Alien alien =new MarshmallowManAlien(99,"Marshmallow");
        
        //compare the expected with the real value
       assertEquals(99, alien.getHealth());
    }
}
