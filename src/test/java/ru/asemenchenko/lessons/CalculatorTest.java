package ru.asemenchenko.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by meqqee on 14.10.16.
 */
public class CalculatorTest {
    @Test
    public void division() throws Exception {
        Calculator calculator = new Calculator();
        calculator.division(1.0, 1.0);
        assertEquals(1.0, calculator.getResult(), 0);
    }

    @Test
    public void addition() throws Exception {
        Calculator calculator = new Calculator();
        calculator.addition(1.0, 1.0);
        assertEquals(2.0, calculator.getResult(), 0);
    }

    @Test
    public void multiplication() throws Exception {
        Calculator calculator = new Calculator();
        calculator.multiplication(1.0, 1.0);
        assertEquals(1.0, calculator.getResult(), 0);
    }

    @Test
    public void substraction() throws Exception {
        Calculator calculator = new Calculator();
        calculator.substraction(1.0, 1.0);
        assertEquals(0.0, calculator.getResult(), 0);
    }

}