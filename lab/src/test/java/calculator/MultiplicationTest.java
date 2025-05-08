package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    void testMultiplyPositive() {
        Multiplication m = new Multiplication();
        assertEquals(20.0, m.multiply(4.0, 5.0));
    }

    @Test
    void testMultiplyWithZero() {
        Multiplication m = new Multiplication();
        assertEquals(0.0, m.multiply(0.0, 5.0));
    }
}
