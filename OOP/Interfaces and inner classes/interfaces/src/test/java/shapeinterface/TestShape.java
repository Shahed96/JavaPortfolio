package shapeinterface;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Shahed A.
 */
public class TestShape {

    private Shape shape;

    @BeforeEach
    void setUp() {
        shape = new Rectangle(4, 4);
    }

    @Test
    void testArea() {
        assertEquals(16, shape.area());
    }

    @AfterEach
    void tearDown() {
        shape = null;
    }

}
