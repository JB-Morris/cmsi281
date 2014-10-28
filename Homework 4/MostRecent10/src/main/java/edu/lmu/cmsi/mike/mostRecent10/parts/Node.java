package edu.lmu.cmsi.mike.mostRecent10.parts;

public class Node<T> {

	private T component = null;
	private Node<T> next = null;
    private Node<T> head = null;
    private Node<T> root = null;
    private T value = null;
    private int size = null;
    private int currentIndex = 0;
    private int subtractor = 0;


	public Node(T component, int s) {
		this.component = component;
        size = s;
        int index = this.currentIndex;
	}


	public T getValue() {
		return this.value;
	}

    public Node<T> getNext() {
        return this.next;
    }

	public void setNext(Node<T> next) {
        this.next = next;
        this.currentIndex = this.currentIndex++;
        if(currentIndex > size){



        }
	}

    private static void printLinkedList(Node<T> head) {
        
    }

}