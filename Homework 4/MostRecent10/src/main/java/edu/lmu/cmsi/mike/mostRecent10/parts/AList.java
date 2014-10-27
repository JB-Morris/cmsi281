package edu.lmu.cmsi.mike.mostRecent10.parts;

//import edu.lmu.cmsi.mike.mostRecent10.parts.ListCommands;
//import java.lang.Object;
//import java.util.Arrays;

import java.lang.SuppressWarnings;

public class AList<T>  /*implements ListCommands*/ {

	private T[] list;
	private int current = -1;
	private int size;

	public AList(Class<T> a, int s) {
		size = s - 1;
//		final T[] list = (T[]) Array.newInstance(a, size);
//      this.list = list;
//      @SuppressWarnings("unchecked");
//      this.list = new T[size];
        this.list = (T[])new Object[size];

	}

	public void Add(T e) {
		if(e == null) {
			throw new IllegalArgumentException("Cannot add null value");
		}
		current++;
		if(current <= size) {
			this.list[current] = e;
		}else if (current > size) {
            current--;
            //T temp[] = new temp[size];
            //T temp;
        }
        for(int i = 0; i < size; i++) {
            //temp = list[0];
            this.list[i] = this.list[i + 1];
        }
        this.list[current] = e;
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




}