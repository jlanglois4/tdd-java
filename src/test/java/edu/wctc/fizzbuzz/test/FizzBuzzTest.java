package edu.wctc.fizzbuzz.test;

import org.junit.jupiter.api.Test;

import static edu.wctc.fizzbuzz.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void one() {
        assertEquals("1", fizzBuzz(1));
    }

    @Test
    void two() {
        assertEquals("2", fizzBuzz(2));
    }

    @Test
    void three() {
        assertEquals("Fizz", fizzBuzz(3));
    }

    @Test
    void five() {
        assertEquals("Buzz", fizzBuzz(5));
    }

    @Test
    void six() {
        assertEquals("Fizz", fizzBuzz(6));
    }

    @Test
    void ten() {
        assertEquals("Buzz", fizzBuzz(10));
    }

    @Test
    void fifteen() {
        assertEquals("FizzBuzz", fizzBuzz(15));
    }

    @Test
    void thirty() {
        assertEquals("FizzBuzz", fizzBuzz(30));
    }
}
