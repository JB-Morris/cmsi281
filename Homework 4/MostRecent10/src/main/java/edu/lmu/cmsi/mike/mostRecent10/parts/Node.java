package edu.lmu.cmsi.mike.mostRecent10.parts;

public class Node<T> {

	private T component = null;
	private Node<T> next = null;
//    private Node<T> head = null;


    private Node<T> root = null;
    private T value = null;
    private int size;
    private int current = 0;
    private int subtractor = 0;


	public Node(T component) {
		this.component = component;
//        size = s;
//        int index = this.current;
	}


	public T getValue() {
		return this.value;
	}

    public Node<T> getNext() {
        return this.next;
    }

	public void setNext(Node<T> next) {
        this.next = next;
        this.current = this.current++;
        if(current > size){

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