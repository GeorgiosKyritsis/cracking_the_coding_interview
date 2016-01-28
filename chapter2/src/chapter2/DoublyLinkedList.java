package chapter2;

import java.util.Iterator;

public class DoublyLinkedList implements Iterable<Integer>{
	
	private class Node {
		int data;
		Node previous;
		Node next;
		
		public Node() {
			data = 0;
			previous = null;
			next = null;
		}
		
		public Node(int e) {
			this.data = e;
			this.previous = null;
			this.next = null;
		}
		
		public Node(int e, Node previous, Node next) {
			this.data = e;
			this.previous = previous;
			this.next = next;
		}
	}
	
	//instance variables
	private Node header;
	private Node tail;
	private int length;
	
	public DoublyLinkedList() {
		header = new Node();
		tail = new Node();
		header.next = tail;
		tail.previous = header;
	}
	
	public DoublyLinkedList(int e) {
		
		header = new Node();
		tail = new Node();
		
		Node newNode = new Node(e);
		header.next = newNode;
		tail.previous = newNode;
		length = 1;
	}
	
	public void addFirst(int e) {
		if (length == 0) 
		{
			Node newNode = new Node(e, header, tail);
			header.next = newNode;
			tail.previous = newNode;
			length++;
		}
		else
		{
			Node firstNode = header.next;
			Node newNode = new Node(e, header, firstNode);
			header.next = newNode;
			firstNode.previous = newNode;
			length++;
		}
	}
	
	public void addLast(int e) {
		if (length == 0) 
		{
			Node newNode = new Node(e, header, tail);
			header.next = newNode;
			tail.previous = newNode;
			length++;
		}
		else
		{
			Node lastNode = tail.previous;
			Node newNode = new Node(e, lastNode, tail);
			tail.previous = newNode;
			lastNode.next = newNode;
			length++;
		}
	}
	
	public void removeFirst() {
		if (length == 0)
			return;
		else
		{
			Node firstNode = header.next;
			header.next = firstNode.next;
			firstNode.next.previous = header;
		}
		length--;
	}
	
	public void removeLast() {
		if (length == 0)
			return;
		else
		{
			Node lastNode = tail.previous;
			tail.previous = lastNode.previous;
			lastNode.previous.next = tail;
		}
		length--;
	}
	
	public boolean contains(int e) {
		Node temp = header.next;
		if (length == 0)
			return false;
		else
		{
			do {
				if (temp.data == e)
					return true;
				temp = temp.next;
			} while (temp.next != null) ;
		}
		return false;
	}
	
	public void printList() {
		Node temp = header.next;
		do {
			System.out.print("{" + temp.data + "}");
			temp = temp.next;
		} while (temp.next != null) ;
	}
	
	
	public Iterator<Integer> iterator() {
		return new ListIterator();
	}
	
	public class ListIterator implements Iterator<Integer> {

		private int index;
		private Node n = header;
		
		@Override
		public boolean hasNext() {
			return index < length;
		}

		@Override
		public Integer next() {
			n = n.next;
			index++;
			return n.data;
		}
		
	}
	
}
