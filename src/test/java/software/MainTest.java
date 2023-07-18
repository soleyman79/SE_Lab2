package software;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {
    @Test
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5, 6);
        Assertions.assertEquals(30, rectangle.calculateArea());
    }
}
