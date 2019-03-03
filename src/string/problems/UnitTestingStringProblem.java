package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class UnitTestingStringProblem {

    private Anagram anagram = new Anagram();
    private Permutation permutation = new Permutation();
    private DuplicateWord dup = new DuplicateWord();
    private DetermineLargestWord large = new DetermineLargestWord();
    private String wordPalindrome = "";
    private boolean eResult, aResult;

    @Test
    public void testPalindrome() {
        wordPalindrome = "madam";
        eResult = true;
        aResult = Palindrome.isPalindrome(wordPalindrome);
        Assert.assertEquals(aResult, eResult);
    }
    @Test
    public void testPermutations() {
        Set<String> str1, str2 = new HashSet<>();
        str2.add("ACB");
        str2.add("BCA");
        str2.add("ABC");
        str2.add("CBA");
        str2.add("BAC");
        str2.add("CAB");
        str1 = Permutation.generatePerm("ABC");
        eResult = true;
        aResult = str1.equals(str2);
        Assert.assertEquals(aResult, eResult);
    }
    @Test
    public void testLargestWord() {
        Map<Integer, String> m1, m2 = new HashMap<>();
        m2.put(10, "biological");
        m1 = DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        eResult = true;
        aResult = m1.equals(m2);
        Assert.assertEquals(aResult, eResult);
    }
    @Test
    public void testDuplicates() {
        Map<String, Integer> m1, m2 = new HashMap<>();
        String s = "one two one";
        m2.put("one", 2);
        m2.put("two", 1);
        eResult = true;
        m1 = DuplicateWord.checkDuplictaes(s);
        aResult = m1.equals(m2);
        Assert.assertEquals(aResult, eResult);
    }
    @Test
    public void testAnagrams() {
        String s1 = "CAT", s2 = "ACT";
        eResult = true;
        aResult = Anagram.areAnagrams(s1, s2);
        Assert.assertEquals(aResult, eResult);
    }
}


