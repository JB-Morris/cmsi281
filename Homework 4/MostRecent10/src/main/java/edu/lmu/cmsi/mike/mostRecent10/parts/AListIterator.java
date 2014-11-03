package edu.lmu.cmsi.mike.mostRecent10.parts;

import java.util.Iterator;

public class AListIterator<T> implements Iterator<T> {
    private E object;
    private T currentObj = 0;

    public JListIterator(T obj) {
        this.object = obj;
    }

    public bolean hasNext() {
        if(this.currentObj == 1) {
            return this.object;
        }
    }

}