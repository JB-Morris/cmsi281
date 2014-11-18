package edu.lmu.cmsi.mike.recursivesorting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import edu.lmu.cmsi.mike.recursivesorting.parts.BalanceCheck;
import java.lang.IllegalArgumentException;

public class BalanceCheckTest {

    private BalanceCheck balanceCheckTest = new BalanceCheck();

    @Test
    public void checkTest(){
        boolean result = balanceCheckTest.check("()");
        assertEquals("Did not resturn expected value", true, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkEmpty() {
        boolean result = balanceCheckTest.check("");
    }
}