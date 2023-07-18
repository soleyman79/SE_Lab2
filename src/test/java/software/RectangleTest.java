package software;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RectangleTest {
    @Test
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5, 6);
        Assertions.assertEquals(30, rectangle.calculateArea());
    }

    @Test
    void testWidthSetAndGet() {
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setWidth(7);
        Assertions.assertEquals(7, rectangle.getWidth());
    }

    @Test
    void testHeightSetAndGet() {
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setHeight(10);
        Assertions.assertEquals(10, rectangle.getHeight());
    }
}
