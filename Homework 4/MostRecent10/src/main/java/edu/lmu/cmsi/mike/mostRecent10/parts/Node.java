package edu.lmu.cmsi.mike.mostRecent10.parts;

public class Node<T> {

	private T component = null;
	private Node<T> next = null;
    private T value = null;
    private int size = -1;


	public Node(T component, int s) {
		this.component = component;
        size = s;
	}


	public T getValue() {
		return this.value;
	}

    public Node<T> getNext() {
        return this.next;
    }

	public void setNext(Node<T> next) {

        this.next = next;
	}

	public void addComponent(Node<T> T) {

	}

}