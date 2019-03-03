package string.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String str = "ABC";
        Set<String> s = generatePerm(str);
        for (String word : s) {
            System.out.println(word);
        }
    }
    public static Set<String> generatePerm(String input) {
           Set<String> set = new HashSet<String>();
            if (input == "")
                return set;
            Character a = input.charAt(0);
        if (input.length() > 1) {
            input = input.substring(1);
            Set<String> permSet = generatePerm(input);
            for (String x : permSet) {
                for (int i = 0; i <= x.length(); i++) {
                    set.add(x.substring(0, i) + a + x.substring(i));
                }
            }
        }
        else {
            set.add(a + "");
        }
        return set;
    }
}
