package LeetCode;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedHashSet;

public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int length = s.length();

        int a = 0;
        int b = length - 1;
        while (a < b) {
            char first = s.charAt(a);
            char last = s.charAt(b);
            if (!Character.isLetterOrDigit(first)) {
                if (!Character.isLetterOrDigit(last)) b--;
                a++;
                continue;
            }

            if (!Character.isLetterOrDigit(last)) {
                b--;
                continue;
            }

            if (first != ' ' && last != ' ' && first != last) {
                return false;
            }

            a++;
            b--;
        }

        return true;
    }
}
