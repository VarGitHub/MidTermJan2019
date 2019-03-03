package math.problems;

import org.testng.annotations.Test;
import org.testng.*;

public class UnitTestingMath {

    @Test
    public void testFactorial() {
        int num = 5;
        int actualResult = 0;
        int expectedResult = 120;
        actualResult = Factorial.factorialRecursive(num);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testFibonacci() {
        int num = 7;
        int actualResult = 0;
        int expectedResult = 13;
        actualResult = Fibonacci.getFibonacci(num);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testLowestDifference() {
        int[] arr1 = {30,12,5,9,2,20,33,1};
        int[] arr2 = {18,25,41,47,17,36,14,19};
        int expectedResult = 1;
        int actualResult = FindLowestDifference.lowestDifference(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testMissingNumber() {
        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int expectedResult = 9;
        int actualResult = FindMissingNumber.missingNumber(array);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testLowestNumber() {
        int[] array = {345, 653, 34, 98, 456, 98, 245, 17, 45, 23, 98};
        int expectedResult = 17;
        int actualResult = LowestNumber.lowestNumber(array);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testPrimeNumber() {
        int n = 17;
        boolean expectedResult = true;
        boolean actualResult = PrimeNumber.isPrime(n);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
