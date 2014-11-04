package edu.lmu.cmsi.mike.mostRecent10.parts;

import java.util.Iterator;

//import edu.lmu.cmsi.mike.mostRecent10.parts.ListCommands;
//import java.lang.Object;
//import java.util.Arrays;



public class AList<T> implements Iterable<T> {

	private T[] list;
	private int current = -1;
	private int size;


	public AList(int s) {
		size = s;
        this.list = (T[])new Object[size + 1];

	}

	public void add(T e) {
		if(e == null) {
			throw new IllegalArgumentException("Cannot add null value");
		}else {
            current++;
            if (current < size) {
                this.list[current] = e;
            } else if (current >= size) {
                this.list[current] = e;
                for (int i = size; i >= 0; i--) {
                    list[current - 1] = list[current];
//                    System.out.println("i = " + i);
//                    System.out.println("size = " + size);
//                    System.out.println("current = " + current);
//                    System.out.println("Element = " + list[current]);
                    current--;
                }
            }
        }
	}


    public T getOldest() {
        if(current == -1) {
            throw new IllegalStateException("List is empty");
        }else {
            return this.list[0];
        }

    }

    public T getNewest() {
        if(current == -1){
            throw new IllegalStateException("List is empty");
        }else{
            return this.list[current];
        }
    }

    public int getSize() {
        if(current == -1) {
            throw new IllegalStateException("List is empty");
        }else {
            return current;
        }
    }

    public void reset() {
        current = -1;
    }

    public String toString() {
        String str = "";
        for(int i = 0; i <= current; i++) {
            str += list[i] + ", ";
        }
        return str;
    }


    public Iterator<T> iterator() {
        return new AListIterator<T>(list);
    }
}