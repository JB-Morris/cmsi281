package edu.lmu.cmsi.mike.mostRecent10.parts;

import edu.lmu.cmsi.mike.mostRecent10.parts.ListCommands;

public class AList<T>  implements ListCommands {

	T[] list;
	int current = -1;
	int size;

	public AList(int s) {
		size = s - 1;
//		list = new T[size];
	}

	public void Add(T e) {
		if(e == null) {
			throw new IllegalArgumentException("Cannot add null value");
		}
		current++;
		if(current <= size) {
			list[current] = e;
		}else if (current > size) {
            current--;
            //T temp[] = new temp[size];
            //T temp;
        }
        for(int i = 0; i < size; i++) {
            //temp = list[0];
            list[i] = list[i + 1];
        }
        list[current] = e;
	}


    public T getOldest() {
        if(current == -1) {
            throw new IllegalStateException("List is empty");
        }else {
            return list[0];
        }

    }

    public T getNewest() {
        if(current == -1){
            throw new IllegalStateException("List is empty");
        }else{
            return list[current];
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