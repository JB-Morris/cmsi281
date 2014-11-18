package edu.lmu.cmsi.mike.recursivesorting;

import edu.lmu.cmsi.mike.recursivesorting.parts.StringToInt;
import org.junit.Test;
import java.lang.IllegalArgumentException;
import java.lang.Integer;

import static org.junit.Assert.assertEquals;

public class StringToIntTest {

    public StringToInt STITest = new StringToInt();
    private String test = "12345";
    private int answer = 12345;

    private String test2 = "54321";
    private int answer2 = 54321;

    @Test
    public void accuracyTest(){
        int output = STITest.converter(test, test.length() - 1, 1);
        assertEquals("Did not return correct value", answer, output);
    }

    @Test
    public void typeTest() {
        int output = STITest.converter(test2, test2.length() - 1, 1);
        assertEquals("Did not return correct type", answer2, output);
    }

}