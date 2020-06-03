package com.training;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator c = new Calculator();


//    @Before
//    @After
    @Test
    public void summing() {
    assertEquals(2 , c.sum(1, 1));
    }

    @Test
    public void summing2() {
        assertEquals(2 , c.sum(1, 1));
    }
}