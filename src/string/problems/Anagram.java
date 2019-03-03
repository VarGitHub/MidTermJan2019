package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String word1 = "CAT";
        String word2 = "ACT";
        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();
        if (areAnagrams(word1, word2))
            System.out.println("The two words are anagrams");
        else
            System.out.println("Not anagrams");
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0;i < str1.length();i++){
            if (charArray1[i] != charArray1[i])
                return false;
        }
        return true;
    }
}
