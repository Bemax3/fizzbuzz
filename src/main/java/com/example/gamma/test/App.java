package com.example.gamma.test;

import java.util.stream.IntStream;

/** 
 * This is a simple class that implements the FizzBuzz game
*/
public final class App {
    private App() {}

    /**
     * Main Function just execute the fizzBuzz method with 100 first numbers
     * @param args The arguments of the program.
    */
    public static void main(String[] args) {
        fizzBuzz(100);
    }
    
    /**
     * Prints to the console the numbers from 1 to the limit given.
     * But For multiples of 3 it prints Fizz instead and for the multiples of 5 prints Buzz.
     * For the multiples of both 3 and 5 it prints FizzBuzz.
     * @param limit The Limit of numbers printed (inclusive) starting from 1.
    */
    private static void fizzBuzz(int limit) {
        IntStream.range(1, limit+1)
        .mapToObj(number -> (number % 3 == 0) ? (number % 5 == 0 ? "FizzBuzz" : "Fizz") : (number % 5 == 0 ? "Buzz" : number))
        .forEach(System.out::println);
    }   
}
