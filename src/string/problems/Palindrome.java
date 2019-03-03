package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String wordOne = "racecar";
        String wordTwo = "anything";
        String wordThree = "Madam";
        String wordFour = "super";

        System.out.println(isPalindrome(wordOne));
        System.out.println(isPalindrome(wordTwo));
        System.out.println(isPalindrome(wordThree));
        System.out.println(isPalindrome(wordFour));
    }
    public static boolean isPalindrome(String word) {
        String actualWord = word.toLowerCase();
        String reverseWord = "";
        for (int i = actualWord.length()-1; i >=0; i--)
            reverseWord = reverseWord + actualWord.charAt(i);
        return (actualWord.equals(reverseWord));
    }
}
