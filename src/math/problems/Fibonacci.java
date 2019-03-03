package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n = 7;
        System.out.println("Fibonacci sequence of number " + n + " using recursion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(getFibonacci(i) + " "); }
    }
    public static int getFibonacci(int n) {
        if (n == 0) { return 0; }
        if (n == 1) { return 1; }
        if (n == 2) { return 1; }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
