package math.problems;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
            printPyramid(6);

        }
        public static void printPyramid(int n) {
             Map<String, String> pattern = new HashMap<>();
             for (int i = n, j = 1; i > 0; i--, j++) {
                printSpaces(i, j);
                printStars(j, 1);
                System.out.println();}
             }
        public static void printSpaces(int n, int j) {
            if (n == 1)
                return;
            System.out.print(" ");
            printSpaces(n-1, j);

        }
        public static void printStars(int n, int count){
            if (count > n)
                return;
            System.out.print("* ");
            printStars(n, count+1);
        }
  }
