package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean result = isAnagram("car", "rat");
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.compare(sChar, tChar) == 0;
    }
}
