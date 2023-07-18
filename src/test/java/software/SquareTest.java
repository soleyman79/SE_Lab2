package software;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void testCalculateArea() {
        Square square = new Square(5);
        Assertions.assertEquals(25, square.calculateArea());
    }

    @Test
    void testSideSetAndGet() {
        Square square = new Square(5);
        square.setSide(7);
        Assertions.assertEquals(7, square.getSide());
    }
}
