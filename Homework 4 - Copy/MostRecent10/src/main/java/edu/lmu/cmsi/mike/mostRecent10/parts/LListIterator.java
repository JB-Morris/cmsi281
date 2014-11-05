package edu.lmu.cmsi.mike.mostRecent10.parts;

import java.lang.UnsupportedOperationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.lmu.cmsi.mike.mostRecent10.parts.LList;
import edu.lmu.cmsi.mike.mostRecent10.parts.Node;

public class LListIterator<T> implements Iterator<T>{
    private T currentComponent;
    private Node<T> node;

    public LListIterator(Node<T> node) {
        this.currentComponent = node.getValue();
        this.node = node;
    }

    public boolean hasNext() {
        return (this.node.getNext() != null);
    }

    public T next() {
        if(this.node != null && this.hasNext()) {
            node = this.node.getNext();
            return this.node.getValue();
        }
        throw new NoSuchElementException("There is no element");
    }

    public void remove() {
        throw new UnsupportedOperationException("NOPE!");
    }
}