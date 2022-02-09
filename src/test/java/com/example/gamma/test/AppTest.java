package com.example.gamma.test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple fizzbuzz.
 */
class AppTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStream() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(originalOut);
    }
    /**
     * Rigorous Test of the first version of fizzbuzz with 15 numbers
     */
    @Test
    public void testFizz() {
        App.fizzBuzz(15);
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz";
        assertEquals(expected,out.toString().trim());
    }
    /**
     * Rigorous Test of the second version of fizzbuzz with 15 numbers
    */
    @Test
    public void testFizzV2() {
        App.fizzBuzzV2(15);
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n14\nFizzBuzz";
        assertEquals(expected,out.toString().trim());
    }
}
