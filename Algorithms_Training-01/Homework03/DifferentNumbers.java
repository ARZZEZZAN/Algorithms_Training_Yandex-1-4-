package Homework03;

import java.util.HashMap;
import java.util.Scanner;

public class DifferentNumbers {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        String input = sScanner.nextLine();
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (String num : input.split(" ")) {
            numbers.compute(Integer.valueOf(num), (key, value) -> value != null ? value + 1 : 1);
        }

        System.out.println(numbers.size());
    }

}
