package chapter2;

import java.util.LinkedList;

public class Tester {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer> ();
		ls.add(10);
		ls.add(100);
		ls.add(10);
		ls.add(3);
		ls.add(4);
		ls.add(3);
		ls.add(3);
		ls.add(4);
		ls.add(400);
		System.out.println(ls.toString());
		removeDuplicates.removeDups(ls);
		System.out.println(ls.toString());
		
	}

}
