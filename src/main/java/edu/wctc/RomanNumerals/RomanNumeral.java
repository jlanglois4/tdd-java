package edu.wctc.RomanNumerals;

import java.util.LinkedHashMap;

// Code written by WCTC student Alex Besta


public class RomanNumeral
{
    private LinkedHashMap<Integer, String> numberToRoman = new LinkedHashMap<>();

    public RomanNumeral()
    {
        numberToRoman.put(1000, "M");
        numberToRoman.put(500, "D");
        numberToRoman.put(100, "C");
        numberToRoman.put(50, "L");
        numberToRoman.put(10, "X");
        numberToRoman.put(9, "IX");
        numberToRoman.put(5, "V");
        numberToRoman.put(4, "IV");
        numberToRoman.put(1, "I");
    }


    public String convert(int i)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer key : numberToRoman.keySet())
        {
            while (i >= key)
            {
                stringBuilder.append(numberToRoman.get(key));
                i -= key;
            }
        }
        return stringBuilder.toString();
    }
}
