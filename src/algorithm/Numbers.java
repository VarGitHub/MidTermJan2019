package algorithm;

import databases.ConnectToSqlDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		//int[] array = {4, 2, 6, 12, 8, 1, 10, 5, 7};
		int[] array = new int[100000];
		for (int i = 0; i < 100000; i++) {
			array[i] = (int) Math.round(Math.random() * 100000);
		}
		int[] sortedArray =  array.clone();
		Map<String, Long> sortTime = new HashMap<>();
		Sort algo = new Sort();
		sortedArray = algo.bubbleSort(sortedArray);
		sortTime.put("Bubble Sort", algo.executionTime);
		System.out.println(algo.executionTime);

		sortedArray = array.clone();
		sortedArray = algo.insertSort(sortedArray);
		sortTime.put("Insertion Sort", algo.executionTime);
		System.out.println(algo.executionTime);



		for (Map.Entry<String, Long> m : sortTime.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}
		//int [] num = new int[10];
		//storeRandomNumbers(num);
		//ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort

		//algo.selectionSort(num);
		//long selectionSortExecutionTime = algo.executionTime;
		//System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        //connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        //List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        //printValue(numbers);
		//int n = num.length;
		//randomize (num, n);
		//Insertion Sort
		//algo.insertionSort(num);
		//long insertionSortExecutionTime = algo.executionTime;
		//System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//By following above, Continue for rest of the Sorting Algorithm....









		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
