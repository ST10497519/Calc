// YOURS WILL HAVE A DIFFERENT NAME
package com.emeris.calculatormavenci;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void subtractsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(2, 1));
    }
}
