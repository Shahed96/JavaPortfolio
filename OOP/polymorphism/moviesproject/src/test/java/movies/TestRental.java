
package movies;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Shahed A.
 */
public class TestRental {
    Rental rental;
   
    @BeforeEach
    void setUp() {
        
        rental = new Rental(new Action(),2,9999);
    }
    
    
    @Test
    void TestCalculateLateFees() {
        assertEquals(6, rental.calculateLateFees(), "Should return 2*2");

    }
    
    @AfterEach
    public void tearDown(){
    rental=null;
    }
}
