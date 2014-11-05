package edu.lmu.cmsi.mike.mostRecent10.parts;

import java.lang.Integer;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import edu.lmu.cmsi.mike.mostRecent10.parts.LListIterator;
import edu.lmu.cmsi.mike.mostRecent10.parts.LList;

public class LListTest {
    private static final int SIZE = 10;

    public LList<Integer> testLst = new LList<Integer>(SIZE);


    @Test
    public void oldestLessThanN() {
        testLst.add(1);
        testLst.add(2);
        testLst.add(3);
        testLst.add(4);
        testLst.add(5);
        testLst.add(6);
        int oldest = testLst.getFirst();
        assertEquals("Failure - AList did not return the oldest element", 1, oldest);
        testLst.reset();
    }

    @Test
    public void oldestGreaterThanN() {
        testLst.add(1);
        testLst.add(2);
        testLst.add(3);
        testLst.add(4);
        testLst.add(5);
        testLst.add(6);
        testLst.add(7);
        testLst.add(8);
        testLst.add(9);
        testLst.add(10);
        testLst.add(11);
        testLst.add(12);
        int oldest = testLst.getFirst();
        assertEquals("Failure - AList did not return the oldest element", 3, oldest);
        testLst.reset();
    }

    @Test
    public void newestLessThanN() {
        testLst.add(1);
        testLst.add(2);
        testLst.add(3);
        testLst.add(4);
        testLst.add(5);
        testLst.add(6);
        int newest = testLst.getLast();
        assertEquals("Failure - AList did not return the newest element", 6, newest);
        testLst.reset();
    }

    @Test
    public void newestGreaterThanN() {
        testLst.add(1);
        testLst.add(2);
        testLst.add(3);
        testLst.add(4);
        testLst.add(5);
        testLst.add(6);
        testLst.add(7);
        testLst.add(8);
        testLst.add(9);
        testLst.add(10);
        testLst.add(11);
        testLst.add(12);
        int newest = testLst.getLast();
        assertEquals("Failure - AList did not return the newest element", 12, newest);
        testLst.reset();
    }

    @Test
    public void sizeTest() {
        testLst.add(1);
        testLst.add(2);
        testLst.add(3);
        testLst.add(4);
        testLst.add(5);
        testLst.add(6);
        int size = testLst.getSize();
        assertEquals("Failure - AList did not return the proper size", 6, size);
        testLst.reset();
        size = testLst.getSize();
        assertEquals("Failure - AList did not return the proper size", 0, size);
    }


    @Test
    public void testIterator() {
        testLst.add(1);
        testLst.add(2);
        testLst.add(3);
        testLst.add(4);
        testLst.add(5);
        testLst.add(6);
        testLst.add(7);
        testLst.add(8);
        testLst.add(9);
        testLst.add(10);
        testLst.add(11);
        testLst.add(12);
    }


    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        testLst.add(null);


    }




//    while(testLinkedList.size() > SIZE) {
//        testLinkedList.removeFirst();
//    }
//}
}
