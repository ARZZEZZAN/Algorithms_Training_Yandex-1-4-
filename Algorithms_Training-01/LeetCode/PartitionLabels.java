package LeetCode;

import java.util.*;

public class PartitionLabels {

    public static void main(String[] args) {
        System.out.println(partitionLabels("abcdahck"));
    }

    public static List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> characters = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            characters.put(c, i);
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, characters.get(s.charAt(i)));

            if (end == i) {
                list.add(end - start);
                start = end + 1;
            }
        }

        return list;
    }
}
