package algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */

    private Sort algo = new Sort();
    int[] expectedResults = new int[10];
    int[] actualResults = new int[10];
    final int max = 100;
    @Test
    public void testBubbleSort() {
        int[] array = {4, 2, 6, 12, 8, 1, 10, 5, 22, 7};
        int[] sortedArray = {1, 2, 4, 5, 6, 7, 8, 10, 12, 22};
        expectedResults = sortedArray;
        actualResults = algo.bubbleSort(array);
        Assert.assertEquals(actualResults, expectedResults);
    }
    @Test
    public void testBubketSort() {
        int[] array = {33, 25, 1, 58, 64, 95, 43, 23, 62, 32};
        int[] sortedArray = {1, 23, 25, 32, 33, 43, 58, 62, 64, 95};
        expectedResults = sortedArray;
        actualResults = algo.bucketSort(array, max);
        Assert.assertEquals(actualResults, expectedResults);
    }
    @Test
    public void testInsertSort() {
        int[] array = {4, 2, 6, 12, 8, 1, 10, 5, 22, 7};
        int[] sortedArray = {1, 2, 4, 5, 6, 7, 8, 10, 12, 22};
        expectedResults = sortedArray;
        actualResults = algo.insertSort(array);
        Assert.assertEquals(actualResults, expectedResults);
    }
    @Test
    public void testSelectionSort() {
        int[] array = {4, 2, 6, 12, 8, 1, 10, 5, 22, 7};
        int[] sortedArray = {1, 2, 4, 5, 6, 7, 8, 10, 12, 22};
        expectedResults = sortedArray;
        actualResults = algo.selectionSort(array);
        Assert.assertEquals(actualResults, expectedResults);
    }
    @Test
    public void testMergeSort() {
        int[] array = {4, 2, 6, 12, 8, 1, 10, 5, 22, 7};
        int[] sortedArray = {1, 2, 4, 5, 6, 7, 8, 10, 12, 22};
        expectedResults = sortedArray;
        actualResults = algo.mergeSort(array, array.length);
        Assert.assertEquals(actualResults, expectedResults);
    }
    @Test
    public void testQuickSort() {
        int[] array = {4, 2, 6, 12, 8, 1, 10, 5, 22, 7};
        int[] sortedArray = {1, 2, 4, 5, 6, 7, 8, 10, 12, 22};
        expectedResults = sortedArray;
        actualResults = algo.quickSort(array, 0, array.length-1);
        Assert.assertEquals(actualResults, expectedResults);
    }
    @Test
    public void testHeapSort() {
        int[] array = {4, 2, 6, 12, 8, 1, 10, 5, 22, 7};
        int[] sortedArray = {1, 2, 4, 5, 6, 7, 8, 10, 12, 22};
        expectedResults = sortedArray;
        actualResults = algo.heapSort(array);
        Assert.assertEquals(actualResults, expectedResults);
    }
    @Test
    public void testShellSort() {
        int[] array = {4, 2, 6, 12, 8, 1, 10, 5, 22, 7};
        int[] sortedArray = {1, 2, 4, 5, 6, 7, 8, 10, 12, 22};
        expectedResults = sortedArray;
        actualResults = algo.shellSort(array);
        Assert.assertEquals(actualResults, expectedResults);
    }
    /*public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below





    }*/
}
