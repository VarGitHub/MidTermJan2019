package string.problems;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> m = checkDuplictaes(st);
        Set<String> duplicateWords = m.keySet();
        for (String str : duplicateWords) {
            if (m.get(str) > 1)
                System.out.println("Word " + str + " was repeated " + m.get(str) + " times" );
        }
    }
    public static Map<String, Integer> checkDuplictaes(String input) {
        String[] words = input.split("\\s+");
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String s : words){
            if (wordsMap.get(s) != null)
                wordsMap.put(s, wordsMap.get(s)+1);
            else
                wordsMap.put(s, 1);
        }
        return wordsMap;
    }
}
