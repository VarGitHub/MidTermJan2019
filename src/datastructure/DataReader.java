package datastructure;

import java.io.*;
import java.util.*;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		// textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		File file = new File("/Users/varija/Documents/Selenium/MidtermJanuary2019/src/data/self-driving-car");
		String line = null;
		ArrayList<String> words = new ArrayList<>();
		Stack<String> stack = new Stack<>();
		LinkedList<String> list = new LinkedList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			while ((line = br.readLine()) != null) {
				String[] s = line.split("[ ,.!]+");
				Collections.addAll(words, s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String str : words) {
			stack.add(str);
			list.add(str);
		}
		System.out.println(stack.peek());
		System.out.println(list.peek());
		//printStack(stack);
		/*System.out.println();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i)+ " ");*/
	}
	public static void printStack(Stack<String> st) {
		if (st.isEmpty())
			return;
		String word = st.pop();
		System.out.print(word + " ");
		printStack(st);
		st.push(word);
	}
}
