package com.debanuj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5));
    }
}