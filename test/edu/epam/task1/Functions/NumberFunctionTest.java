package edu.epam.task1.Functions;

import org.junit.jupiter.api.Test;
import edu.epam.task1.Number.Number;

import static org.junit.jupiter.api.Assertions.*;

class NumberFunctionTest {
    @Test
    public void NumberSqdTrue() {
        int i;
        boolean result = true;
        for (i = -9; i < 10; i++) {
            Number number = new Number(i);
            int lastNum = NumberFunction.NumberSqd(number);
            if (!((i * i) % 10 == lastNum)) {
                result = false;
                break;
            }
        }
        assertTrue(result);
    }
}