package movies;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test Drama
 */
public class DramaTest {

    Drama movie;

    @BeforeEach
    void setUp() {
        movie = new Drama();
    }

    @Test
    void TestCalculateFee() {
        assertEquals(4, movie.calculateFee(2), "Should return 2*2");

    }

}
