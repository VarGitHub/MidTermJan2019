package algorithm;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		Connection connect = null;
		PreparedStatement ps = null;
		final int maxVal = 100000;
		int fastest = Integer.MAX_VALUE;
		String fastestSort = "";
		int[] array = new int[100000];
		for (int i = 0; i < 100000; i++) {
			array[i] = (int) Math.round(Math.random() * 100000);
		}
		int[] sortedArray =  array.clone();
		Map<String, Integer> sortTime = new HashMap<>();
		Sort algo = new Sort();

		//Bubble sort
		sortedArray = algo.bubbleSort(sortedArray);
		sortTime.put("Bubble Sort", algo.executionTime);

		//Insertion sort
		sortedArray = array.clone();
		sortedArray = algo.insertSort(sortedArray);
		sortTime.put("Insertion Sort", algo.executionTime);

		//Selection sort
		sortedArray = array.clone();
		sortedArray = algo.selectionSort(sortedArray);
		sortTime.put("Selection Sort", algo.executionTime);

		//Merge sort
		sortedArray = array.clone();
		sortedArray = algo.mergeSort(sortedArray, sortedArray.length);
		sortTime.put("Merge Sort", algo.executionTime);

		//Quick sort
		sortedArray = array.clone();
		sortedArray = algo.quickSort(sortedArray, 0, sortedArray.length-1);
		sortTime.put("Quick Sort", algo.executionTime);

		//Heap Sort
		sortedArray = array.clone();
		sortedArray = algo.heapSort(sortedArray);
		sortTime.put("Heap Sort", algo.executionTime);

		//Shell sort
		sortedArray = array.clone();
		sortedArray = algo.shellSort(sortedArray);
		sortTime.put("Shell Sort", algo.executionTime);

		//Bucket sort
		sortedArray = array.clone();
		sortedArray = algo.bucketSort(sortedArray, maxVal);
		sortTime.put("Bucket Sort", algo.executionTime);

		for (Map.Entry<String, Integer> m : sortTime.entrySet()) {
			if (m.getValue() < fastest) {
				fastest = m.getValue();
				fastestSort = m.getKey();}
			System.out.println(m.getKey() + " for 100000 took " + m.getValue() + " Milli seconds");
		}

		System.out.println("Fastest sorting algorithm is: " + fastestSort + " with " + fastest + " milliseconds for 100000 numbers");
		//Write the execution times to MySql table
		try {
			connect = connectToSqlDB.connectToSqlDatabase();
			ps = connect.prepareStatement("DROP TABLE IF EXISTS `ExecTimes`;");
			ps.executeUpdate();
			ps = connect.prepareStatement("CREATE TABLE `ExecTimes` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortAlgorithm` varchar(50) DEFAULT NULL, `ExecTime` int(255), PRIMARY KEY (`ID`) );");
			ps.executeUpdate();
			for (Map.Entry<String, Integer> m : sortTime.entrySet()){
				ps = connect.prepareStatement("INSERT INTO ExecTimes (SortAlgorithm, ExecTime)" + "VALUES(?, ?)");
				ps.setString(1, m.getKey());
				ps.setInt(2, m.getValue());
				ps.executeUpdate();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/*int[] array1 = {4, 2, 30, 6, 14, 8, 1, 10, 5, 7};
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");}*/
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
