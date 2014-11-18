package edu.lmu.cmsi.mike.recursivesorting;

import edu.lmu.cmsi.mike.recursivesorting.parts.Multiply;
import org.junit.Test;
import java.lang.IllegalArgumentException;
import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    public Multiply multiplyTest = new Multiply();

    @Test(expected = IllegalArgumentException.class)
    public void negativeTest() {
        multiplyTest.multiply(-1, 8);
    }

    @Test
    public void accuracyTest() {
        int output = multiplyTest.multiply(5, 5);
        assertEquals("Did not return expected value", 25, output);
    }
}