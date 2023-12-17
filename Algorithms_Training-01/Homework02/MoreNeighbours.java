package Homework02;

import java.util.ArrayList;
import java.util.Scanner;

public class MoreNeighbours {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        String input = sScanner.nextLine();
        String[] output = input.split(" ");

        for(String s : output) {
            nums.add(Integer.parseInt(s));
        }

        System.out.println(moreNeighbours(nums));

    }

    public static int moreNeighbours(ArrayList<Integer> nums) {
        if (nums.size() < 3) {
            return 0;
        }

        int result = 0;

        for (int i = 1; i < nums.size() - 1; i++) {
            if(nums.get(i-1) < nums.get(i) && nums.get(i+1) < nums.get(i)) {
                result++;
            }
        }

       return result;
    }
}
