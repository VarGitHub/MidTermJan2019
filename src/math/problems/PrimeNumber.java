package math.problems;
import java.util.ArrayList;
import java.util.List;
public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int number = (int) Math.round(Math.random() * 1000000);
		List<Integer> primeNumbers = new ArrayList<>();
		for (int i = 1; i < number; i++) {
			if (isPrime(i))
				primeNumbers.add(i);
		}
		System.out.println("Prime number from 1 to " + number + ": ");
		for (Integer p : primeNumbers) {
			System.out.print(p + " ");
		}
	}
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int j = 2; j < n/2; j++ ) {
			if (n % j == 0) {
				isPrime = false;
				break; }
		}
		return isPrime;
	}
}
