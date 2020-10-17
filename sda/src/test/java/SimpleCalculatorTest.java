import app.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @org.junit.jupiter.api.Test
    void main() {
        int result = SimpleCalculator.sum(new String[]{"+","2","3"});
        assertEquals(5,result);
        result = SimpleCalculator.sum(new String[]{"+"});
        assertEquals(0,result);
        result = SimpleCalculator.sum(new String[]{"*"});
        assertEquals(0,result);

        result = SimpleCalculator.product(new String[]{"*","2","2"});
        assertEquals(4,result);

    }
}