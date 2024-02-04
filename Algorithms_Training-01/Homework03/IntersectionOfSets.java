package Homework03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfSets {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        Set<Integer> numbers = new TreeSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        String input = sScanner.nextLine();
        for (String num : input.split(" ")) {
            numbers.add(Integer.valueOf(num));
        }

        String input1 = sScanner.nextLine();
        for (String num : input1.split(" ")) {
            Integer value = Integer.valueOf(num);
            if (!numbers.add(Integer.valueOf(num))) {
                result.add(value);
            }
        }

        Collections.sort(result);
        result.forEach(str -> System.out.print(str + " "));
    }
}
