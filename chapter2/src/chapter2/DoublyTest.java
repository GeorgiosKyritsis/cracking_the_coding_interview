package chapter2;

import java.util.Iterator;

public class DoublyTest {

	public static void main(String[] args) {

		DoublyLinkedList ls = new DoublyLinkedList();
		ls.addFirst(1);
		ls.addFirst(2);
		ls.addFirst(10);
		ls.addLast(10);
		ls.addLast(100);
		System.out.println(ls.contains(100));
		ls.printList();
		System.out.println();
		System.out.println("Iterable");
		
		Iterator<Integer> it = ls.iterator();
		
		for(int i: ls)
		{
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Iterator");
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ls.removeFirst();
		
		System.out.println();
		for(int i: ls)
		{
			System.out.println(i);
		}

		ls.removeLast();
		
		System.out.println();
		for(int i: ls)
		{
			System.out.println(i);
		}

	}

}
