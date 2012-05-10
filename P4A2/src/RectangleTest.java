import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test für die Klasse Circle.
 */
public class RectangleTest extends AbstractShapeTest {

    @Before
    public void setUp() {
        s1 = new Rectangle("a", 10.5,5);
        s2 = new Rectangle("b", 11.0,5);
        s3 = new Rectangle("c", 10.5,5);
    }
    
    @Test
    public void testArea() {
        double area13 = 10.5 * 5;
        double area2 = 11.0 * 5;
        
        assertEquals(area13, s1.getArea(), 1e-7);
        assertEquals(area2, s2.getArea(), 1e-7);
        assertEquals(area13, s3.getArea(), 1e-7);
    }

    protected String prefix() {
        return "Rectangle.";
    }
}
