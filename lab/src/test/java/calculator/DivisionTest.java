package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    void testDividePositive() {
        Division division = new Division();
        assertEquals(2.0, division.divide(4.0, 2.0), 0.0001);
    }

    @Test
    void testDivideByZero() {
        Division division = new Division();
        assertThrows(IllegalArgumentException.class, () -> division.divide(5.0, 0));
    }

    @Test
    void testDivideNegative() {
        Division division = new Division();
        assertEquals(-2.0, division.divide(-4.0, 2.0), 0.0001);
    }
}
