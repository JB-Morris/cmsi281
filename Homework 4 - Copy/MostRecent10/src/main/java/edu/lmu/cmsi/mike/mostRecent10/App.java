package edu.lmu.cmsi.mike.mostRecent10;

//import java.util.LinkedList;
import java.util.Iterator;

//import java.util.Scanner;

import edu.lmu.cmsi.mike.mostRecent10.parts.AList;
import edu.lmu.cmsi.mike.mostRecent10.parts.LList;
import edu.lmu.cmsi.mike.mostRecent10.parts.MyLinkedList;

import java.lang.Integer;

public class App {

    private static final int SIZE = 10;

	public static void main(String[] args) {
		System.out.println("My Array");
        AList<Integer> arr = new AList<Integer>(SIZE);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        System.out.println(arr);
        System.out.println("First = " + arr.getOldest());
        System.out.println("Last = " + arr.getNewest());
        System.out.println("Size = " + arr.getSize());
        System.out.println("Clear");
        arr.reset();

        System.out.println(arr);

        System.out.println("My Linked List");
        LList<Integer> lnk = new LList<Integer>(SIZE);
        lnk.add(1);
        lnk.add(2);
        lnk.add(3);
        lnk.add(4);
        lnk.add(5);
        lnk.add(6);
        lnk.add(7);
        lnk.add(8);
        lnk.add(9);
        lnk.add(10);
        lnk.add(11);
        lnk.add(12);
        System.out.println(lnk);

        System.out.println("First = " + lnk.getFirst());
        System.out.println("Last = " + lnk.getLast());
        System.out.println("Size = " + lnk.getSize());
        System.out.println("Clear");
        lnk.reset();
        System.out.println(lnk);

        System.out.println("Java Linked List");
        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>(SIZE);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);

        System.out.println(linkedList);
        System.out.println("First = " + linkedList.getOldest());
        System.out.println("Last = " + linkedList.getNewest());
        System.out.println("Size = "  + linkedList.getSize());
        System.out.println("Clear");
        linkedList.reset();
        System.out.println(linkedList);








	}

}