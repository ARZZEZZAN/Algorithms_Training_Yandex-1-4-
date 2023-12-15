package Homework02;

import java.util.ArrayList;
import java.util.Scanner;

public class MonotonicallyIncreasing {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        String input = sScanner.nextLine();

        String[] numbers = input.split(" ");

        for (String number : numbers) {
            try {
                nums.add(Integer.parseInt(number));
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println(monotonicallyIncreasing(nums));
    }

    public static String monotonicallyIncreasing(ArrayList<Integer> nums) {
        int num = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > num) {
                num = nums.get(i);
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
