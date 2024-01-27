package Homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOfSets {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        HashMap<Integer, Integer> numbers = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        String input = sScanner.nextLine();
        for (String num : input.split(" ")) {
            numbers.put(Integer.valueOf(num), 1);
        }

        String input1 = sScanner.nextLine();
        for (String num : input1.split(" ")) {
            Integer key = Integer.valueOf(num);
            Integer value = numbers.compute(key, (k, v) -> v != null ? v + 1 : null);
            if (value != null && value > 1) {
                result.add(key);
            }
        }

        result.forEach(str -> System.out.print(str + " "));
    }
}
