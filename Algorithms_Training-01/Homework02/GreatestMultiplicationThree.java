package Homework02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GreatestMultiplicationThree {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        String input = sScanner.nextLine();
        String[] numsLine = input.split(" ");

        ArrayList<Integer> nums = new ArrayList<>();
        for (String element : numsLine) {
            nums.add(Integer.parseInt(element));
        }

        greatestMultiplication(nums);
    }

    public static void greatestMultiplication(ArrayList<Integer> nums) {
        Collections.sort(nums);

        if (nums.size() <= 3) {
            printAnswer(nums);
            return;
        }

        long resultPlus = 0;
        long resultMinus = 0;

        ArrayList<Integer> result = new ArrayList<>(2);

        int lastIndex = nums.size() - 1;
        resultPlus = Math.multiplyExact(Long.valueOf(nums.get(lastIndex)), Long.valueOf(nums.get(lastIndex - 1)));
        resultMinus = Math.multiplyExact(Long.valueOf(nums.get(0)), Long.valueOf(nums.get(1)));

        resultPlus = Math.multiplyExact(resultPlus, Long.valueOf(nums.get(lastIndex - 2)));
        resultMinus = Math.multiplyExact(resultMinus, Long.valueOf(nums.get(lastIndex)));

        if (resultPlus > resultMinus) {
            result.add(nums.get(lastIndex - 2));
            result.add(nums.get(lastIndex - 1));
            result.add(nums.get(lastIndex));
        } else {
            result.add(nums.get(lastIndex));
            result.add(nums.get(0));
            result.add(nums.get(1));
        }

        printAnswer(result);
    }
    public static void printAnswer(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (i != nums.size() - 1) {
                System.out.print(nums.get(i) + " ");
            } else {
                System.out.println(nums.get(i));
            }
        }
    }
}
