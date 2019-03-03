package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();

		names.add("Jerry Seinfeld");
		names.add("Elaine Benes");
		names.add("George Costanza");
		names.add("Cosmo Kramer");
		names.add("Newman");

		numbers.add(34);
		numbers.add(9);
		numbers.add(231);
		numbers.add(65);
		numbers.add(92);

		for (String s : names) {
			System.out.println(s);
		}
		for (Integer i : numbers) {
			System.out.println(i);
		}
		Collections.sort(names);
		for (String s : names) {
			System.out.println(s);
		}
		Collections.sort(numbers);
		for (Integer i : numbers) {
			System.out.println(i);
		}
		System.out.println(names.get(3));
		numbers.remove(1);
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
