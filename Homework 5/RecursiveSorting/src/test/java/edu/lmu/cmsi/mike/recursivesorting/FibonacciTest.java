package edu.lmu.cmsi.mike.recursivesorting;

import edu.lmu.cmsi.mike.recursivesorting.parts.Fibonacci;
import org.junit.Test;
import java.lang.IllegalArgumentException;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    public Fibonacci fibTest = new Fibonacci();

    @Test(expected = IllegalArgumentException.class)
    public void negativeTest() {
        int output = fibTest.FibonacciCounter(-1);
    }

    @Test
    public void accuracyTest() {
        int output = fibTest.FibonacciCounter(10);
        assertEquals("Did not return correct number", 34, output);
    }

}