package edu.lmu.cmsi.mike.mostRecent10.parts;

import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.util.Iterator;
import edu.lmu.cmsi.mike.mostRecent10.parts.AList;
import edu.lmu.cmsi.mike.mostRecent10.parts.LList;
import edu.lmu.cmsi.mike.mostRecent10.parts.AListIterator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AListTest {
    private static final int SIZE = 10;

    //mvn clean compile test exec:java -q

    public AList<Integer> testArr = new AList<Integer>(SIZE);
//    public LList<Integer> testLst = new LList<Integer>(SIZE);
//    public LinkedList<Integer> testLinkedList = new LinkedList<Integer>();

    @Test
    public void oldestLessThanN() {
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        testArr.add(4);
        testArr.add(5);
        testArr.add(6);
        int oldest = testArr.getOldest();
        assertEquals("Failure - AList did not return the oldest element", 1, oldest);
        testArr.reset();
    }

    @Test
    public void oldestGreaterThanN() {
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        testArr.add(4);
        testArr.add(5);
        testArr.add(6);
        testArr.add(7);
        testArr.add(8);
        testArr.add(9);
        testArr.add(10);
        testArr.add(11);
        testArr.add(12);
        int oldest = testArr.getOldest();
        assertEquals("Failure - AList did not return the oldest element", 3, oldest);
        testArr.reset();
    }

    @Test
    public void newestLessThanN() {
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        testArr.add(4);
        testArr.add(5);
        testArr.add(6);
        int newest = testArr.getNewest();
        assertEquals("Failure - AList did not return the newest element", 6, newest);
        testArr.reset();
    }

    @Test
    public void newestGreaterThanN() {
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        testArr.add(4);
        testArr.add(5);
        testArr.add(6);
        testArr.add(7);
        testArr.add(8);
        testArr.add(9);
        testArr.add(10);
        testArr.add(11);
        testArr.add(12);
        int newest = testArr.getNewest();
        assertEquals("Failure - AList did not return the newest element", 12, newest);
        testArr.reset();
    }


    @Test
    public void sizeTest() {
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        testArr.add(4);
        testArr.add(5);
        testArr.add(6);
        int size = testArr.getSize();
        assertEquals("Failure - AList did not return the proper size", 6, size);
        testArr.reset();
        size = testArr.getSize();
        assertEquals("Failure - AList did not return the proper size", 0, size);

    }


    @Test
    public void testIterator() {
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        testArr.add(4);
        testArr.add(5);
        testArr.add(6);
        testArr.add(7);
        testArr.add(8);
        testArr.add(9);
        testArr.add(10);
        testArr.add(11);
        testArr.add(12);

    }

    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        testArr.add(null);
    }



}