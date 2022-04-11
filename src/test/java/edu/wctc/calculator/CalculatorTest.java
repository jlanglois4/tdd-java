package edu.wctc.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calc;

    @Test
    void add() {
//        Calculator calc = new Calculator();
        double sum = calc.add(2.0, 3.0);
        // expected, actual, error message
        assertEquals(5.0, sum, "The sum was incorrect");
    }

    @Test
    void divide() {
    }

    @Test
    void multiply() {
    }

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @BeforeEach
    void setUpMore() {
        System.out.println("I'm running too!");
    }

    @Test
    void subtract() {
//        Calculator calc = new Calculator();
        double diff = calc.subtract(10.0, 9.0);
        // expected, actual, error message
        assertEquals(1.0, diff, "The difference was incorrect");
    }

    @AfterEach
    void tearDown() {
    }
}
