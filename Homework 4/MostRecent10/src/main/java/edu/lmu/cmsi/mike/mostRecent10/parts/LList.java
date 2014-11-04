package edu.lmu.cmsi.mike.mostRecent10.parts;

import edu.lmu.cmsi.mike.mostRecent10.parts.Node;
import java.util.Iterator;

public class LList<T> implements Iterable<T>{

    private Node<T> head;
    private int counter;
    private int size;

    public LList(int s) {
        head = new Node<T>(null);
        counter = 0;
        size = s;
    }

    public void add(T component) {
        Node<T> temp = new Node<T>(component);
        Node<T> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        counter++;
        if(counter > size) {
            trim();
            counter--;
        }

    }
    public T getLast() {
        Node<T> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public T getFirst() {
        return head.getNext().getValue();

    }

    public int getSize() {
        return counter;
    }

    public void reset() {
        head.setNext(null);
    }
    public Iterator<T> iterator() {
        return new LListIterator<T>(head);
    }

    public String toString() {
        String str = "";
        Node current = this.head;
        while(current.getNext() != null) {
            current = current.getNext();
            str += current.getValue() + ", ";
        }
        return str;
    }

    private void trim() {
        head.setNext(head.getNext().getNext());
    }




}

