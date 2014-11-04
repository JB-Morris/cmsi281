package edu.lmu.cmsi.mike.mostRecent10.parts;


public class Node<T>{

	private T component = null;
	private Node<T> next = null;
//    private Node<T> head = null;


    private Node<T> root = null;
    private T value = null;
    private int size;
    private int counter = 0;
    private int subtractor = 0;


	public Node(T component) {
		this.component = component;
//        size = s;
//        int index = this.counter;
	}


	public T getValue() {
		return this.component;
	}

    public Node<T> getNext() {
        return this.next;
    }

	public void setNext(Node<T> next) {
        this.next = next;
        this.counter = this.counter++;
        if(counter > size){

        }
	}

    private void printLList(Node<T> head) {
        Node<T> current = head;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}