package test.java.calculations;
import org.junit.Assert;
import org.junit.Test;

import main.java.calculations.Square;

public class SquareTests {
    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25, 0);

    }
}
