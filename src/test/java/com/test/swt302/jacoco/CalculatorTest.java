package com.test.swt302.jacoco;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    Calculator cal = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void addCalculate() {
        assertEquals(7, cal.addCalculate(4, 3));
    }



//    @Test
//    void testMultiply() {
//        assertEquals(6, cal.multiply(2, 3));
//    }

    @Test
    void testDivide() {
        assertEquals(2, cal.divide(6, 3));
    }


//    @Test
//    void testDivideByZero() {
//        assertThrows(IllegalArgumentException.class, () -> cal.divide(5, 0));
//    }
    @Test
    void testEvaluateGrade() {
    assertEquals("Excellent", cal.evaluateGrade(95));
    assertEquals("Good", cal.evaluateGrade(80));
    assertEquals("Pass", cal.evaluateGrade(60));
    assertEquals("Fail", cal.evaluateGrade(30));
    assertEquals("Invalid", cal.evaluateGrade(-10));
    assertEquals("Invalid", cal.evaluateGrade(110));
    }

}