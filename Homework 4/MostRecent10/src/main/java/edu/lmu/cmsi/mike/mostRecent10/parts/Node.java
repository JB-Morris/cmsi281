package edu.lmu.cmsi.mike.mostRecent10.parts;

public class Node<T> {

	private T component = null;
	private Node<T> next = null;
    private T value = null;

	public Node(T component) {
		this.component = component;
	}

	public T getValue() {
		return this.value;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public void addComponent(Node<T> T) {

	}

}