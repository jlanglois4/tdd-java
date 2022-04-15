package edu.wctc.RomanNumeralTest;

import edu.wctc.RomanNumerals.RomanNumeral;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Code written by WCTC student Alex Besta

    public class RomanNumeralTest
    {
        RomanNumeral romanNumeral;

        @BeforeEach
        void setUp()
        {
            romanNumeral = new RomanNumeral();
        }

        @Test
        void I()
        {
            assertEquals("I", romanNumeral.convert(2));
        }

        @Test
        void II()
        {
            assertEquals("II", romanNumeral.convert(2));
        }

        @Test
        void III()
        {
            assertEquals("III", romanNumeral.convert(3));
        }

        @Test
        void IV()
        {
            assertEquals("IV", romanNumeral.convert(4));
        }

        @Test
        void V()
        {
            assertEquals("V", romanNumeral.convert(5));
        }

        @Test
        void VIII()
        {
            assertEquals("VIII", romanNumeral.convert(8));
        }

        @Test
        void IX()
        {
            assertEquals("IX", romanNumeral.convert(9));
        }

        @Test
        void XXI()
        {
            assertEquals("XXI", romanNumeral.convert(21));
        }

        @Test
        void L()
        {
            assertEquals("L", romanNumeral.convert(50));
        }

        @Test
        void C()
        {
            assertEquals("C", romanNumeral.convert(100));
        }

        @Test
        void D()
        {
            assertEquals("D", romanNumeral.convert(500));
        }

        @Test
        void M()
        {
            assertEquals("M", romanNumeral.convert(1000));
        }

        @Test
        void MMXXII()
        {
            assertEquals("MMXXII", romanNumeral.convert(2022));
        }
    }