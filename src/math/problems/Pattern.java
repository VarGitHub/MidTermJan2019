package math.problems;
import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		List<Integer> list = new ArrayList<>();
		list = numPattern(100);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}
	public static List<Integer> numPattern(int n) {
		int count = 1;
		List<Integer> numList = new ArrayList<>();
		numList.add(n);
		for (int i = 0; i < 10; i++) {
			for (int j =0; j < 10; j++) {
				n = n-count;
				if ( n < 0)
					break;
				numList.add(n);
			}
			count++;
		}
		return numList;
	}
}
