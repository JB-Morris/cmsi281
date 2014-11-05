package edu.lmu.cmsi.mike.mostRecent10.parts;

import java.lang.UnsupportedOperationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.lmu.cmsi.mike.mostRecent10.parts.AList;

public class AListIterator<T> implements Iterator<T> {
    private T[] aList;
    private int currentComponent = 0;


    public AListIterator(T[] lst) {
        this.aList = lst;
    }

    public boolean hasNext() {
        if(this.aList[currentComponent] == null) {
            return false;
        }
        else if (this.aList[currentComponent] != null){
            return true;
        }
        //to fix error
        return false;
    }

    public T next() {
        if(this.aList[currentComponent + 1] != null) {
            this.currentComponent++;
            return this.aList[currentComponent];

        }
        else if(this.aList[currentComponent + 1] == null) {
            throw new NoSuchElementException("There is no element");
        }
        //fix error
        return this.aList[currentComponent];
    }

    public void remove() {
        throw new UnsupportedOperationException("NOPE!");
    }
}