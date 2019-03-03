package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		//find lowest number from the array
		System.out.println(lowestNumber(array));
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<Integer> lowestValue = new ArrayList<Integer>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readIntegerData("tbl_lowestNumber", "column_lowestNumber");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table tbl_lowestNumber and displaying to the console");
		for(Integer st:lowestValue){
			System.out.println(st);
		}
		System.out.println(lowestNumber(lowestValue));
	}
	public static int lowestNumber(int[] arr) {
		int lowest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (lowest > arr[i])
				lowest = arr[i];
		}
		return lowest;
	}
	public static int lowestNumber(List<Integer> list) {
		int lowest = Integer.MAX_VALUE;
		for (Integer i : list) {
			if (i < lowest)
				lowest = i;
		}
		return lowest;
	}
}
