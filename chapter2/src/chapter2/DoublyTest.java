package chapter2;

public class DoublyTest {

	public static void main(String[] args) {

		DoublyLinkedList ls = new DoublyLinkedList();
		ls.addFirst(1);
		ls.addFirst(2);
		ls.addFirst(10);
		ls.addLast(10);
		ls.addLast(100);
		ls.addFirst(10);
		ls.addFirst(3);
		ls.addLast(3);
		ls.addLast(4);
		ls.addFirst(3);
		ls.addFirst(3);
		ls.addFirst(3);
		ls.printList();
		ls.removeDuplicates();
		System.out.println();
		ls.printList();
		

	}

}
