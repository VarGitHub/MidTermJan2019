package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>>  foodGroups = new LinkedHashMap<>();

		List<String> fruits = new ArrayList<>();
		fruits.add("Apples");
		fruits.add("Mangoes");
		fruits.add("Bananas");
		fruits.add("Pears");

		List<String> vegetables = new ArrayList<>();
		vegetables.add("Potatoes");
		vegetables.add("Bell pepperers");
		vegetables.add("Spinch");

		foodGroups.put("Fruits", fruits);
		foodGroups.put("Vegetables", vegetables);

		Iterator itr = foodGroups.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry map = (Map.Entry) itr.next();
			System.out.println(map.getKey() + " " + map.getValue());
		}
		System.out.println();
		for (Map.Entry m : foodGroups.entrySet())
			System.out.println(m.getKey() + " " + m.getValue());
	}

}
