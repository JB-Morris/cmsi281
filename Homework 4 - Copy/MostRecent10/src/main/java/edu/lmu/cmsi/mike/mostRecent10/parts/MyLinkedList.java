package edu.lmu.cmsi.mike.mostRecent10.parts;

import java.lang.IllegalArgumentException;
import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.LinkedList;


public class MyLinkedList<T> implements Iterable<T> {
        private int size;
        private LinkedList<T> mList;

        public MyLinkedList(int s) {
        size = s;
        this.mList = new LinkedList<T>();
        }

        public T getOldest() {
            return mList.peekFirst();

        }

        public T getNewest() {
            return mList.peekLast();

        }

        public void add(T e) {
            if(e == null) {
                throw new IllegalArgumentException("Cannot add null value");
            }
            mList.add(e);
            while(mList.size() > size) {
            mList.removeFirst();
            }


        }
        public int getSize() {
            return mList.size();

        }
        public void reset() {
            mList.clear();

        }

    public Iterator<T> iterator() {
        return mList.listIterator(0);

    }

    public String toString() {
        String str = "";
        for(int i = 0; i < mList.size(); i++) {
            str += mList.get(i) + ", ";
        }
        return str;
    }


}