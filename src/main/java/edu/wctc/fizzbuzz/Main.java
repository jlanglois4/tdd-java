package edu.wctc.fizzbuzz;

import static edu.wctc.fizzbuzz.FizzBuzz.fizzBuzz;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
}
