package edu.lmu.cmsi.mike.mostRecent10.parts;


import java.lang.Integer;
import java.util.Iterator;
//import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import edu.lmu.cmsi.mike.mostRecent10.parts.MyLinkedList;

public class LinkedListTest {
    private static final int SIZE = 10;

    //mvn clean compile test exec:java -q

    public MyLinkedList<Integer> testMList = new MyLinkedList<Integer>(SIZE);
//    public LList<Integer> testLst = new LList<Integer>(SIZE);
//    public LinkedList<Integer> testLinkedList = new LinkedList<Integer>();

    @Test
    public void oldestLessThanN() {
        testMList.add(1);
        testMList.add(2);
        testMList.add(3);
        testMList.add(4);
        testMList.add(5);
        testMList.add(6);
        int oldest = testMList.getOldest();
        assertEquals("Failure - AList did not return the oldest element", 1, oldest);
        testMList.reset();
    }

    @Test
    public void oldestGreaterThanN() {
        testMList.add(1);
        testMList.add(2);
        testMList.add(3);
        testMList.add(4);
        testMList.add(5);
        testMList.add(6);
        testMList.add(7);
        testMList.add(8);
        testMList.add(9);
        testMList.add(10);
        testMList.add(11);
        testMList.add(12);
        int oldest = testMList.getOldest();
        assertEquals("Failure - AList did not return the oldest element", 3, oldest);
        testMList.reset();
    }

    @Test
    public void newestLessThanN() {
        testMList.add(1);
        testMList.add(2);
        testMList.add(3);
        testMList.add(4);
        testMList.add(5);
        testMList.add(6);
        int newest = testMList.getNewest();
        assertEquals("Failure - AList did not return the newest element", 6, newest);
        testMList.reset();
    }

    @Test
    public void newestGreaterThanN() {
        testMList.add(1);
        testMList.add(2);
        testMList.add(3);
        testMList.add(4);
        testMList.add(5);
        testMList.add(6);
        testMList.add(7);
        testMList.add(8);
        testMList.add(9);
        testMList.add(10);
        testMList.add(11);
        testMList.add(12);
        int newest = testMList.getNewest();
        assertEquals("Failure - AList did not return the newest element", 12, newest);
        testMList.reset();
    }


    @Test
    public void sizeTest() {
        testMList.add(1);
        testMList.add(2);
        testMList.add(3);
        testMList.add(4);
        testMList.add(5);
        testMList.add(6);
        int size = testMList.getSize();
        assertEquals("Failure - AList did not return the proper size", 6, size);
        testMList.reset();
        size = testMList.getSize();
        assertEquals("Failure - AList did not return the proper size", 0, size);

    }


    @Test
    public void testIterator() {
        testMList.add(1);
        testMList.add(2);
        testMList.add(3);
        testMList.add(4);
        testMList.add(5);
        testMList.add(6);
        testMList.add(7);
        testMList.add(8);
        testMList.add(9);
        testMList.add(10);
        testMList.add(11);
        testMList.add(12);
        testMList.iterator();
        }

    //testMList.reset();
//    }

    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        testMList.add(null);
    }



}