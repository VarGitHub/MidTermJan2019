package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        for (Map.Entry m : wordNLength.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] strings = wordGiven.split(" ");
        //implement
        String large = "";
        for (int i =0; i < strings.length; i++) {
            if (strings[i].length() > large.length())
                large = strings[i];
        }
        map.put(large.length(), large);
        return map;
    }
}
