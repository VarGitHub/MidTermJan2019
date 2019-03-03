package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        System.out.println(lowestDifference(array1, array2));
    }
    public static int lowestDifference(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int lowestDiff = Integer.MAX_VALUE;
        if (arr1.length > arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (lowestDiff > Math.abs(arr1[j] - arr2[i]))
                        lowestDiff = Math.abs(arr1[j] - arr2[i]);
                }
            }
        }
        else {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (lowestDiff > Math.abs(arr1[j] - arr2[i]))
                        lowestDiff = Math.abs(arr1[j] - arr2[i]);
                }
            }
        }
        return lowestDiff;
    }
}
