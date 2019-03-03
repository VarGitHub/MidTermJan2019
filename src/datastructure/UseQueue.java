package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> q = new LinkedList<>();

		q.add("one");
		q.add("two");
		q.add("three");
		q.add("four");
		q.add("five");

		System.out.println("Head: " + q.peek());
		System.out.println("Removed element: " + q.remove());
		System.out.println("Polled element: " + q.poll());

		Iterator itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		for (String s : q)
			System.out.println(s);
	}

}
