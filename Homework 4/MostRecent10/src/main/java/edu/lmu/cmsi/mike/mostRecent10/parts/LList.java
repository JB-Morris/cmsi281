package edu.lmu.cmsi.mike.mostRecent10.parts;

import edu.lmu.cmsi.mike.mostRecent10.parts.Node;

public class LList<T> {

    private Node head;
    private int counter;
    private int size;

    public LList(int s) {
        head = new Node(null);
        counter = 0;
        size = s;
    }

    public void add(T component) {
        Node temp = new Node(component);
        Node current = head;
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
    public Object getLast() {
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    public Object getFirst() {
        return head.getNext();

    }

    public int getSize() {
        return counter;
    }

    public void reset() {
        head.setNext(null);
    }

    private void trim() {
        head.setNext(head.getNext().getNext());
    }




}

