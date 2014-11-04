package edu.lmu.cmsi.mike.mostRecent10;

import java.util.ArrayList;
import java.util.Iterator;

//import java.util.Scanner;

import edu.lmu.cmsi.mike.mostRecent10.parts.AList;
import edu.lmu.cmsi.mike.mostRecent10.parts.LList;

import java.lang.Integer;

public class App {

// 	//private Scanner keyboard = null;

// 	public App() {
// 		//System.out.println("Add element")
// 		new AList(10);

// 	}

	public static void main(String[] args) {
		System.out.println("Array");
        AList<Integer> arr = new AList<Integer>(10);
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
//        arr.add(12);
        System.out.println(arr);
        System.out.println("LinkedList");
        LList<Integer> lnk = new LList<Integer>(10);
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
        System.out.println(lnk);
        System.out.println("Array List");
        ArrayList<Integer> arrLst = new ArrayList<Integer>();






	}

}